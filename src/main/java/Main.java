import org.apache.logging.log4j.*;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    private static final Marker STATEMENT = MarkerManager.getMarker("STATEMENT");
    private static final Marker REQUEST = MarkerManager.getMarker("REQUEST");

    // public String poem = "Zöld erdőben jártam,\nKék ibolát láttam,\nEl akart hervadni\nSzabad-e locsolni?\n";
    // public String lines[] = poem.split("\n");

    public static void main(String[] args) throws InterruptedException {
        Main test = new Main();

        int iterations = Integer.parseInt(args[0]);
        for (int i = 0; i < iterations ; i++){

            ThreadContext.put("Iterációk száma", String.valueOf(i + 1));

            logger.debug(STATEMENT, "Zöld erdőben jártam");
            Thread.sleep(500);
            logger.debug(STATEMENT, "Kék ibolát láttam");
            Thread.sleep(500);
            logger.debug(STATEMENT, "El akart hervadni");
            Thread.sleep(500);
            logger.debug(REQUEST, "Szabad-e locsolni?\n");
            Thread.sleep(500);

        }
    }
}
