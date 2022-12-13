package day18_MemoryManagement;

public class TestContract {

    public static void main(String[] args) {

        Contract contract1 = new Contract();

        contract1.name = "Ismail";
        contract1.phoneNumber = 646965439;
        contract1.eMail = "Krklnc38@gmail.com";

        contract1.call();
        contract1.sendEmail();
        contract1.sendMessage();
    }
}
