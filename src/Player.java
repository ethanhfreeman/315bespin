import java.util.Random; 

public class Player {
    public int id;
    public String name;
    public String phoneNum;
    public String email;
    private String password;
    public boolean validPayment;

    public Player(String name, String phoneNum, String email, String password) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.password = password;
        this.email = email;
        id = email.hashCode();
        this.validPayment = new Random().nextBoolean();
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', email='" + email + "'}";
    }
}
