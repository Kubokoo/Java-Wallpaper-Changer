import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
        String wallpaperStyle= readRegistryKeyString("Control Panel\\Desktop","WallpaperStyle");
        String wallPaperPath= readRegistryKeyString("Control Panel\\Desktop","WallPaper");

        Scanner scanner = new Scanner(System.in);
        String newWallPaperPath = scanner.next();


    }

    private static String readRegistryKeyString(String key,String keyName){
        String value=null;
        try {
            value = WinRegistry.readString (
                    WinRegistry.HKEY_CURRENT_USER,
                    key,
                    keyName);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return(value);
    }
}