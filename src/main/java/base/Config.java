package base;

import java.util.Properties;

import static com.jdiai.tools.PropertyReader.getProperties;

public class Config {

    public static String envPropertyPath = "./config/env/%s.properies";
    public static String env = System.getProperty("env", "test");

    public static Properties props = getProperties(String.format(envPropertyPath, env));

    public static String appBaseURL = props.getProperty("app.baseURL");


}
