import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class StackTests {

    Stack<String> emptyNamesStack;
    Stack<String> oneNamesStack;
    Stack<String> manyNamesStack;

    @Before
    public void setUp(){
        emptyNamesStack = new Stack<String>();
        oneNamesStack = new Stack<String>();
        oneNamesStack.push("Fer");
        manyNamesStack = new Stack<String>();
        manyNamesStack.push("Ryan");
        manyNamesStack.push("Justin");
        manyNamesStack.push("Sophie");
        manyNamesStack.push("Daniel");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyNamesStack.isEmpty());
        assertFalse(oneNamesStack.isEmpty());
        assertFalse(manyNamesStack.isEmpty());
    }

    @Test
    public void testSize(){
        assertSame(0, emptyNamesStack.size());
        assertSame(1, oneNamesStack.size());
        assertSame(4, manyNamesStack.size());
    }

    @Test
    public void testAdd(){
        String name = "Stacey";
        emptyNamesStack.push(name);
        assertEquals(1, emptyNamesStack.search(name));
    }

    @Test
    public void testRemove(){
        assertSame(1, oneNamesStack.size());
        oneNamesStack.pop();
        assertSame(0, oneNamesStack.size());

    }

    @Test
    public void testContains(){
        assertSame(-1,emptyNamesStack.search("Fer"));
        assertSame(1,oneNamesStack.search("Fer"));
        assertSame(4,manyNamesStack.search("Ryan"));
    }
}
