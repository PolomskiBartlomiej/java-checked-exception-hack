import org.junit.Test;

import static org.junit.Assert.*;

public class CheckedExceptionUtilsTest {

    @Test(expected = CheckedException.class)
    public void toUnchecked() {
        CheckedExceptionUtils.toUnchecked(new CheckedException("throw checked exception !"));
    }
}