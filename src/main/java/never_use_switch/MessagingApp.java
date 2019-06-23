package never_use_switch;

public abstract class MessagingApp {
    protected String id;

    public String getId() {
        return id;
    }

    public void sendMessage(Message message) {
        System.out.println("sent message" + message +
                " with app id " + id);
    }

}
