import java.time.LocalDate;

public class Promotion {
    private final LocalDate date;
    private final double nouveauSalaireOuTjm;
    private final String raison;

    public Promotion(LocalDate date, double nouveauSalaireOuTjm, String raison) {
        this.date = date;
        this.nouveauSalaireOuTjm = nouveauSalaireOuTjm;
        this.raison = raison;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getNouveauSalaireOuTjm() {
        return nouveauSalaireOuTjm;
    }

    public String getRaison() {
        return raison;
    }
}

