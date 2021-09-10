public class Fox {
    private String name;
    private String sound;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public Fox(String name, String sound){
        this.name = name;
        this.sound = sound;
        System.out.println("This is " + name + ". " + name + " says " + sound);
    }

    public String makeNoise(){
        return String.format("%s says %s", name, sound);
    }
}
