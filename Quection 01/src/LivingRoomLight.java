public class LivingRoomLight implements Light{
    public int brightness;
    public void on(){

        System.out.println("Living Room Light Is On at Full Brightness");


    }
    @Override
    public void off(){
        brightness = 100;
        System.out.println("Living Room Light is Off");

    }
    @Override
    public void dim(int Level){
        brightness = Level;
        System.out.println("Living Room Light Is Dimmed to"+brightness+"%");

    }
    public int getBrightness(){
        return brightness;
    }
}

