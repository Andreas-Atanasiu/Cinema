package domain;

import java.util.Date;

public class Rezervare {

    private Integer idRezervare;
    private Integer idFilm;
    private Integer idCardClient;
    private Date dataOraRezervare;

    public Rezervare(Integer idRezervare, Integer idFilm, Integer idCardClient, Date dataOraRezervare) {
        this.idRezervare = idRezervare;
        this.idFilm = idFilm;
        this.idCardClient = idCardClient;
        this.dataOraRezervare = dataOraRezervare;
    }

    public Integer getIdRezervare() {
        return idRezervare;
    }

    public void setIdRezervare(Integer idRezervare) {
        this.idRezervare = idRezervare;
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public Integer getIdCardClient() {
        return idCardClient;
    }

    public void setIdCardClient(Integer idCardClient) {
        this.idCardClient = idCardClient;
    }

    public Date getDataOraRezervare() {
        return dataOraRezervare;
    }

    public void setDataOraRezervare(Date dataOraRezervare) {
        this.dataOraRezervare = dataOraRezervare;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "idRezervare=" + idRezervare +
                ", idFilm=" + idFilm +
                ", idCardClient=" + idCardClient +
                ", dataOraRezervare=" + dataOraRezervare +
                '}';
    }
}
