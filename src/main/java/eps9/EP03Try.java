package eps9;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EP03Try {

    @Test
    public void testTry7() {
        String data = "Hello, Java 7!\r\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        char[] cbuf = new char[20];
        int len;
        try {
            if ((len = inputStreamReader.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // In Java 8, resource will be closed automatically, but has to be defined inside try()
    @Test
    public void testTry8() {
        String data = "Hello, Java 8!\r\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        char[] cbuf = new char[20];
        int len;
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
            if ((len = inputStreamReader.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // In Java 9 +, resource does not have to be defined inside try()
    @Test
    public void testTry9() {
        String data = "Hello, Java 9!\r\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        char[] cbuf = new char[20];
        int len;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        try (inputStreamReader) {
            if ((len = inputStreamReader.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
