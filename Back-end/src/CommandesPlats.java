public class CommandesPlats{
    private Commandes commande; // Objet commande
    private List<Plats> plats = new ArrayList<Plats>(); // Collection de plats commandés
    
    public CommandesPlats(Commandes commande, List<Plats> plats){
        this.commande = commande;
        this.plats = plats;
    }

    public Commandes getCommandeCommandesPlats(){
        return this.commande;
    }
    public List<Plats> getPlatsCommandesPlats(){
        return this.plats;
    }
}