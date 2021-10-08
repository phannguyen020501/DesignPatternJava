package pattern.behavioral.command;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        control.setCommand(new TurnOnCommand(light));
        control.pressButton();
        System.out.println(light.toString());
    }

}
