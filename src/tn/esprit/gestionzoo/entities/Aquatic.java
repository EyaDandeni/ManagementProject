package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    private String habitat;
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic()
    {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public void swin(){
         System.out.println("This aquatic animal is swimming");
     }


     // Prosit 6 --- Instruction 31 //
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null ) {
            return false;
        }

        Aquatic aquatic = (Aquatic) obj;
        return this.getName().equals(aquatic.getName()) &&
                this.getAge() == aquatic.getAge() &&
                this.getHabitat().equals(aquatic.getHabitat());
    }
}
