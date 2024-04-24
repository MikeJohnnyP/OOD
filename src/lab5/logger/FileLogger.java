package lab5.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileLogger implements Logger {

    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    public String getPathFile() {
        return fileName;
    }

    public void setPathFile(String fileName) {
        this.fileName = fileName;
    }

    public void readLogFile(String message) {
        try {
            File file = new File(System.getProperty("user.dir") + "/" + fileName);
            if (!file.exists()) {
                PrintWriter writer = new PrintWriter(file, "UTF-8");
                writer.write(message);
                writer.flush();
                writer.close();
                System.out.println("Log file written to: " + System.getProperty("user.dir") + "/" + fileName);
            } else {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                writer.append(message);
                writer.close();
                System.out.println("Log file written to: " + System.getProperty("user.dir") + "/" + fileName);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(String message) {
        readLogFile(message);
    }

}
