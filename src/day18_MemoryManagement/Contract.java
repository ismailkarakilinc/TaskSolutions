package day18_MemoryManagement;

public class Contract {

    public String name;
    public long phoneNumber;
    public String eMail;

    public void setInfo(String name, long phoneNumber, String eMail) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }


    public String toString() {
        return "Contract{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", eMail='" + eMail + '\'' +
                '}';
    }
    public void call(){
        System.out.println("Calling " + name + " now.");
}
    public void sendMessage(){
        System.out.println("Sending message to " + phoneNumber + " now.");
    }
    public void sendEmail(){
        System.out.println("Sending email to " + eMail + " now.");
    }
}
/*
2. Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
 */