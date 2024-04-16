package Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCaptures {
	
	
	
	/**
	 * With the help of DOMConfigurator -
	 * To configuration between layout.xml file and LogsCapture Class we need (DOM Configurator)
	 */
	
	
	public static void takeLog(String Scenario, String message) {
		
		DOMConfigurator.configure("../Final_Daily_Whatsapp_Checklist/layout.xml");
		Logger Log = Logger.getLogger(Scenario);
		Log.info(message);
		
	}


}
