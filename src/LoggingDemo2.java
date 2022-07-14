import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class LoggingDemo2 {

	public static Logger logger=Logger.getLogger(LoggingDemo2.class.getName());
	public static void main(String[] args) 
	{
		logger.setLevel(Level.INFO);
		
		logger.info("This is an Info");
		logger.warning("This is an Warning logger ");
		logger.severe("This is an Severe Logger ");
		logger.config("This is an Config Logger");
		System.out.println("Logging Mechanism");	
				
		

	}

}
