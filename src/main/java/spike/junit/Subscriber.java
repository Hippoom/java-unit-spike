package spike.junit;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void handleMessage(String message) {
        //omit very complex handling which requires external dependencies (message broker, database, to name a few)
    }
}
