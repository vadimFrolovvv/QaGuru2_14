package go;

public abstract class BaseTest {

    private String nameTest;
    private boolean aBoolean = true;

    public void getName() {
        System.out.println(nameTest);
    }

    public abstract void setName();

    public void readName(String name) {
        this.nameTest = name;
    }

    public void setResult(boolean bool) {
        this.aBoolean = bool;
    }

}
