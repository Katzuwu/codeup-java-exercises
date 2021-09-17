abstract public class StringTransformer {
    protected String str;

    public StringTransformer(){

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public abstract String transform();
}
