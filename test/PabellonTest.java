import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PabellonTest {

    @Test
    public void insertion_is_correct () {
        Tigre tigre = new Tigre("Juan");
        Lobo lobo = new Lobo("Tomas");

        Pabellon pabellon = new Pabellon();
        pabellon.add(tigre);
        pabellon.add(lobo);

        List<Animal> expected = new ArrayList<>();
        expected.add(tigre);
        expected.add(lobo);

        Assert.assertEquals(expected, pabellon.getAnimales());
    }

    @Test
    public void deletion_is_correct() {
        Pinguino pinguino = new Pinguino("Huan");

        Pabellon pabellon = new Pabellon();
        pabellon.add(pinguino);
        pabellon.remove("Huan");

        List<Animal> expected = new ArrayList<>();
        Assert.assertTrue(pabellon.getAnimales().isEmpty());
        Assert.assertEquals(expected, pabellon.getAnimales());
    }

    @Test
    public void search_by_exact_name_is_correct() {
        Pinguino pinguino = new Pinguino("TOMATE");
        Lobo lobo = new Lobo ("Amiguito");

        Pabellon pabellon = new Pabellon();
        pabellon.add(pinguino);
        pabellon.add(lobo);

        Animal actual = pabellon.buscarAnimal("TOMATE");
        Assert.assertEquals(pinguino, actual);
    }

    @Test
    public void search_by_approximate_name_case_insensitive() {
        Pinguino pinguino = new Pinguino("Tino");
        Lobo lobo = new Lobo("tImo");
        Tigre tigre = new Tigre("noti");

        Pabellon pabellon = new Pabellon();
        pabellon.add(tigre);
        pabellon.add(pinguino);
        pabellon.add(lobo);

        List<Animal> actual = pabellon.buscarAnimales("ti");

        List<Animal> expected = new ArrayList<>();
        expected.add(pinguino);
        expected.add(lobo);

        Assert.assertEquals(expected, actual);
    }

}
