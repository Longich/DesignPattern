package adapter.practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties prop;
    
    public FileProperties() {
        this.prop = new Properties();
    }
    
    @Override
    public void readFromFile(String filename) throws IOException {
        prop.load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        prop.store(new FileOutputStream(filename), "writtern by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        prop.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return prop.getProperty(key);
    }

}
