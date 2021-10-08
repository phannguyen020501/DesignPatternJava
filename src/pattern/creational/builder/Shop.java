package pattern.creational.builder;

public class Shop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Phone p = new Phone("Android", "Qualcom", 5.5, 3100, 13);
        System.out.println(p);
        PhoneBuilder builder = new PhoneBuilder();
        Phone p1 = builder.getPhone();
        System.out.println(p1);
    }

}
