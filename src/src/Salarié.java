public class Salarié {
    class Salarie extends Travailleur {
        private double salaireMensuel;

        public Salarie(int id, String nom, String prenom, String email, String tel, double salaireMensuel) {
            wait(id, nom, prenom, email, tel);
            this.salaireMensuel = salaireMensuel;
        }

        private void wait(int id, String nom, String prenom, String email, String tel) {
        }
    }
}
