public class LegoJedi {

    String name;
    String lightsaber;

    public LegoJedi(String name, String lightsaber) {
        this.name = name;
        this.lightsaber = lightsaber;
    }

    public void displayLightsaberColor(){
        System.out.println(name + " is using a " + lightsaber + " lightsaber.");
    }
}