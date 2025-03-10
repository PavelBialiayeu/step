
package by.belyaev.L10_03_2025transport;

import java.util.*;

public class TransportManager {


    private static final Map<String, Transport> transportByPlate = new HashMap<>();
    private static final Map<String, List<Transport>> transportByType = new HashMap<>();

    public static void addTransport(Transport transport) {
        Transport tr = TransportFactory.next();
        transportByPlate.put(tr.getLicensePlate(), transport);


        transportByType.put();

        System.out.println(transportByPlate);
        System.out.println(transportByType);
    }

    public static void removeTransport(String licensePlate) {
        transportByPlate.remove("7455 IK-2");
        transportByType.remove("7455 IK-2");
        System.out.println(transportByPlate);
        System.out.println(transportByType);
    }

    public void findTransportByPlate(String licensePlate) {
        findTransportByPlate("9698 AM-2");
    }

    public static void printAllTransport(Map<String, Transport> transportByPlate) {
        printAllTransport(TransportManager.transportByPlate);
    }
}
