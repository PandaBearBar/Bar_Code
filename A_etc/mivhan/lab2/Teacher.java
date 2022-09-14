package A_etc.mivhan.lab2;
// EX Two Section Two
public class Teacher extends Person {
    private String profession ;
    private int sofer = 0;
    private int ID = sofer;

    public Teacher(String name) {
        super(name, FactoryUtils.initRand(20, 121));
        this.profession = FactoryUtils.professions[FactoryUtils.initRand(0, 6)];
        sofer++;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSofer() {
        return sofer;
    }

    public void setSofer(int sofer) {
        this.sofer = sofer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nTeacher{" +
                "profession='" + profession + '\'' +
                "} " + super.toString();
    }
}
