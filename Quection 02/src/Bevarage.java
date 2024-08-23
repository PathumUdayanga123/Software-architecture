abstract class Bevarage {
    abstract void AddExtras();

    void boilWater(){
        System.out.println("Boilling Water");
    }

    void pourInCup(){
        System.out.println("Pouring into Cup");
    }
     public final void TemplateMethod(){
        brew();
        boilWater();
        addExtras();
        pourInCup();
        addCondiments();
        addNewCondiments();

     }

    public abstract void brew();

    public abstract void addCondiments();

    public abstract void addExtras();

    public void setWantsExtras(boolean teaExtras) {

    }

    public abstract void addNewCondiments();
}
