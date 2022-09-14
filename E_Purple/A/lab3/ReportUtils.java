package E_Purple.A.lab3;

import E_Purple.A.lab1.Group;
import E_Purple.A.lab1.GroupStat;

import java.util.Arrays;

public class ReportUtils {
    public static void info(Group group){
        System.out.println("Welcome");
        System.out.println("group id " + group.getId());
        System.out.println("group name " + group.getName());
        System.out.println("pepole :" );
        System.out.println(Arrays.toString(group.getPeople()));
        System.out.println("===============================");
        System.out.println("number of smokers  = " + GroupStat.numOfSmokers(group));
        System.out.println("number of tlv  = " + GroupStat.numOfTLV(group));
        System.out.println("number of hfa  = " + GroupStat.numOfLiving(group,"HFA"));
        System.out.println("number of jsm  = " + GroupStat.numOfLiving(group,"JLM"));
    }
}
