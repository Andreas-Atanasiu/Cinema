package domain;

import java.util.Date;

public class CardClient {

    private Integer idCardClient;
    private String numeCardClient;
    private String prenumeCardClient;
    private Integer cnpCardClient;
    private Date dataNastereCardClient;
    private Date dataInregCardClient;
    private Double puncteCardClient;

    public CardClient(Integer idCardClient, String numeCardClient, String prenumeCardClient, Integer cnpCardClient, Date dataNastereCardClient, Date dataInregCardClient, Double puncteCardClient) {
        this.idCardClient = idCardClient;
        this.numeCardClient = numeCardClient;
        this.prenumeCardClient = prenumeCardClient;
        this.cnpCardClient = cnpCardClient;
        this.dataNastereCardClient = dataNastereCardClient;
        this.dataInregCardClient = dataInregCardClient;
        this.puncteCardClient = puncteCardClient;
    }

    public Integer getIdCardClient() {
        return idCardClient;
    }

    public void setIdCardClient(Integer idCardClient) {
        this.idCardClient = idCardClient;
    }

    public String getNumeCardClient() {
        return numeCardClient;
    }

    public void setNumeCardClient(String numeCardClient) {
        this.numeCardClient = numeCardClient;
    }

    public String getPrenumeCardClient() {
        return prenumeCardClient;
    }

    public void setPrenumeCardClient(String prenumeCardClient) {
        this.prenumeCardClient = prenumeCardClient;
    }

    public Integer getCnpCardClient() {
        return cnpCardClient;
    }

    public void setCnpCardClient(Integer cnpCardClient) {
        this.cnpCardClient = cnpCardClient;
    }

    public Date getDataNastereCardClient() {
        return dataNastereCardClient;
    }

    public void setDataNastereCardClient(Date dataNastereCardClient) {
        this.dataNastereCardClient = dataNastereCardClient;
    }

    public Date getDataInregCardClient() {
        return dataInregCardClient;
    }

    public void setDataInregCardClient(Date dataInregCardClient) {
        this.dataInregCardClient = dataInregCardClient;
    }

    public Double getPuncteCardClient() {
        return puncteCardClient;
    }

    public void setPuncteCardClient(Double puncteCardClient) {
        this.puncteCardClient = puncteCardClient;
    }

    @Override
    public String toString() {
        return "CardClient{" +
                "idCardClient=" + idCardClient +
                ", numeCardClient='" + numeCardClient + '\'' +
                ", prenumeCardClient='" + prenumeCardClient + '\'' +
                ", cnpCardClient=" + cnpCardClient +
                ", dataNastereCardClient=" + dataNastereCardClient +
                ", dataInregCardClient=" + dataInregCardClient +
                ", puncteCardClient=" + puncteCardClient +
                '}';
    }
}
