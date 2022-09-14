package F_Blue.part3;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static final List<Log> logs = new ArrayList<>();
    private static Logger instance = new Logger();

    private Logger() {
    }

    public void addLog(Log log){
        logs.add(log);
    }
    public void display (){
        System.out.println(
                "  _                                    \n" +
                " | |    ___   __ _  __ _  ___ _ __   _ \n" +
                " | |   / _ \\ / _` |/ _` |/ _ \\ '__| (_)\n" +
                " | |__| (_) | (_| | (_| |  __/ |     _ \n" +
                " |_____\\___/ \\__, |\\__, |\\___|_|    (_)\n" +
                "             |___/ |___/               ");
        int line = 0;
        for (Log l : logs){
            System.out.println("line_" + line + " : " + l);
            line++;
        }
        System.out.println(

                "  _____ _____ _____ _____ _____ _____ _____ \n" +
                " |_____|_____|_____|_____|_____|_____|_____|\n" +
                "                                              "
        );
    }
    public static List<Log> getLogs(){
        return logs;
    }
    public static Logger getInstance() {
        return instance;
    }
}
