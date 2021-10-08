package pattern.behavioral.command;

public class TurnOffCommand implements ICommand {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        this.light.turnOff();
    }
}
