import java.util.Scanner;
public class GestionNotes {
    public static void main(String[] args) {

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

        System.out.print(" Saisir votre Prénom : ");
        String Prenom = scanner.nextLine();

        System.out.print(" Saisir votre Nom : ");
        String Nom = scanner.nextLine();

        System.out.print(" Saisir votre Age : ");
        int Age = scanner.nextInt();

        System.out.print(" Saisir votre Matricule : ");
        scanner.nextLine();
        String Matricule = scanner.nextLine();

//        Saisir les notes

        System.out.print(" Algorithmique, note de devoir : ");
        double devoirAlgo = scanner.nextDouble();

        System.out.print(" Algorithmique, note d'examen: ");
        double examenAlgo = scanner.nextDouble();

        System.out.print(" Base de données, note de devoir : ");
        double devoirBd = scanner.nextDouble();

        System.out.print(" Base de données, note d'examen : ");
        double examenBd = scanner.nextDouble();

        System.out.print(" Anglais, note de devoir : ");
        double devoirAnglais = scanner.nextDouble();

        System.out.print(" Anglais, note d'examen : ");
        double examenAnglais = scanner.nextDouble();

//        Calcul des moyennes

        double moyenneAlgo = devoirAlgo * POIDS_DEVOIR + examenAlgo * POIDS_EXAMEN;

        double moyenneBd = devoirBd * POIDS_DEVOIR + examenBd * POIDS_EXAMEN;

        double moyenneAnglais = devoirAnglais * POIDS_DEVOIR + examenAnglais * POIDS_EXAMEN;

        double moyenneGeneral = (moyenneAlgo * COEF_ALGORITHMIQUE + moyenneBd * COEF_BASE_DE_DONNEES
                + moyenneAnglais * COEF_ANGLAIS ) / sommeCoefs;

        System.out.println("Brut : " + moyenneAlgo + " | " + moyenneBd + " | " + moyenneAnglais +
                " | Moyenne General : " + moyenneGeneral);

        scanner.close();
    }
}
