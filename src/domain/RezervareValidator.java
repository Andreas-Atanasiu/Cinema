package domain;

public class RezervareValidator {

    /*private Integer idRezervare;
    private Integer idFilm;
    private Integer idCardClient;
    private Date dataOraRezervare;*/

    public void valideaza(Rezervare rezervareIn) throws IllegalArgumentException {

        String erori = "";


        if(rezervareIn.getIdRezervare() == null){
            erori += "Id-ul rezervarii este obligatoriu!";
        }

        if(rezervareIn.getIdFilm() == null){
            erori += "Id-ul Filmului este obligatoriu!";
        }



        if (erori.length() > 0) {
            // throw new IllegalArgumentException(erori.toString());
            throw new IllegalArgumentException(erori);
        }

    }


}
