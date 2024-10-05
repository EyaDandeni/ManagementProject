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

        Zoo myZoo = new Zoo("Safari Park", "Tunis");

        /* -----  Prosit 2 - Instruction 7 ------*/
        Animal elephant = new Animal("Elephantida", "Elephant", 2, false);


        System.out.println("--  Elephant -- \n" + elephant + "\n");

        /* -----  Prosit 2 - Instruction 8 ------*/
        myZoo.displayZoo();

        //System.out.println(myZoo); // Affichage avec hashcode
        System.out.println("\n Affichage avec toString");
        System.out.println(myZoo.toString());

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        System.out.println(" \n -- Affichage des animaux du ZOO --\n ");
        myZoo.displayZoo();

        /* ----- Prosit 2 - Instruction 11 ------*/
        int indiceAnimal=myZoo.searchAnimal(elephant);
        System.out.println("Indice d'animal :"+indiceAnimal);

        /* --- Prosit3 - Instruction12 --- */
        System.out.println("\n ---- ");

        // Ajout d'un animal déjà présent
        if (myZoo.addAnimal(lion)) {
            System.out.println("Lion ajouté au zoo.");
        } else {
            System.out.println("Lion est déja présent !! ");
        }


        /*----- Prosit 3 - Instruction 13 -----*/
        System.out.println("\n ---- ");
        if (myZoo.removeAnimal(lion)){
            System.out.println("Lion removed du zoo.");
            myZoo.displayZoo();
        }
        /* -----  Prosit 3 - Instruction 15 ------*/
        boolean full= myZoo.isZooFull();
        if (full == true){
            System.out.println(" \n Le zoo est plein ! ");
        }
        else{
            System.out.println("Le zoo n'est pas encore plein ! ");
        }

        /* --- Prosit 3 - Instruction 16 --- */
        Zoo myZoo1=new Zoo("2emeZoo","Bizerte");
        Animal cat=new Animal("chat","Le chatt",3,true);

        myZoo1.addAnimal(lion);
        myZoo1.addAnimal(elephant);
        myZoo1.addAnimal(cat);

        Zoo ZooPlusRempli=Zoo.comparerZoo(myZoo,myZoo1);
        if (ZooPlusRempli != null) {
            System.out.println(" \n \n Le zoo avec le plus d'animaux est : " + ZooPlusRempli.name);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

    }
}
