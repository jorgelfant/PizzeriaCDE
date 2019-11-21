public class Clients {
    private int idClient;
    private String nomClient;
    private String prenomClient;
    private String numRueClient;
    private String adresseClient;
    private String villeClient;
    private String cpClient;

    public Clients(int id, String nom, String prenom, String numRue, String adresse, String ville, String cp){
        this.idClient = id;
        this.nomClient = nom;
        this.prenomClient = prenom;
        this.numRueClient = numRue;
        this.adresseClient = adresse;
        this.villeClient = ville;
        this.cpClient = cp;
    }

    public int getIdClient(){
        return this.idClient;
    }
    public String getNomClient(){
        return this.nomClient;
    }
    public String getPrenomClient(){
        return this.prenomClient;
    }
    public String getAdresseClient(){
        return this.numRueClient + " " + this.adresseClient + " " + this.villeClient + " " + this.cpClient;
    }
}
