public class Animal {

    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void displayAnimal(){
        System.out.println("Famille : " + family);
        System.out.println("Nom : " + name);
        System.out.println("Age : " + age);
        System.out.println("Is Mammal : " + isMammal);
    }
}
