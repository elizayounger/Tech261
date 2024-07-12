package com.sparta.ey.scratch;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class LoggerSetUp {

    public static final Logger logger = Logger.getLogger(LoggerSetUp.class.getName());

    public static void loggerSetUp() {
        ConsoleHandler consoleHandler = new ConsoleHandler();

        consoleHandler.setFormatter(new ColorCodedFormatter());

        logger.addHandler(consoleHandler);

        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/log-file.log", false); // boolean as to whether you want to append or replace.
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new LogFileFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false); // default ConsoleHandler. have to disable it and setup new one.
    }

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String ORANGE = "\u001B[38;5;208m";
    private static final String YELLOW = "\u001B[33m";
    private static final String GREEN = "\u001B[32m";
    private static final String LIGHT_BLUE = "\u001B[94m";
    private static final String DARK_BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";

    // Custom formatter that applies color based on log level
    static class ColorCodedFormatter extends Formatter {

        @Override
        public String format(LogRecord record) {
            String color;
            switch (record.getLevel().getName()) {
                case "SEVERE":
                    color = RED;
                    break;
                case "WARNING":
                    color = ORANGE;
                    break;
                case "INFO":
                    color = YELLOW;
                    break;
                case "CONFIG":
                    color = GREEN;
                    break;
                case "FINE":
                    color = LIGHT_BLUE;
                    break;
                case "FINER":
                    color = DARK_BLUE;
                    break;
                case "FINEST":
                    color = PURPLE;
                    break;
                default:
                    color = RESET;
                    break;
            }
            return color + record.getLevel() + ": " + formatMessage(record) + RESET + "\n";
        }
    }

    public static class LogFileFormatter extends Formatter {
        private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        @Override
        public String format(LogRecord record) {
            String level = record.getLevel().getName();
            String message = formatMessage(record);
            String source = record.getSourceClassName() + "." + record.getSourceMethodName() + "." + record.getSequenceNumber();
            String dateTime = dateFormat.format(new Date(record.getMillis()));

            return String.format("%s: \"%s\" | %s | %s%n", level, message, source, dateTime);
        }
    }
}
