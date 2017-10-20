package task4;

public class Phone {
    private String model;
    private long number;

    public Phone(String model, long number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void registration(Network net) {
        if(net.checkPhone(this))
            System.out.println("Phone already registered");
        else {
            net.addPhone(this);
            System.out.println("Succesfull");
        }
    }

    public void call(Network net, long number) {
        if (net.checkPhone(number) && net.checkPhone(this))
            System.out.println("You call " + number);
        else
            System.out.println("this number is not in service");
    }
}
