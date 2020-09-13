package packetLog4J;

import org.apache.log4j.Logger;

public class TestcaseLog4j {
	
	static Logger log = Logger.getLogger(TestcaseLog4j.class);

	public static void main(String[] args) {
		
		
		log.debug("This is a debug log");
		log.info("This is a info log");
		log.error("There is an error in the project");
		
		
		// TODO Auto-generated method stub

	}

}
