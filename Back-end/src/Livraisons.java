public class Livraisons{
    private int idLivraison;
    private Clients client; // client qui doit se faire livrer
    private DateTime dateHeureLivraison;
    private String numRueLivraison;
    private String adresseLivraison;
    private String villeLivraison;
    private String cpLivraison;
    private Commandes commande; // La commande qui doit être livrée 

    public Livraisons(int id, Clients client, DateTime dateHeure, String numRue, String adresse, String ville, String cp, Commandes commande){
        this.idLivraison = id;
        this.client = client;
        this.dateHeureLivraison = dateHeure;
        this.numRueLivraison = numRue;
        this.adresseLivraison = adresse;
        this.villeLivraison = ville;
        this.cpLivraison = cp;
        this.commande = commande;
    }

    public int getIdLivraison(){
        return this.idLivraison;
    }
    public Clients getClientLivraison(){
        return this.client;
    }
    public DateTime getDateHeureLivraison(){
        return this.dateHeureLivraison;
    }
    public String getAdresseLivraison(){
        return this.numRueLivraison + " " + this.adresseLivraison + " " + this.villeLivraison + " " + this.cpLivraison;
    }
    public Commandes getCommande(){
        return this.commande;
    }
}