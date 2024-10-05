import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();

        /* -----  Prosit 1 - Instruction 1 ------*/
        System.out.println(zooManagement.zooName + " comporte " + zooManagement.nbrCages + " cages");

        /* -----  Prosit 1 - Instruction 2 ------*/
        Scanner x = new Scanner(System.in);
        System.out.println("Saisir un nombre de cages : ");

        zooManagement.nbrCages = x.nextInt();
        System.out.print("Nombre de cages saisies par l'utilisateur : " + zooManagement.nbrCages + "\n \n \n ");


        Animal lion = new Animal();
        lion.family = "liono";
        lion.age = 5;
        lion.isMammal = false;
        lion.name = "Un lion X";

        Zoo myZoo = new Zoo("Safari Park", "Tunis", 20);

        /* -----  Prosit 2 - Instruction 7 ------*/
        Animal elephant = new Animal("Elephantida", "Elephant", 2, false);


        System.out.println("--  Elephant -- \n" + elephant + "\n");

        /* -----  Prosit 2 - Instruction 8 ------*/
        myZoo.displayZoo();

        //System.out.println(myZoo); // Affichage avec hashcode
        System.out.println("\n Affichage avec toString");
        System.out.println(myZoo.toString());

    }
}
