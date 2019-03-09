package repo;

import domain.CardClient;
import domain.Film;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CardClientRepo {

    private List<CardClient> carduriClienti = new ArrayList<>();

    public CardClient addCardClient(CardClient cardClientDeAdaugat) {

        CardClient existent = this.findById(cardClientDeAdaugat.getIdCardClient());
        if (existent == null) {
            this.carduriClienti.add(cardClientDeAdaugat);
            return (cardClientDeAdaugat);
        }
        return null;

    }

    public CardClient updateCardClient(CardClient cardClientPtUpdate) {

        CardClient existent = this.findById(cardClientPtUpdate.getIdCardClient());

        if (existent != null) {

            existent.setNumeCardClient(cardClientPtUpdate.getNumeCardClient());
            existent.setPrenumeCardClient(cardClientPtUpdate.getPrenumeCardClient());
            existent.setCnpCardClient(cardClientPtUpdate.getCnpCardClient());
            existent.setDataNastereCardClient(cardClientPtUpdate.getDataNastereCardClient());
            existent.setPuncteCardClient(cardClientPtUpdate.getPuncteCardClient());

            return cardClientPtUpdate;

        }
        return null;
    }


    public CardClient findById(Integer id) {
        for (CardClient c : this.carduriClienti) {
            if (Objects.equals(c.getIdCardClient(), id)) {
                return c;
            }
        }
        return null;
    }

    public List<CardClient> getAll() {
        return new ArrayList<>(this.carduriClienti);
    }

    public void replaceCarduriClienti(List<CardClient> newCarduriClienti) {
        this.carduriClienti = newCarduriClienti;
    }
}
