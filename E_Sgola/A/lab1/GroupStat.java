package E_Sgola.A.lab1;

public class GroupStat {
    public static int numOfSmokers(Group group) {
//        int sofer = 0;
//        for (int i = 0; i < group.getPeople().length; i++) {
//            if (group.getPeople()[i].isSmoking()) sofer++;
//        }
//        return sofer;
        return group.healthScore();
    }

    public static int numOfTLV(Group group) {
        return numOfLiving(group, "TLV");
    }
    public static int numOfLiving(Group group , String city){
        int sofer = 0 ;
        for (int i = 0; i < group.getPeople().length; i++) {
            sofer = (group.getPeople()[i].getCity().equals(city)) ? sofer + 1 : sofer;
        }

        return sofer;
    }
}
