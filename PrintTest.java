import org.junit.Test;
import org.junit.Assert;

public class PrintTest {

    @Test
    public void testEncription() throws Exception {
        final String string = "audiofile";
        final int key = 2;

        PrintTest printTest = new PrintTest();
        final String encriptionString = printTest.encript(string, key);

        Assert.assertEquals("cwfkqhkng", encriptionString);
    }

    @Test
    public void testDecriptions() throws Exception {

        final String string = "cwfkqhkng";
        final int key = 2;

        PrintTest printTest = new PrintTest();
        final String decriptionString = printTest.decript(string, key);

        Assert.assertEquals("audiofile", decriptionString);
    }

    @Test
    public void testEncription() throws Exception {
        final String string = "imagefile";
        final int key = 2;

        PrintTest printTest = new PrintTest();
        final String encriptionString = printTest.encript(string, key);

        Assert.assertEquals("kocighkng", encriptionString);
    }

    @Test
    public void testDecriptions() throws Exception {

        final String string = "kocighkng";
        final int key = 2;

        PrintTest printTest = new PrintTest();
        final String decriptionString = printTest.decript(string, key);

        Assert.assertEquals("imagefile", decriptionString);
    }

    @Test
    public void testEncription() throws Exception {
        final String string = "textfile";
        final int key = 2;

        PrintTest printTest = new PrintTest();
        final String encriptionString = printTest.encript(string, key);

        Assert.assertEquals("vgzvhkng", encriptionString);
    }

    @Test
    public void testDecriptions() throws Exception {

        final String string = "vgzvhkng";
        final int key = 2;

        PrintTest printTest = new PrintTest();
        final String decriptionString = printTest.decript(string, key);

        Assert.assertEquals("textfile", decriptionString);
    }
}


