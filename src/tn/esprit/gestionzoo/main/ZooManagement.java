package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.Exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.Exceptions.ZooFullException;
import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 3;  // Réduction du nombre de cages à 3 pour le test
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();

        // -----  Prosit 1 - Instruction 1 ------
        // Affichage du nombre de cages
        System.out.println(zooManagement.zooName + " comporte " + zooManagement.nbrCages + " cages");

        // -----  Prosit 1 - Instruction 2 ------
        Scanner x = new Scanner(System.in);
        System.out.println("Saisir un nombre de cages : ");
        zooManagement.nbrCages = x.nextInt();
        System.out.println("Nombre de cages saisies par l'utilisateur : " + zooManagement.nbrCages + "\n \n \n ");

        Animal lion = new Animal();
        lion.setFamily("liono");
        lion.setAge(5);  // Âge valide
        lion.setMammal(false);
        lion.setName("Un lion X");

        Zoo myZoo = new Zoo("Safari Park", "Tunis");

        // -----  Prosit 2 - Instruction 7 ------
        Animal elephant = new Animal("Elephantida", "Elephant", 2, false);
        System.out.println("--  Elephant -- \n" + elephant + "\n");

        // -----  Prosit 2 - Instruction 8 ------
        myZoo.displayZoo();
        System.out.println("\n Affichage avec toString");
        System.out.println(myZoo.toString());

        // ----- Prosit 2 - Instruction 11 ------
        try {
            // Test de l'ajout d'animaux
            myZoo.addAnimal(lion);
            myZoo.addAnimal(elephant);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" \n -- Affichage des animaux du ZOO --\n ");
        myZoo.displayZoo();

        // ----- Prosit 3 - Instruction 12 ------
        // Ajout d'un animal déjà présent
        try {
            myZoo.addAnimal(lion);
            System.out.println("Lion ajouté au zoo.");
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // ----- Prosit 3 - Instruction 13 ------
        // Suppression d'un animal
        try {
            if (myZoo.removeAnimal(lion)) {
                System.out.println("Lion removed du zoo.");
                myZoo.displayZoo();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // -----  Prosit 3 - Instruction 15 ------
        boolean full = myZoo.isZooFull();
        if (full) {
            System.out.println(" \n Le zoo est plein ! ");
        } else {
            System.out.println("Le zoo n'est pas encore plein ! ");
        }

        // ----- Prosit 3 - Instruction 16 ------
        Zoo myZoo1 = new Zoo("2emeZoo", "Bizerte");
        Animal cat = new Animal("chat", "Le chatt", 3, true);

        try {
            myZoo1.addAnimal(lion);
            myZoo1.addAnimal(elephant);
            myZoo1.addAnimal(cat);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Zoo ZooPlusRempli = Zoo.comparerZoo(myZoo, myZoo1);
        if (ZooPlusRempli != null) {
            System.out.println(" \n \n Le zoo avec le plus d'animaux est : " + ZooPlusRempli.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

        // ----- Prosit 5 --- Instruction 23 ---
        Dolphin dolphin = new Dolphin("Cetacea", "Dolphi", 10, false, "Ocean", 15.0f);
        System.out.println(dolphin.toString());
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 5, false, "Antarctica", 100.0f);
        System.out.println(penguin.toString());

        // ----- Prosit 5 - Instruction 24 ------
        Aquatic aquatic = new Aquatic("fam", "name", 10, true, "Ocean");
        aquatic.swin();
        dolphin.swin();
        penguin.swin();

        // ----- Prosit 6 - Instruction 26 ------
        Zoo zooAqua = new Zoo("zooAqua", "Tunis");
        zooAqua.addAquaticAnimal(dolphin);
        zooAqua.addAquaticAnimal(penguin);

        System.out.println("Voici les animaux du ZooAqua \n");
        zooAqua.displayZoo();

        // Test du méthode maxPenguinSwimmingDepth //
        Penguin penguin1 = new Penguin("Spheniscidae",
                "Pingu", 5, false,
                "Antarctica", 25.0f);
        Penguin penguin2 = new Penguin("Spheniscidae",
                "Pingu", 5, false,
                "Antarctica", 300.0f);

        zooAqua.addAquaticAnimal(penguin1);
        zooAqua.addAquaticAnimal(penguin2);
        float maxDepth = zooAqua.maxPenguinSwimmingDepth();
        System.out.println("La profondeur de nage maximale des pingouins dans le zoo est : " + maxDepth + " mètres");

        // ------------ //
        // ----- Prosit 6 - Instruction 30 ------
        zooAqua.displayNumberOfAquaticsByType();
    }
}
