public class Prestataire extends Travailleur {
    private double tjm; // Taux Journalier Moyen en €

    public Prestataire(int id, String nom, String prenom, String email, String telephone, double tjm) {
        wait(id, nom, prenom, email, telephone);
        this.tjm = tjm;
    }

    private void wait(int id, String nom, String prenom, String email, String telephone) {
    }

    public double getTjm() {
        return tjm;
    }
}


