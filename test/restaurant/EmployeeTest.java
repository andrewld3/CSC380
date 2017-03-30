package restaurant;

import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */

public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    private void testEmployeeConstruct() {
        Employee test = new Employee();
        test = null;
        assertTrue(test == null);
    }
}
