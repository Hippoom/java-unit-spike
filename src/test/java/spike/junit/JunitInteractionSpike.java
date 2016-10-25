package spike.junit;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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

    @Test
    public void tellSubscribersToHandleWelcome() {

        final Subscriber tom = mock(Subscriber.class, "tom");
        final Subscriber jerry = mock(Subscriber.class, "jerry");
        subject.subscriber(tom);
        subject.subscriber(jerry);

        final String message = "welcome";

        subject.tell(message);

        verify(tom).handleMessage(message);
        verify(jerry).handleMessage(message);
    }

    //@Test
//    public void shouldTellEverySubscriberToShutDown() {
//
//    }

//    @Test
//    public void shouldTellIfAnySubscriberAlive() {
//
//    }
}
