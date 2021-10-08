package pattern.behavioral.template;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Page htmlpage = new HtmlPage();
        Page pdfPage = new PdfPage();

        htmlpage.print();
        pdfPage.print();
    }

}
