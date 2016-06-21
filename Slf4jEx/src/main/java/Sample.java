
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {
static final Logger logger=LoggerFactory.getLogger(Sample.class);
public static void main(String[] args) {

	logger.info("this is info message");
	System.out.println("hello");
	logger.debug("this is debug message");
	logger.trace("this is trace message");
	logger.error("this is error message");
	logger.warn("this warn message");
	
	
}
}
