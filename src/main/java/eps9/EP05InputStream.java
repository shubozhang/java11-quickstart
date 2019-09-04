package eps9;

import org.junit.Test;
import java.io.*;

public class EP05InputStream {

    @Test
    public void testTransferTo() {
        ClassLoader cl = this.getClass().getClassLoader();
        InputStream is = cl.getResourceAsStream("hello_input.txt");
        OutputStream os = null;
        try(is) {
            os = new FileOutputStream("hello_output.txt");
            is.transferTo(os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
