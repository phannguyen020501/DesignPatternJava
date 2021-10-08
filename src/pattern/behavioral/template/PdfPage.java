package pattern.behavioral.template;

public class PdfPage extends Page {
    @Override
    void printHeader() {
        // TODO Auto-generated method stub
        System.out.println("pdf header");

    }

    @Override
    void printBody() {
        // TODO Auto-generated method stub
        System.out.println("pdf body");

    }

    @Override
    void printFooter() {
        // TODO Auto-generated method stub
        System.out.println("pdf footer");
    }

}
