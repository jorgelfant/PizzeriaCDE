public class Commandes{
    private int idCommande;
    private Clients client; // Client qui a passer la commande
    private List<Plats> plats = new ArrayList<Plats>(); // Collection de plats commandés
    private List<Menus> menus = new ArrayList<Menus>() ; // Collection de menus commandés
    private boolean isLivraison; 

    public Commandes(int id, Clients client, List<Plats> platsP, List<Menus> menusM, boolean isLivraisonL){
        this.idCommande = id;
        this.client = client;
        this.plats = platsP;
        this.menus = menusM;
        this.isLivraison = isLivraisonL;
    }
    
    public int getIdCommande(){
        return this.idCommande;
    }
    public Clients getClientCommande(){
        return this.client;
    }
    public List<Plats> getPlatsCommande(){
        return this.plats;
    }
    public List<Menus> getMenusCommande(){
        return this.menus;
    }
    public boolean getIsLivraison(){
        return this.isLivraison;
    }
}