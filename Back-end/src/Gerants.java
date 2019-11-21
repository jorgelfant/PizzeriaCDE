public class Gerants {
    private int idGerant;
    private String nomGerant;
    private String prenomGerant;

    public Gerants(int id, String nom, String prenom){
        this.idGerant = id;
        this.nomGerant = nom;
        this.prenomGerant = prenom;
    }

    public int getIdGerant(){
        return this.idGerant;
    }
    public String getNomGerant(){
        return this.nomGerant;
    }
    public String getPrenomGerant(){
        return this.prenomGerant;
    }
}
