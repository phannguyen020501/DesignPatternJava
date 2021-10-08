package pattern.structural.facade;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SocialMediaShare socialMediaShare = new SocialMediaShare(new FacebookShare(), new TwitterShare());
        socialMediaShare.share("hello");

    }

}
