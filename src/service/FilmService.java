package service;

import domain.Film;
import domain.FilmValidator;
import repo.FilmRepo;

import java.util.ArrayList;
import java.util.List;

public class FilmService {

    private FilmRepo filmRepo;
    private FilmValidator filmValidator;

    private List<List<Film>> undoList;

    public FilmService(FilmRepo filmRepo, FilmValidator filmValidator) {

        this.filmRepo = filmRepo;
        this.filmValidator = filmValidator;
        this.undoList = new ArrayList<>();

    }

/*    private Integer idFilm;
    private String titluFilm;
    private Integer anFilm;
    private double pretFilm;
    private boolean inProgram;*/

    public void addFilm(Integer idFilm, String titluFilm, Integer anFilm, double pretFilm, boolean inProgram) {

        Film film = new Film(idFilm, titluFilm, anFilm, pretFilm, inProgram);
        this.filmValidator.valideaza(film);

        List<Film> copyFilm = new ArrayList<>(getAll());

        this.undoList.add(copyFilm);

        Film adaugat = this.filmRepo.addFilm(film);

        if (adaugat == null) {
            throw new IllegalArgumentException("Exista deja un film cu id-ul: " + idFilm);
        }
    }


    public void updateFilm(Film filmDateNoi) {

        List<Film> copyFilm = new ArrayList<>(getAll());

        this.undoList.add(copyFilm);

        Film update = this.filmRepo.updateFilm(filmDateNoi);

        if (update == null) {
            throw new IllegalArgumentException("Nu exista un film cu id-ul: " + filmDateNoi.getIdFilm());
        }
    }

    public List<Film> getAll() {
        return this.filmRepo.getAll();
    }

    public void undo() {
        if (this.undoList.size() > 0) {
            List<Film> previous = this.undoList.remove(undoList.size() - 1);
            this.filmRepo.replaceFilme(previous);
        }
    }




}
