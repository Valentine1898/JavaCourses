package task4;

public class Network {
    private  String name;
    private  Phone phone [] = new Phone[100];
    private int value;

    public Network(String name) {
        this.value = 0;
        this.name = name;
        for (int i = 0; i < 100 ; i++) {
            phone[i] = new Phone();

        }
    }

    public boolean checkPhone(Phone phone) {
        for (int i = 0; i < 100 ; i++) {
            if (this.phone[i].getNumber() == phone.getNumber() ) {
                return true;
            }
        }
        return false;
    }
    public boolean checkPhone(long number) {
        for (int i = 0; i < 100 ; i++) {
            if (this.phone[i].getNumber() == number ) {
                return true;
            }
        }
        return false;
    }
    public void addPhone(Phone phone){
        this.phone[value] = phone;
        value ++;
    }

}
