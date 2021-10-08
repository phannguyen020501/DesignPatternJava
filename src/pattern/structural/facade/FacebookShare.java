package pattern.structural.facade;

public class FacebookShare implements IShare {
    private String message;

    @Override
    public void setMessage(String message) {
        // TODO Auto-generated method stub
        this.message = message;
    }

    @Override
    public void share() {
        // complicated
        System.out.println("Sharing to Facebook:" + message);

    }

}
