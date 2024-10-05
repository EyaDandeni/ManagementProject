import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int  nbrCages;

    public Zoo(String name, String city,int nbrCages){
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public void displayZoo(){
        System.out.println( "Zoo= \n"+" name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages );
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
}
