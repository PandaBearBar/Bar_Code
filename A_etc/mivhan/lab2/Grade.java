package A_etc.mivhan.lab2;
// EX One Section one
public class Grade {
    private String profession; //math , chemistry , geography, literature, physics , sports;
    private int score;


    public Grade(String profession, int score) {
        this.profession = profession;
        this.score = (score>=40&&score<=100)?score:1;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        if (score==1) System.out.printf("Invalid score of : ");
        return "Grade{" +
                "profession='" + profession + '\'' +
                ", score=" + score +
                '}';
    }
}
