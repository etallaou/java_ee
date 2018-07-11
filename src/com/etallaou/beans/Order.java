package com.etallaou.beans;

public class Order {

    private Customer client;
    private String date;
    private Double montant;
    private String modePaiement;
    private String statutPaiement;
    private String modeLivraison;
    private String statutLivraison;

    public Order(Customer client, String date, Double montant, String modePaiement, String statutPaiement, String modeLivraison, String statutLivraison) {
        this.client = client;
        this.date = date;
        this.montant = montant;
        this.modePaiement = modePaiement;
        this.statutPaiement = statutPaiement;
        this.modeLivraison = modeLivraison;
        this.statutLivraison = statutLivraison;
    }

    public Order() {
    }

    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String getStatutPaiement() {
        return statutPaiement;
    }

    public void setStatutPaiement(String statutPaiement) {
        this.statutPaiement = statutPaiement;
    }

    public String getModeLivraison() {
        return modeLivraison;
    }

    public void setModeLivraison(String modeLivraison) {
        this.modeLivraison = modeLivraison;
    }

    public String getStatutLivraison() {
        return statutLivraison;
    }

    public void setStatutLivraison(String statutLivraison) {
        this.statutLivraison = statutLivraison;
    }
}
