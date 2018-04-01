public class Pinguino extends Animal {

    private boolean tienePlumas;

    public Pinguino(String name) {
        super(name);
    }

    @Override
    public void matar() {
        System.out.println("Soy "+super.getName()+" (pinguino) y te mato");
    }

    @Override
    public void respirar() {
        System.out.println("Soy "+super.getName()+" (pinguino) y respiro");
    }

    @Override
    public void comer() {
        System.out.println("Soy "+super.getName()+" (pinguino) y como");
    }

    @Override
    public void dormir() {
        System.out.println("Soy "+super.getName()+" (pinguino) y duermo");
    }

    @Override
    public String toString() {
        return "Pinguino ["+super.toString()+"]";
    }
}
