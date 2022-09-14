package A_etc.mivhan.lab2;

public class FactoryUtils {
    private static int students = 0;
    private static int teachers = 0;

    public static int initRand(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static String[] professions = {"math", "chemistry", "geography", "literature", "physics", "sports"};

    public static Teacher initTeacher() {
        teachers++;
        return new Teacher("Moshe " + teachers);
    }

    public static Student initStudent() {
        students++;
        return new Student("Bar " + students);
    }

    public static Student[] initStudents(int len) {
        Student[] students = new Student[len];
        for (int i = 0; i < len; i++) {
            students[i] = initStudent();
        }
        return students;
    }

    public static ClassRoom initClassRoom(String name) {
        return new ClassRoom(name, initTeacher(), initStudents(15));
    }

    public static ClassRoom[] initClassRooms(int len) {
        ClassRoom[] classRooms = new ClassRoom[len];
        for (int i = 0; i < len; i++) {
            classRooms[i] = initClassRoom("Class " + (i + 1));
        }
        return classRooms;
    }
}
