package my_spring;

import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    public void say(String message) {
        System.out.println(message);
    }
}
