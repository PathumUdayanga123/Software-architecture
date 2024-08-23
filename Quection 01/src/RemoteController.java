public class RemoteController {
    private static Command[] onCommands;
    private static Command[] offCommands;
    private static Command lastCommand;

    public RemoteController(int slots) {
        onCommands = new Command[slots];
        offCommands = new Command[slots];
        lastCommand = null;
    }

    public static void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public static void onButtonWasPressed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            lastCommand = onCommands[slot];
        }
    }

    public static void offButtonWasPressed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            lastCommand = offCommands[slot];
        }
    }

    public static void undoButtonWasPressed() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}
