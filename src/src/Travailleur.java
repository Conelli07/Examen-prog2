import java.util.ArrayList;

public class Travailleur {
    private final int id;
    private String nom;
    private String prenom;
    private final String email;
    private final String telephone;

    private final ArrayList<Object> promotions = new ArrayList<>();
    private final ArrayList<Object> pointages = new ArrayList<>();

    public Travailleur(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    public Travailleur() {
        email = null;
        id = 0;
        telephone = "";
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public ArrayList<Object> getPromotions() {
        return promotions;
    }

    public ArrayList<Object> getPointages() {
        return pointages;
    }
}

