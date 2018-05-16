import java.lang.reflect.InvocationTargetException;

public class mainApp {
    public static void main(String[] args) {
        String value = null;                                              //ValueName
        try {
            value = WinRegistry.readString (
                    WinRegistry.HKEY_LOCAL_MACHINE,                             //HKEY
                    "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion",           //Key
                    "ProductName");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("Windows Distribution = " + value);
    }
}