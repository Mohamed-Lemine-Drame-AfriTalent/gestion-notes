import java.util.Scanner;
public class GestionNotes {
    public static void main(String[] args) {

//        Pour les Constantes du poids
        final double POIDS_DEVOIR = 0.4;
        final double POIDS_EXAME = 0.6;

//        Pour les Constantes de l'exam'
        final int COEF_ALGORITHMIQUE = 3;
        final int COEF_BASE_DE_DONNEES = 2;
        final int COEF_ANGLAIS = 1;

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

        scanner.close();
    }
}
