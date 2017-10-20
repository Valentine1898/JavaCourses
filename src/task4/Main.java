package task4;

public class Main {
    public static void main(String[] args) {
    Network network = new Network("Kyivstar");
    Phone phone1 = new Phone("IPhone", 988105497);
    Phone phone2 = new Phone("IPhone X", 788105497);
    phone1.call(network, 788105497);
    phone1.registration(network);
    phone1.call(network, 788105497);
    phone1.registration(network);
    phone2.registration(network);
    phone2.call(network, 988105497);
    }
}
