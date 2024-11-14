package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{

    private float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(){}

    @Override
    public String toString() {
        return super.toString() + "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }

    public void swin(){
        System.out.println("This dolphin is swimming");
    }
}
