import java.util.Scanner;
public class GestionNotes {
    public static void main(String[] args) {
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
