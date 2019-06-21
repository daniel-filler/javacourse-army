package my_spring;

import lombok.Data;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Data
public class GameOfThroneHero {
    @InjectRandomName
    private String name;

    @InjectRandomInt(min = 3, max = 7)
    private int speed;

}
