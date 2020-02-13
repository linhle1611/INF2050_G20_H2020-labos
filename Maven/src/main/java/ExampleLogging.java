import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ExampleLogging {
    private static Log log = LogFactory.getLog(ExampleLogging.class);

    public static void main(String[] args) {
        log.info("info in the main method");
        log.error("error in the main method");
    }
}

