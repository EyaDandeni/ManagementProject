import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    //int  nbrCages;
    final int  nbrCages = 25;

    public Zoo(String name, String city){
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public void displayZoo(){
        /*System.out.println( "Zoo= \n"+" name='" + name + '\'' +
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
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }


    /* Prosit 3  -- Instruction 10 --  */
    public Boolean addAnimal(Animal animal) {
        for (Animal existingAnimal : animals) {
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
    }


    public int searchAnimal(Animal animal) {
        if (animal != null) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] != null && animals[i].name.equals(animal.name)) {
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
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
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
