package E_Purple.B.lab1;

public class ReportUtils {
    public static void info(Group group){
        System.out.println("We got " + GroupStat.numOfSmokers(group)+ " smokers");
        System.out.println("We got " + GroupStat.numOfTelavivian(group)+ " Tel-Avivian");
        System.out.println("We got " + GroupStat.numOfLiving(group,"HFA")+ " Haifas");
        System.out.println("We got " + GroupStat.numOfLiving(group,"JLM")+ " Jerosalems");
    }

}
/*

import E_Sgola.B.lab1.FactoryUtils;
import E_Sgola.B.lab1.Group;
import E_Sgola.B.lab1.ReportUtils;



        Group group = FactoryUtils.initGroup();
        ReportUtils.info(group);
        System.out.println(group);
 */
