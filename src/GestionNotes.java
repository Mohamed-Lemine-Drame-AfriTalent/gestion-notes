import java.util.Scanner;

public class GestionNotes {
    static final String[] MATIERES = {"Algorithmique", "Base de données", "Anglais"};
    static final int[] COEFS = {3, 2, 1};

    public static void main(String[] args) {

        // CONSTANTES

//        Pour les Constantes du poids
        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAMEN = 0.6;

//        Pour les Constantes de l'exam

//        final int COEF_ALGORITHMIQUE = 3;
//        final int COEF_BASE_DE_DONNEES = 2;
//        final int COEF_ANGLAIS = 1;

        double[] moyenne = new double[MATIERES.length];

        double[] notes = new double[MATIERES.length*2];



//        calcul des coeff


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


        System.out.print(" Matricule : ");
        String matricule = scanner.nextLine();

        // SAISIT DES NOTES

//        Saisir les notes
    int n = 0;
    for (int m = 0 ; m < MATIERES.length; m++){
        System.out.printf("%s, note de devoir ", MATIERES[m]);
        notes[n] = scanner.nextDouble();
        n++;
        System.out.printf("%s, note d'examen ", MATIERES[m]);
        notes[n] = scanner.nextDouble();
        moyenne[m] = POIDS_DEVOIR*notes[n - 1] + POIDS_EXAMEN*notes[n];
        n++;

    }

        for (int m=0; m< moyenne.length; m++){
            System.out.printf("La moyenne de %s est : %.2f\n",MATIERES[m], moyenne[m]);
        }
//    System.out.printf("moyenne Algo  : %.2f ", moyenne[0]);
//        System.out.println();
//    System.out.printf("moyenne Base  : %.2f ", moyenne[1]);
//        System.out.println();
//    System.out.printf("moyenne Anglais  : %.2f ", moyenne[2]);

        System.out.println();


    double moyenneGenerale = 0, sommemoyenne = 0;
    int sommeCoefs = 0;

    for (int m = 0 ; m < MATIERES.length; m++){
        sommemoyenne += moyenne[m] * COEFS[m];
        sommeCoefs += COEFS[m];
    }
    moyenneGenerale = (double) sommemoyenne / sommeCoefs;

    System.out.print(" la moyenne generale est : " + moyenneGenerale );
        System.out.println();


        // CALCULS

//        Calcul des moyennes

//        double moyenneAlgo = devoirAlgo * POIDS_DEVOIR + examenAlgo * POIDS_EXAMEN;
//
//        double moyenneBd = devoirBd * POIDS_DEVOIR + examenBd * POIDS_EXAMEN;
//
//        double moyenneAnglais = devoirAnglais * POIDS_DEVOIR + examenAnglais * POIDS_EXAMEN;
//
//        double moyenneGenerale = (moyenneAlgo * COEF_ALGORITHMIQUE + moyenneBd * COEF_BASE_DE_DONNEES
//                + moyenneAnglais * COEF_ANGLAIS) / sommeCoefs;

        // AFFICHAGE

//        Affichages des informations

        System.out.println(" Étudiant : " + prenom + " " + nom + " ");
        System.out.println(" Matricule : " + matricule);

//        System.out.println("------------------------------");
//
//        System.out.printf("Algorithmique    ");
//
//        System.out.printf("Base de données  ");
//
//        System.out.printf("Anglais          ");
//
//        System.out.println("------------------------------");
//
//        System.out.printf("Moyenne générale :");


        scanner.close();
    }
}
