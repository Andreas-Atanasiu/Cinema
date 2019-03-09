package ui;

import domain.Film;
import service.FilmService;

import java.util.List;
import java.util.Scanner;

public class Console {

    private Scanner in = new Scanner(System.in);
    private FilmService filmServ;

    public Console(FilmService filmServ) {
        this.filmServ = filmServ;
    }

    private void showAll(List<Film> Filme) {
        for (Film f : Filme) {
            System.out.println(f);
        }
    }

    private void adaugareFilm() {
        System.out.println("Dati numele:");
        String nume = this.in.next();
        System.out.println("Dati pretul:");
        double pret = this.in.nextDouble();
        System.out.println("Dati ora:");
        int ora = this.in.nextInt();

        try {
            this.filmServ.addFilm(nume, pret, ora);
        } catch (IllegalArgumentException iae) {
            System.out.println("Eroare: " + iae.getMessage());
        }
    }

    private void cautareFilm() {
        System.out.println("Dati ora de inceput a intervalului:");
        int oraInceput = this.in.nextInt();
        System.out.println("Dati ora de sfarsit a intervalului:");
        int oraSfarsit = this.in.nextInt();

        showAll(this.filmServ.cautaFilmInterval(oraInceput, oraSfarsit));

    }

    private void sortareFilm() {
        System.out.println("Filmele sortate dupa pret: ");
        showAll(filmServ.getSortPret());
    }

    private void latestFilm() {
        System.out.println("Filmele sortate dupa ora: ");
   //     showAll(filmServ.getSortOra());
    }

    private void modificareFilm() {
        System.out.println("Dati numele:");
        String nume = this.in.next();
        System.out.println("Dati pretul:");
        double pret = this.in.nextDouble();
        System.out.println("Dati ora:");
        int ora = this.in.nextInt();


}
    //    Film filmUpdate = new Film(nume, pret, ora);
        try {
      //      this.filmServ.updateFilm(filmUpdate);
        } catch (IllegalArgumentException iae) {
            System.out.println("Eroare: " + iae.getMessage());
        }
    }


    private void showMenu() {
        System.out.println("1. Adaugare film");
        System.out.println("2. Cautare filme in interval");
        System.out.println("3. Sortare filme ora");
        System.out.println("4. Modificare filme");
        System.out.println("5. Filme ora tarzie");
        System.out.println("a. Afisare filme");
        System.out.println("u. Undo");
        System.out.println("x. Exit");

        System.out.println("Dati optiunea:");
    }

    public void startMenu() {

        while (true) {
            this.showMenu();

            String optiune = in.next();
            if (optiune.equals("1")) {
                this.adaugareFilm();
            } else if (optiune.equals("2")) {
                this.cautareFilm();
            } else if (optiune.equals("3")) {
                this.sortareFilm();
            } else if (optiune.equals("4")) {
                this.modificareFilm();
            } else if (optiune.equals("5")) {
                this.latestFilm();
            } else if (optiune.equals("a")) {
                this.showAll(this.filmServ.getAll());
            } else if (optiune.equals("u")) {
                this.filmServ.undo();
            } else if (optiune.equals("x")) {
                break;
            } else {
                System.out.println("Comanda invalida");
            }

            System.out.println();
        }

    }
}
