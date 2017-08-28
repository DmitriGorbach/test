import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    private static Properties properties = new Properties();
    private static String logFile;

    public ConfigProperties(String logFile){
        this.logFile = logFile;
    }

    public void init(){
        try {
            properties.load(new FileInputStream(logFile));
            PropertyConfigurator.configure(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
