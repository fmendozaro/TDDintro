import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class ListTests {

    @Test
    public void addOne(){
        List<String> names = new ArrayList<String>();
        String name = "Fer";
        names.add(name);
        assertEquals(name, names.get(0));
    }
}
