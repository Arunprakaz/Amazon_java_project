package amazon.property;

import amazon.helper.configuration_reader;

public class file_reader_manager {
 
	private file_reader_manager() {
		 
	}
	
public static file_reader_manager getinstance() {
	file_reader_manager helper = new file_reader_manager();
	return helper;

}
	
public configuration_reader getinstanceCR() throws Throwable {

	configuration_reader reader = new configuration_reader();
	return reader;
}

}
