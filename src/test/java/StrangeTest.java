import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class StrangeTest {

    @Test
    @Disabled
    public void shouldFail() {
        fail("By design");
    }
}