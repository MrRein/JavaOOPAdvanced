package logger.io;

import logger.contracts.IConsoleInputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ConsoleInputReader implements IConsoleInputReader {

    private BufferedReader reader;

    public ConsoleInputReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readLine() {
        String result = null;

        try {
            result = this.reader.readLine();
        } catch (IOException e) {
        }

        return result;
    }
}
