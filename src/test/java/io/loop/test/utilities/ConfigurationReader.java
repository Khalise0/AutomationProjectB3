package io.loop.test.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties; // private makes access only in this class. Static helps to avoid other instanses of Properties object. One initialization will be used in all tests

    static{ // we have statick block to run it firstly as soon as class is loaded
        try { // we using try catch block to catch the possible exception.
            String path = "configuration.properties"; // we have this string to provide the path/way to our file. Because file located directly in project we giving only name of the file.
            FileInputStream input = new FileInputStream(path); // we making new object to read the file
            properties = new Properties();// we making the new object to reach and maintain the list of key-value pairs
            properties.load(input);// we are reading properties from FileInputStream and loading properties to Properties to have access property through the keys.
            input.close(); //This line closes the FileInputStream to free up system resources. It's important to close streams to prevent resource leaks.
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperties(String keyName){ // this method returns the value of a property by giving it's key
        return properties.getProperty(keyName);
    }
}