import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";
        public static void main (String[] args) {
            ZooManagement zooManagement = new ZooManagement();

            /* -----  Prosit 1 - Instruction 1 ------*/
            System.out.println(zooManagement.zooName + " comporte " + zooManagement.nbrCages + " cages");

            /* -----  Prosit 1 - Instruction 2 ------*/
            Scanner x = new Scanner(System.in);
            System.out.println("Saisir un nombre de cages : ");

            zooManagement.nbrCages = x.nextInt();
            System.out.print("Nombre de cages saisies par l'utilisateur : " + zooManagement.nbrCages + "\n \n \n ");
        }
    }
