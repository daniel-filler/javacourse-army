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
        for (int i = 0; i < 100; i++) {
            GameOfThroneHero hero = ObjectFactory.getInstance().createObject(GameOfThroneHero.class);
            //System.out.println("hero = " + hero);
            Assert.assertNotNull(hero.getName());
            int speed = hero.getSpeed();
            Assert.assertNotNull(speed);
            Assert.assertTrue("Error, random is too high", 7 >= speed);
            Assert.assertTrue("Error, random is too low", 3 <= speed);
        }
    }
}