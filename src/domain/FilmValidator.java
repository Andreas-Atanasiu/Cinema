package domain;

public class FilmValidator {

    public void valideaza(Film filmIn) throws IllegalArgumentException {

        String erori = "";


        if(filmIn.getIdFilm() == null){
            erori += "Id-ul filmului este obligatoriu!";
        }

        if (filmIn.getPretFilm() <= 0) {
            erori += "Pretul trebuie sa fie strict pozitiv";
        }

        if (erori.length() > 0) {
            // throw new IllegalArgumentException(erori.toString());
            throw new IllegalArgumentException(erori);
        }

    }
}
