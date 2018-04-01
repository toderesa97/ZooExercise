public class Tigre extends Animal{
    public Tamanio dimension;
    public boolean esAlbino;
    public String colorPiel;

    public Tigre(String name) {
        super(name);
    }

    @Override
    public void matar() {
        System.out.println("Soy "+super.getName()+" (tigre) y mato");
    }

    @Override
    public void respirar() {
        System.out.println("Soy "+super.getName()+" (tigre) y respirar");
    }

    @Override
    public void comer() {
        System.out.println("Soy "+super.getName()+" (tigre) y comer");
    }

    @Override
    public void dormir() {
        System.out.println("Soy "+super.getName()+" (tigre) y dormir");
    }

    @Override
    public String toString() {
        return "Tigre ["+super.toString()+"]";
    }
}
