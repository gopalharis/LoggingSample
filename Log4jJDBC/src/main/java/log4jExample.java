import org.apache.log4j.Logger;


public class log4jExample {
static final Logger logger=Logger.getLogger(log4jExample.class.getName());
public static void main(String[] args) {
	logger.debug("debug");
	logger.info("info");
	logger.error("error");
	logger.fatal("fatal");
}
}
