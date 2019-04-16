import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackTests {

    Stack names;

    @Before
    public void setUp(){
        names = new Stack();
    }

    @Test
    public void testIsEmpty(){
        assertEquals(true, names.isEmpty());
    }

    @Test
    public void testAddOne(){
        String name = "Fer";
        names.push(name);
        assertEquals(1, names.search(name));
    }

    @Test
    public void testIsNotEmpty(){
        assertEquals(false, names.isEmpty());
    }


}
