import java.time.LocalDate;

public class Pointage {
    private LocalDate date;
    private TypeTravail type;
    private double quota; // entre 0 et 1
    private String description;
    private String couleur;

    public void Pointage(LocalDate date, TypeTravail type, double quota, String description, String couleur) {
        if (quota <= 0 || quota > 1) {
            throw new IllegalArgumentException("Quota invalide : doit être > 0 et <= 1");
        }
        this.date = date;
        this.type = type;
        this.quota = quota;
        this.description = description;
        this.couleur = couleur;
    }

    public LocalDate getDate() {
        return date;
    }

    public TypeTravail getType() {
        return type;
    }

    public double getQuota() {
        return quota;
    }

    public String getDescription() {
        return description;
    }

    public String getCouleur() {
        return couleur;
    }
}
