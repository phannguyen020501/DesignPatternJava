package pattern.creational.singleton;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection connect1 = Connection.getInstance();
        Connection connect2 = Connection.getInstance();
        System.out.println(connect1 == connect2);

        //connect = new Connection(); private->k truy cap dc
    }

}
