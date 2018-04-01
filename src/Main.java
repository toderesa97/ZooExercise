public class Main {
    public static void main(String[] args) {
        Tigre p = new Tigre("Paco el tigre");
        Tigre p1 = new Tigre("Alfredo el tigre");
        Pinguino p2 = new Pinguino("Cubitos el pinguino");
        Pinguino p3 = new Pinguino("Hielitos the pinguin");
        Lobo p4 = new Lobo("Lobito");
        Lobo p5 = new Lobo ("Pepe el Lobo");

        Pabellon pabellon = new Pabellon();
        pabellon.add(p);
        pabellon.add(p1);
        pabellon.add(p2);
        pabellon.add(p3);
        pabellon.add(p4);
        pabellon.add(p5);


        System.out.println(pabellon.buscarAnimales("P"));

        System.out.println(pabellon);

        pabellon.remove("Lobito");
        System.out.println(pabellon);

    }
}
