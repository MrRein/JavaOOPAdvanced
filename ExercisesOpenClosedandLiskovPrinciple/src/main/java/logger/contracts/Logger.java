package logger.contracts;

import logger.enums.ReportLevel;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Logger {
    void logInfo(String dateAndTime, String message);
    void logWarning(String dateAndTime, String message);
    void logError(String dateAndTime, String message);
    void logCritical(String dateAndTime, String message);
    void logFatal(String dateAndTime, String message);

    void logLevel(ReportLevel level,String dateAndTime, String message);
}
