package repo;

import domain.Film;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FilmRepo {

    private List<Film> filme = new ArrayList<>();


    public Film addFilm(Film filmDeAdaugat) {

        Film existent = this.findById(filmDeAdaugat.getIdFilm());
        if (existent == null) {
            this.filme.add(filmDeAdaugat);
            return (filmDeAdaugat);
        }
        return null;
    }

    public Film updateFilm(Film filmPtUpdate) {

        Film existent = this.findById(filmPtUpdate.getIdFilm());

        if (existent != null) {

            existent.setTitluFilm(filmPtUpdate.getTitluFilm());
            existent.setAnFilm(filmPtUpdate.getAnFilm());
            existent.setPretFilm(filmPtUpdate.getPretFilm());
            existent.setInProgram(filmPtUpdate.isInProgram());

            return filmPtUpdate;
        }

        return null;
    }


    public Film findByName(String name) {
        for (Film f : this.filme) {
            if (Objects.equals(f.getTitluFilm(), name)) {
                return f;
            }
        }
        return null;
    }

    public Film findById(Integer id) {
        for (Film f : this.filme) {
            if (Objects.equals(f.getIdFilm(), id)) {
                return f;
            }
        }
        return null;
    }


    public List<Film> getAll() {
        return new ArrayList<>(this.filme);
    }

    public void replaceFilme(List<Film> newFilme) {
        this.filme = newFilme;
    }
}
