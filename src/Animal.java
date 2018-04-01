public abstract class Animal {

    private String name;

    public Animal (String name){
        this.name = name;
    }

    public abstract void matar();

    public abstract void respirar();

    public abstract void comer();

    public abstract void dormir();

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal animal = (Animal) obj;
            return name.equals(animal.getName());
        }
        return false;
    }
}
