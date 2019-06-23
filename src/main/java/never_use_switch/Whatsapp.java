package never_use_switch;

import org.springframework.stereotype.Component;

@Component
public class Whatsapp extends MessagingApp {
    public Whatsapp(){
        id = DistribConst.WHATSAPP;
    }

}
