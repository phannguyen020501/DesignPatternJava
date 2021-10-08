package pattern.behavioral.command;

public class Light {
    private boolean status;

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Status:" + (this.status ? "ON" : "OFF");
    }
}
