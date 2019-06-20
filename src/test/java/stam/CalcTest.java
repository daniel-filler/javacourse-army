package stam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class CalcTest {

    @Test
    public void sum() {
        Calc calc = new Calc();
        int sum = calc.sum(2, 3);
        Assert.assertEquals(5,sum);
    }
}