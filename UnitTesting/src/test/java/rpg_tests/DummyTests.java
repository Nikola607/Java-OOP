package rpg_tests;

import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;
import rpg_lab.Hero;

public class DummyTests {

    @Test
    public void LooseHpIfAttacked(){
        Axe axe = new Axe(5, 10);
        Dummy dummy = new Dummy(10, 10);

        axe.attack(dummy);

        Assert.assertEquals(5, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void DeadDummy(){
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);

        axe.attack(dummy);
        axe.attack(dummy);
    }

    @Test
    public void GettingExperience(){
        Hero hero = new Hero("Pesho");
        Dummy dummy = new Dummy(10, 10);

        hero.attack(dummy);

        Assert.assertEquals(10, hero.getExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void NotGettingExperience(){
        Hero hero = new Hero("Pesho");
        Dummy dummy = new Dummy(20, 10);

        hero.attack(dummy);
    }
}
