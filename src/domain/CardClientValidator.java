package domain;

public class CardClientValidator {

    public void valideaza(CardClient cardClientIn) throws IllegalArgumentException {

        String erori = "";

        /*private Integer idCardClient;
        private String numeCardClient;
        private String prenumeCardClient;
        private Integer cnpCardClient;
        private Date dataNastereCardClient;
        private Date dataInregCardClient;
        private Double puncteCardClient;*/

        if(cardClientIn.getIdCardClient() == null){
            erori += "Id-ul cardului este obligatoriu!";
        }

        if(cardClientIn.getNumeCardClient() == null){
            erori += "Numele Clientului este obligatoriu!";
        }

        if(cardClientIn.getPrenumeCardClient() == null){
            erori += "Prenumele Clientului este obligatoriu!";
        }



        if (erori.length() > 0) {
            // throw new IllegalArgumentException(erori.toString());
            throw new IllegalArgumentException(erori);
        }

    }
}

