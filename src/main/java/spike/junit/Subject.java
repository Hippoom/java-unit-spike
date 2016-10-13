package spike.junit;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Subject {

    private List<Subscriber> subscribers = new ArrayList<>();

    public List<String> listSubscriberNames() {
        return subscribers.stream()
                .map(subscriber -> subscriber.getName())
                .collect(toList());
    }

    public void subscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }
}
