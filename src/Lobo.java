public class Lobo extends Animal{

    private String colorPiel;
    private Tamanio dimension;

    public Lobo(String name) {
        super(name);
    }

    @Override
    public void matar() {
        System.out.println("Soy "+super.getName()+" (lobo) y mato");
    }

    @Override
    public void respirar() {
        System.out.println("Soy "+super.getName()+" (lobo) y respiro");
    }

    @Override
    public void comer() {
        System.out.println("Soy "+super.getName()+" (lobo) y como");
    }

    @Override
    public void dormir() {
        System.out.println("Soy "+super.getName()+" (lobo) y duermo");
    }

    @Override
    public String toString() {
        return "Lobo ["+super.toString()+"]";
    }
}
