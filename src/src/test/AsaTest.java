package test;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AsaTest {

    @Test
    void testPointageRougeValide() {
        LocalDate d = LocalDate.of(2025, 9, 9);
        Pointage p1 = new Pointage(d, "ENSEIGNEMENT", 0.5, "Cours Java", "rouge");
        Pointage p2 = new Pointage(d, "ADMINISTRATION", 0.5, "Réunion", "bleu");

        assertTrue(AsaTest.pointageRouge(d, Arrays.asList(p1, p2)));
    }

    private static boolean pointageRouge(LocalDate d, List<Object> list) {
        return false;
    }

    @Test
    void testPointageRougeInvalide() {
        LocalDate d = LocalDate.of(2025, 9, 9);
        Pointage p1 = new Pointage(d, "ENSEIGNEMENT", 0.7, "Cours", "bleu");
        Pointage p2 = new Pointage(d, "ADMINISTRATION", 0.4, "Réunion", "bleu");

        assertFalse(AsaTest.pointageRouge(d, Arrays.asList(p1, p2)));
    }

    @Test
    void testSalairePrestataire() {
        Prestataire pr = new Prestataire(1, "Rakoto", "Jean", "rakoto@hei.com", "0341234567", 100);

        LocalDate d1 = LocalDate.of(2025, 9, 1);
        LocalDate d2 = LocalDate.of(2025, 9, 10);

        pr.ajouterPointage(new Pointage(d1, "ENSEIGNEMENT", 1.0, "Cours", "rouge"));
        pr.ajouterPointage(new Pointage(d2, "ADMINISTRATION", 1.0, "Réunion", "bleu"));

        double salaire = AsaTest.getSalairePrestataire(pr, d1, d2);
        assertEquals(200, salaire); // 2 jours * 100€
    }

    private static <Prestataire> double getSalairePrestataire(Prestataire pr, LocalDate d1, LocalDate d2) {
        return 0;
    }
}
