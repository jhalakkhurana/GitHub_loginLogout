package org.testing.Logs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CaptureLogs {

	public static void takeLogs(String classname, String message)
	{
		DOMConfigurator.configure("../GitHubLogin_Logout/layout.xml");
		
		
		BasicConfigurator.configure();
		Logger l   = Logger.getLogger(classname);
		l.info(message);
		System.out.println("Logs captured sucessfully");
	}
}
