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

        System.out.print(" Prénom : ");
        String Prenom = scanner.nextLine();

        System.out.print(" Nom : ");
        String Nom = scanner.nextLine();

        System.out.print(" Age : ");
        int Age = scanner.nextInt();

        System.out.print(" Matricule : ");
        scanner.nextLine();
        String Matricule = scanner.nextLine();

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

        System.out.println(" Etudiant : " + Prenom + " " + Nom + " (" + Age + " ans)");
        System.out.println(" Matricule : " + Matricule);

        System.out.println("------------------------------");

//        Calcul des moyennes

        double moyenneAlgo = devoirAlgo * POIDS_DEVOIR + examenAlgo * POIDS_EXAMEN;

        double moyenneBd = devoirBd * POIDS_DEVOIR + examenBd * POIDS_EXAMEN;

        double moyenneAnglais = devoirAnglais * POIDS_DEVOIR + examenAnglais * POIDS_EXAMEN;

        double moyenneGenerale = (moyenneAlgo * COEF_ALGORITHMIQUE + moyenneBd * COEF_BASE_DE_DONNEES
                + moyenneAnglais * COEF_ANGLAIS ) / sommeCoefs;

        System.out.printf("Algorithmique (coef %d)   : %.2f%n", COEF_ALGORITHMIQUE, moyenneAlgo);

        System.out.printf("Base de données (coef %d) : %.2f%n", COEF_BASE_DE_DONNEES, moyenneBd);

        System.out.printf("Anglais (coef %d)         : %.2f%n", COEF_ANGLAIS, moyenneAnglais);

        System.out.println("------------------------------");

        System.out.printf("Moyenne générale : %.2f / 20%n", moyenneGenerale);



        scanner.close();
    }
}
