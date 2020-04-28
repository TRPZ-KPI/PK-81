package lab8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NameExceptionTest {
    private NameException nameException;
    @Before
    public void init() {
        nameException = new NameException("test");
    }

    @Test
    public void exceptionMessageTest() {
        Assert.assertEquals("test", nameException.getMessage());
    }

    @Test
    public void exceptionMessageFailTest() {
        Assert.assertNotEquals("test", nameException.getMessage());
    }

}
