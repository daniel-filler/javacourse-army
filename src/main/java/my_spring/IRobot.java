package my_spring;

import lombok.Setter;

import java.io.FileOutputStream;
import java.rmi.dgc.DGC;
import java.util.Comparator;

/**
 * @author Evgeny Borisov
 */
@Setter
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom() {

        speaker.say("I started");
        cleaner.clean();
        speaker.say("I finished");
    }


}
