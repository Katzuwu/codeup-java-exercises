public class ReverseStringTransformer extends StringTransformer{
    public ReverseStringTransformer(String str){
        this.str = str;
    }

    @Override
    public String transform() {
        return new StringBuilder(this.str).reverse().toString();
    }
}
