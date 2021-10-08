package pattern.behavioral.template;

public abstract class Page {
    void print() {
        System.out.println("--------------------");
        printHeader();
        printBody();
        printFooter();
        System.out.println("--------------------");

    }//template method

    abstract void printHeader();

    abstract void printBody();

    abstract void printFooter();
}
