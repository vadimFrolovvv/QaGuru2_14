package go;

import java.io.IOException;

public class Test extends BaseTest{

    private char aChar;

    @Override
    public void setName() {
        try {
            aChar = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

