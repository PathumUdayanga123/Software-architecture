public class Coffee extends Bevarage {
    @Override
    void AddExtras() {

    }

    @Override
    public void brew(){

    }
    @Override
    public void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
    @Override
    public void addExtras(){
        System.out.println("Dripping coffee through filter");

    }
    @Override
    public void addNewCondiments(){
        System.out.println("Adding Vanilla Syrup");
    }
}
