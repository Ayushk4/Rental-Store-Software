import java.io.*;

public class Password {
    public String managerUsername;
    public String managerPassword;
    public String storeKeeperUsername;
    public String storeKeeperPassword;

    public Password() {
        managerUsername = new String("manager123");
        managerPassword = new String("secret123");
        storeKeeperUsername = new String("clerk");
        storeKeeperPassword = new String("password");
    }
}