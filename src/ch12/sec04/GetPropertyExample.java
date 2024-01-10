package ch12.sec04;
import java.util.Properties;
import java.util.Set;
public class GetPropertyExample {

	public static void main(String[] args) {

		
		String osname = System.getProperty("os.name");
		String username = System.getProperty("user.name");
		String oshome = System.getProperty("user.home");
		
		System.out.println(osname);
		System.out.println(username);
		System.out.println(oshome);
		
		System.out.println("-----------------------");
		System.out.println(" key: value");
		System.out.println("-----------------------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.printf("%-40s : %s\n",key, value);
		}
		
	}

}
