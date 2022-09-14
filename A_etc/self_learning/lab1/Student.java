package A_etc.self_learning.lab1;

import java.util.Comparator;
import java.util.TreeSet;

public class Student {
    private int score;
    private String name;
    private String lName;

    public Student (int score, String name, String lName){
        this.score = score;
        this.name = name ;
        this.lName = lName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Student{" +
                " " + score +
                " " + name + "  " +lName +  '\'' +
                '}';
    }
}

class myMarksComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return   s1.getlName().compareTo(s2.getlName()) + s1.getName().compareTo(s2.getName()) + (s1.getScore()-s2.getScore());
    }
}

class GFG {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<Student>(new myMarksComparator());
        set.add(new Student(150,"bar","Saadi"));
        set.add(new Student(15,"bar","Saadi"));
        set.add(new Student(115,"nar","Saadi"));
        set.add(new Student(125,"lar","Saadi"));
        set.add(new Student(135,"bar","Soso"));
        set.add(new Student(145,"bar","aaaaa"));
        set.add(new Student(145,"bar","aaaaa"));
        for (Student s : set){
            System.out.println(s);
        }

    }


}