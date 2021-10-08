package pattern.structural.facade;

public class TwitterShare implements IShare {
    private String message;

    @Override
    public void setMessage(String message) {
        // TODO Auto-generated method stub
        this.message = message;
    }

    @Override
    public void share() {
        // complicated
        System.out.println("Sharing to Twitter:" + message);

    }

}
