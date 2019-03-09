package repo;

import domain.Rezervare;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RezervareRepo {

    private List<Rezervare> rezervari = new ArrayList<>();

    public Rezervare addRezervare(Rezervare rezervareDeAdaugat) {
        Rezervare existent = this.findById(rezervareDeAdaugat.getIdRezervare());
        if (existent == null) {
            this.rezervari.add(rezervareDeAdaugat);
            return (rezervareDeAdaugat);
        }
        return null;
    }

    public Rezervare updateRezervare(Rezervare rezervarePtUpdate){

        Rezervare existent = this.findById(rezervarePtUpdate.getIdRezervare());

        if (existent != null) {

            existent.setIdFilm(rezervarePtUpdate.getIdFilm());
            existent.setIdCardClient(rezervarePtUpdate.getIdCardClient());
            existent.setDataOraRezervare(rezervarePtUpdate.getDataOraRezervare());

            return rezervarePtUpdate;

        }
        return null;

    }


//    public Film updateFilm(Film filmPtUpdate) {
//
//        Film existent = this.findById(filmPtUpdate.getIdFilm());
//
//        if (existent != null) {
//
//            existent.setTitluFilm(filmPtUpdate.getTitluFilm());
//            existent.setAnFilm(filmPtUpdate.getAnFilm());
//            existent.setPretFilm(filmPtUpdate.getPretFilm());
//            existent.setInProgram(filmPtUpdate.isInProgram());
//        }
//        return null;
//    }*/


    public Rezervare findById(Integer id) {
        for (Rezervare r : this.rezervari) {
            if (Objects.equals(r.getIdRezervare(), id)) {
                return r;
            }
        }
        return null;
    }


    public List<Rezervare> getAll() {
        return new ArrayList<>(this.rezervari);
    }

    public void replaceFilme(List<Rezervare> newRezervari) {
        this.rezervari = newRezervari;
    }

}
