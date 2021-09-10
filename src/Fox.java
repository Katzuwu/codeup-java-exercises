public class Fox {
    public String name;
    public String sound;

    public String makeNoise(){
        return String.format("%s says %s", name, sound);
    }
}
