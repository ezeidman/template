package example;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {

    @Test
    public void testToString() {
        Bar bar = ImmutableBar.builder()
                .bar("BAR")
                .build();
        Assert.assertEquals("bar = BAR", bar.toString());
    }

}