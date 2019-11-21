public class CommandesMenus{
    private Commandes commande;
    private List<Menus> menus = new ArrayList<Menus>(); // Collection de menus commandés

    public CommandesMenus(Commandes commande, List<Menus> menus){
        this.commande = commande;
        this.menus = menus;
    }

    public Commandes getCommandeCommandesMenus(){
        return this.commande;
    }
    public List<Menus> getMenusCommandesMenus(){
        return this.menus;
    }
}