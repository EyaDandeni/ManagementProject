package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    //int  nbrCages;
    private final int  nbrCages = 25;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom ne peut pas être vide ");
        }

        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Zoo(String name, String city){
        setName(name);
        this.city = city;
        //this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo(){
        /*System.out.println( "tn.esprit.gestionzoo.entities.Zoo= \n"+" name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages );*/

        for (Animal animal : animals) {
            if (animal != null) {
                animal.displayAnimal();
                System.out.println("- - - - - - - - -");
            }
        }
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }


    /* Prosit 3  -- Instruction 10 --  */
    /*public Boolean addAnimal(tn.esprit.gestionzoo.entities.Animal animal) {
        for (tn.esprit.gestionzoo.entities.Animal existingAnimal : animals) {
            if (existingAnimal != null && existingAnimal.name.equals(animal.name)) {
                System.out.println("L'animal " + animal.name + " existe déjà dans le zoo.");
                return false;
            }
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) { // si il y a une place vide dans le tableau
                animals[i] = animal;
                return true;
            }
        }
        System.out.println("Le zoo est plein.");
        return false;
    }*/


    /* Prosit 4 -- Instruction 17 --  */
    public Boolean addAnimal(Animal animal) {

        if (animal == null) {
            System.out.println("L'animal ne peut pas être null.");
            return false;
        }

        // Vérification si l'animal existe déjà dans le zoo
        for (Animal existingAnimal : animals) {
            if (existingAnimal != null && existingAnimal.getName().equals(animal.getName())) {
                System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo.");
                return false;
            }
        }


        if (isZooFull()) {
            System.out.println("Le zoo est plein.");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("L'animal " + animal.getName() + " a été ajouté avec succès.");
                return true;
            }
        }

        return false;
    }


    public int searchAnimal(Animal animal) {
        if (animal != null) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                    return i;
                }
            }
        }
        return -1;
    }


    public boolean removeAnimal(Animal animal) {
        // Vérifiez si l'animal est null
        if (animal == null) {
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                animals[i] = null;
                return true;
            }
        }

        return false;
    }

    public boolean isZooFull()
    {
        boolean full=false;
        int nbAnimals=0;
        for (int i=0 ; i<animals.length;i++){
            if(animals[i]!=null){
                nbAnimals++;
            }
        }
        if(nbAnimals==nbrCages){

            full=true;
        }
        return full;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int nbrAnimauxZoo1 = 0;
        int nbrAnimauxZoo2 = 0;

        for (Animal animal : z1.animals) {
            if (animal != null) {
                nbrAnimauxZoo1++;
            }
        }
        for (Animal animal : z2.animals) {
            if (animal != null) {
                nbrAnimauxZoo2++;
            }
        }
        if (nbrAnimauxZoo1 > nbrAnimauxZoo2) {
            return z1;
        } else if (nbrAnimauxZoo2 > nbrAnimauxZoo1) {
            return z2;
        } else {
            return null; // Si ont le mm nbr d'animaux
        }

    }
}
