import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;


@RunWith(value = Parameterized.class)

    public class CeasarTest {
        final private Ceasar ceasar = new Ceasar();
        private String encryptLine;
        private int keyValue;
        private String decryptLine;


        public CeasarTest (String encryptLine, int keyValue, String decryptLine) {
            this.decryptLine = decryptLine;
            this.encryptLine = encryptLine;
            this.keyValue = keyValue;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
        return Array.asList(new Object[][]{
                {"ABC", 3, "DEF"},
                {"abc", 2, "cde"},
                {"123", 4, "567"}
        });

        }

    @Test(timeout = 3000)
    public void encryption() throws Exception {
        assert Equals("Wrong key", decryptLine, ceasar.encryption(encryptLine, keyValue));
    }

    @Test (timeout = 3000)
    public void decryption() throws Exception {
        assert Equals("Wrong key", encryptLine, ceasar.decryption(decryptLine, keyValue));
    }

}


