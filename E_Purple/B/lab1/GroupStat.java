package E_Purple.B.lab1;

public class GroupStat {
    public static int numOfSmokers(Group group) {
        return group.healthScore();
    }

    public static int numOfTelavivian(Group group) {
        return numOfLiving(group, "TLV");
    }

    public static int numOfLiving(Group group, String city) {
        Person[] people = group.getPeople();
        int living = 0;
        for (Person p: people) {
            if (p.getCity() != null && p.getCity().equals(city)) living++;
        }
        return living;
    }
}
