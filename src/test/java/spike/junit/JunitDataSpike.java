package spike.junit;

import org.junit.Test;

import static java.lang.Math.max;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class JunitDataSpike {

    @Test
    public void shouldReturn3_whenMax_given1And3() {
        int expected = 3;

        int actual = max(1, 3);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturn7_whenMax_given7And4() {
        int expected = 7;

        int actual = max(7, 4);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturn0_whenMax_givenDouble0() {
        assertThat(max(0, 0), is(0));
    }
}
