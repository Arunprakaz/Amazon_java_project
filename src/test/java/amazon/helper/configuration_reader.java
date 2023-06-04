package amazon.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configuration_reader {
	public static Properties p;

	public configuration_reader() throws Throwable {
		File f = new File(
				"C:\\Users\\sys\\eclipse-workspace\\Amazon\\src\\test\\java\\amazon\\property\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
}
