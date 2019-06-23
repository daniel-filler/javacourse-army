package my_spring;

import lombok.Setter;

import javax.annotation.PostConstruct;
import java.io.FileOutputStream;
import java.rmi.dgc.DGC;
import java.util.Comparator;

/**
 * @author Evgeny Borisov
 */
@Setter
@Benchmark
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass().getName());
    }

    public void cleanRoom() {

        speaker.say("I started");
        cleaner.clean();
        speaker.say("I finished");
    }


}
