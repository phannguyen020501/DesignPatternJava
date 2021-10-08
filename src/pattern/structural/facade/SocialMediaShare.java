package pattern.structural.facade;

public class SocialMediaShare {
    private FacebookShare facebookShare;
    private TwitterShare twitterShare;

    public SocialMediaShare(FacebookShare facebookShare, TwitterShare twitterShare) {
        super();
        this.facebookShare = facebookShare;
        this.twitterShare = twitterShare;
    }

    public void share(String message) {
        this.facebookShare.setMessage(message);
        this.twitterShare.setMessage(message);

        this.facebookShare.share();
        this.twitterShare.share();

    }
}
