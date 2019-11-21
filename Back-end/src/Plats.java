public class Plats{
    private int idPlat;
    private String libellePlat;
    private String descriptionPlat;
    private double prixPlat;

    public Plats(int id, String libelle, String description, String prix){
        this.idPlat = id;
        this.libellePlat = libelle;
        this.descriptionPlat = description;
        this.prixPlat = prix;
    }

    public int getIdPlat(){
        return this.prixPlat;
    }
    public String getLibellePlat(){
        return this.libellePlat;
    }
    public String getDescriptionPlat(){
        return this.descriptionPlat;
    }
    public double getPrixPlat(){
        return this.prixPlat;
    }
}