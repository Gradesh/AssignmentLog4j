import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Logging_Demo1 {

	public static Logger logger=Logger.getLogger(Logging_Demo1.class.getName());
	public static void main(String[] args)
	{
		logger.info("Tihs is log Tesing ");
		logger.log(Level.WARNING,"This is Warning ");
		logger.log(Level.SEVERE, "This is Severe");
		logger.log(Level.INFO,"This is Info");

	}

}
