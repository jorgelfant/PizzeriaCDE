public class Commandes{
    private int idCommande;
    private Clients client; // Client qui a passer la commande
    private boolean isLivraison; 
    private double totalPrixCommande;

    public Commandes(int id, Clients client, boolean isLivraisonL){
        this.idCommande = id;
        this.client = client;
        this.isLivraison = isLivraisonL;
    }
    
    public int getIdCommande(){
        return this.idCommande;
    }
    public Clients getClientCommande(){
        return this.client;
    }
    public boolean getIsLivraison(){
        return this.isLivraison;
    }
    public double getTotalPrixCommande(){
        return this.totalPrixCommande;
    }

    public void setTotalPrixCommande(double prix){
        this.totalPrixCommande = prix;
    }
}