import java.util.ArrayList;
import java.util.List;

public class Menus {
    private int idMenu;
    private List<Plats> plats = new ArrayList<Plats>(); // Collection de plats
    private double prixMenu;

    public Menus(int id, List<Plats> platsP, double prix){
        this.idMenu = id;
        this.plats = platsP;
        this.prixMenu = prix; 
    }

    public int getIdMenu(){
        return this.idMenu;
    }
    public List<Plats> getPlatsMenu(){
        return this.plats;
    }
    public double getPrixMenu(){
        return this.prixMenu;
    }
}