import java.util.ArrayList;
import java.util.List;

public class Pabellon {
    private List<Animal> animales;

    public Pabellon (){
        animales = new ArrayList<>();
    }

    public void add (Animal animal){
        this.animales.add(animal);
    }

    public boolean remove(String name){
        int i = 0;
        while(i < animales.size()) {
            if (animales.get(i).getName().equals(name)) {
                animales.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }

    public Animal buscarAnimal(String name){
        for (Animal animal: animales) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public List<Animal> buscarAnimales(String name) {
        List<Animal> myList = new ArrayList<>();
        for (Animal animal: animales) {
            if(animal.getName().regionMatches(true, 0, name, 0, name.length())){
                myList.add(animal);
            }
        }
        return myList;
    }

    @Override
    public String toString() {
        return animales.toString();
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pabellon) {
            Pabellon other = (Pabellon) obj;
            return other.getAnimales().equals(animales);
        }
        return false;
    }
}
