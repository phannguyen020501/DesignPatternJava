package pattern.behavioral.command;

public class TurnOnCommand implements ICommand {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        this.light.turnOn();
    }

}
