package F_Blue.part1;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static final List<Log> logs = new ArrayList<>();

    public static List<Log> getLogs(){
        return logs;
    }

    @Override
    public String toString() {
        return "Logger{}";
    }
    public void addLog(Log log){
        logs.add(log);
    }
    public void display (){
        System.out.println(": Logs Time :");
        for (Log l : logs){
            System.out.println(l);
        }
        System.out.println("-----------");
    }
}
