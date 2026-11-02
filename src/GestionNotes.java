import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {

        // CONSTANTES

//        Pour les Constantes du poids
        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;

//        Pour les Constantes de l'exam'
        final int COEF_ALGORITHMIQUE = 3;
        final int COEF_BASE_DE_DONNEES = 2;
        final int COEF_ANGLAIS = 1;

//        calcul des coeff

        int sommeCoefs = COEF_ALGORITHMIQUE + COEF_BASE_DE_DONNEES + COEF_ANGLAIS;

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("  RELEVÉ DE NOTES - L2");
        System.out.println("==============================");

        // SAISIT DE L'IDENTITE

//        Saisir les identités

        System.out.print(" Prénom : ");
        String prenom = scanner.nextLine();

        System.out.print(" Nom : ");
        String nom = scanner.nextLine();

        System.out.print(" Âge : ");
        int age = scanner.nextInt();

        System.out.print(" Matricule : ");
        scanner.nextLine();
        String matricule = scanner.nextLine();

        // SAISIT DES NOTES

//        Saisir les notes

        System.out.print(" Algorithmique, note de devoir : ");
        double devoirAlgo = scanner.nextDouble();

        System.out.print(" Algorithmique, note d'examen : ");
        double examenAlgo = scanner.nextDouble();

        System.out.print(" Base de données, note de devoir : ");
        double devoirBd = scanner.nextDouble();

        System.out.print(" Base de données, note d'examen : ");
        double examenBd = scanner.nextDouble();

        System.out.print(" Anglais, note de devoir : ");
        double devoirAnglais = scanner.nextDouble();

        System.out.print(" Anglais, note d'examen : ");
        double examenAnglais = scanner.nextDouble();

        System.out.println();


        // CALCULS

//        Calcul des moyennes

        double moyenneAlgo = devoirAlgo * POIDS_DEVOIR + examenAlgo * POIDS_EXAMEN;

        double moyenneBd = devoirBd * POIDS_DEVOIR + examenBd * POIDS_EXAMEN;

        double moyenneAnglais = devoirAnglais * POIDS_DEVOIR + examenAnglais * POIDS_EXAMEN;

        double moyenneGenerale = (moyenneAlgo * COEF_ALGORITHMIQUE + moyenneBd * COEF_BASE_DE_DONNEES
                + moyenneAnglais * COEF_ANGLAIS) / sommeCoefs;

        // AFFICHAGE

//        Affichages des informations

        System.out.println(" Étudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println(" Matricule : " + matricule);

        System.out.println("------------------------------");

        System.out.printf("Algorithmique (coef %d)   : %.2f%n", COEF_ALGORITHMIQUE, moyenneAlgo);

        System.out.printf("Base de données (coef %d) : %.2f%n", COEF_BASE_DE_DONNEES, moyenneBd);

        System.out.printf("Anglais (coef %d)         : %.2f%n", COEF_ANGLAIS, moyenneAnglais);

        System.out.println("------------------------------");

        System.out.printf("Moyenne générale : %.2f / 20%n", moyenneGenerale);


        scanner.close();
    }
}
