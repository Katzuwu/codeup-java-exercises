public class UpperCaseStringTransformer extends StringTransformer{
    public UpperCaseStringTransformer(String str){
        this.str = str;
    }

    @Override
    public String transform() {
       return this.str.toUpperCase();
    }
}
