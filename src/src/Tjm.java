public class Tjm extends Travailleur {
    private double tjm;

    public Tjm(int id, String nom, String prenom, String email, String telephone, double tjm) {
        super(id, nom, prenom, email, telephone);
        this.tjm = tjm;
    }

    public Tjm(int id, String nom, String prenom, String email, String telephone) {
        super(id, nom, prenom, email, telephone);
    }

    public double getTjm() {
        return tjm;
    }
}
