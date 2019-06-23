package never_use_switch;

import org.springframework.stereotype.Component;

@Component
public class SMS extends MessagingApp {
    public SMS(){
        id = DistribConst.SMS;
    }
}
