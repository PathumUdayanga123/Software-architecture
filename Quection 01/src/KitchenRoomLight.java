public class KitchenRoomLight implements Light{
    public int brightness;
    @Override
    public void on(){

        System.out.println("Kitchen Room Light Is On at Full Brightness");


    }
    @Override
    public void off(){
        brightness = 100;
        System.out.println("Kitchen Room Light is Off");

    }
    @Override
    public void dim(int Level){
        brightness = Level;
        System.out.println("Kitchen Room Light Is Dimmed to"+brightness+"%");

    }
    public int getBrightness(){
        return brightness;
    }
}
