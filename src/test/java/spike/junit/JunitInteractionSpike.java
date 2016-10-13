package spike.junit;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

public class JunitInteractionSpike {

    private Subject subject = new Subject();

    @Test
    public void listSubscriberNames() {

        final Subscriber tom = new Subscriber("Tom");
        final Subscriber jerry = new Subscriber("Jerry");
        subject.subscriber(tom);
        subject.subscriber(jerry);

        final List<String> actual = subject.listSubscriberNames();

        assertThat(actual, hasItems(tom.getName(), jerry.getName()));
    }
}
