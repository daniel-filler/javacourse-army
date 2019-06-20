package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class GameOfThroneHeroTest {

    @Test
    public void injectRandomIsSupportedByObjectFactory() {
        GameOfThroneHero hero = ObjectFactory.getInstance().createObject(GameOfThroneHero.class);
        System.out.println("hero = " + hero);
        Assert.assertNotNull(hero.getName());
    }
}