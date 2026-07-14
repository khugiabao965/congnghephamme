import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeconverterTest {

    private Gradeconverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new Gradeconverter();
    }

    @Test
    public void testConvert1() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert2() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }
}