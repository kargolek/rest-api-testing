import java.io.*;
import java.util.Properties;

public class ReadProperties {

    private File keysProp = new File("src/main/resources/keys.properties");
    private Properties properties = new Properties();

    public Properties readProperties() {
        try {
            InputStream fileInputStream = new FileInputStream(keysProp);
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + e.getLocalizedMessage());
        }
        return properties;
    }

}
