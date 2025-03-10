package by.belyaev.L10_03_2025transport;

public class Main {
    public static void main(String[] args) {

        Transportmanager manager = new TransportManager();
        for (int i = 0; i < 10; i++) {
            manager.addTransport(TransportFactory.next());
        }


    }



}
