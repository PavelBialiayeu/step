package by.belyaev.L06_03_2025;

public class Main {
    public static void main(String[] args) {

        Transportmanager manager = new TransportManager();
        for (int i = 0; i < 10; i++) {
            manager.addTransport(TransportFactory.next());
        }

        test("Hi");
        test("Hi", "How");
        test();
        String[] s = new String[12];
        test(s);
    }


    public static void test(String...strings){
        String hi = strings[0];
        String how = strings[1];
    }
}
