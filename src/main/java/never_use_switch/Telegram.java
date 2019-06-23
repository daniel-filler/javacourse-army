package never_use_switch;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Telegram extends MessagingApp {
    public Telegram(){
        id = DistribConst.TELEGRAM;
    }


}
