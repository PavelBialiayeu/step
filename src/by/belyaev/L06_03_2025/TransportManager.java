
package by.belyaev.L06_03_2025;

import java.util.*;

public class TransportManager {

    private final List<Transport> transportList = new ArrayList<>();
    private final Set<Transport> uniqueTransportSet = new HashSet<>();
    private final Set<Transport> uniqueTransportTreeSet = new TreeSet<>();


    public static void addTransport(Transport transport) {
        transportList.add(TransportFactory.next());
        uniqueTransportSet.add(TransportFactory.next());
        System.out.println(transportList);
        System.out.println(uniqueTransportSet);
    }

    public static void removeTransport(String model) {
        transportList.remove("BMW");
        uniqueTransportSet.remove("BMW");
        System.out.println(transportList);
        System.out.println(uniqueTransportSet);
    }

    public static void sortTransportBySpeed() {
        Collections.sort(transportList);
        Collections.sort(uniqueTransportSet);

    }

    public static void sortTransportByModel(Transport new TransportModelComparator()) {
        Collections.sort(transportList);
        Collections.sort(uniqueTransportSet);

    }

    public static void printAllTransport() {
        System.out.println(transportList);
    }

    public static void printUniqueTransport() {
        System.out.println(uniqueTransportSet);
    }

