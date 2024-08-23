public class LightDimCommand implements Command {
    private final Light light;
    private int previousLevel;
    private final int targetLevel;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.targetLevel = level;
    }

    @Override
    public void execute() {
        if (light instanceof KitchenRoomLight kitchenRoomLight) {
            previousLevel = kitchenRoomLight.getBrightness();
        } else if (light instanceof LivingRoomLight livingRoomLight) {
            previousLevel = livingRoomLight.getBrightness();
        }
        light.dim(targetLevel);
    }

    @Override
    public void undo() {
        light.dim(previousLevel);
    }
}

