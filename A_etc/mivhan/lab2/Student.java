package A_etc.mivhan.lab2;

import java.util.Arrays;
// EX Two Section one
//= {"math", "chemistry", "geography", "literature", "physics", "sports"};
public class Student extends Person{
    private Grade [] grades;

    public Student(String name) {
        super(name, FactoryUtils.initRand(20, 71));
//        String [] profestion = {"math", "chemistry", "geography", "literature", "physics", "sports"};
        grades = new Grade[6];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = new Grade(FactoryUtils.professions[i], FactoryUtils.initRand(40, 101));
        }
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "grades=" + Arrays.toString(grades) +
                "} " + super.toString();
    }
}
