import domain.Film;
import domain.FilmValidator;
import repo.FilmRepo;
import service.FilmService;
import ui.Console;

public class Main {

    public static void main(String[] args) {

        FilmRepo filmRepo = new FilmRepo();
        FilmValidator filmValidator = new FilmValidator();
        FilmService filmService = new FilmService(filmRepo, filmValidator);

        Console console = new Console(filmService);

        console.startMenu();


    }

}
