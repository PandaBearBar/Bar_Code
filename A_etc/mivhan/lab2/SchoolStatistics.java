package A_etc.mivhan.lab2;
// EX Four Section one
// EX Five Section one
// EX Six Section one

import java.util.Arrays;

public class SchoolStatistics {
    public static void main(String[] args) {
        System.out.println("-----------------------------------Ex : One to Four-----------------------------------------");
        School school = new School(FactoryUtils.initClassRooms(5));
        System.out.println(school);
        System.out.println("-----------------------------------Ex : Five . 1 -----------------------------------------");
        System.out.println("The AVG of total all test at this school is : " + avgOfSchool(school));
        System.out.println("-----------------------------------Ex : Five . 2 -----------------------------------------");
        printAVG_ClassFrom(school);
        System.out.println("-----------------------------------Ex : Five . 3 -----------------------------------------");
        printAVG_Specific(school);
        System.out.println("###############################################");
        System.out.println("#Hello Kobi I would like to check EX Num : 3,4#");
        System.out.println("###############################################");
        System.out.println("-----------------------------------Ex : Six . 1 -----------------------------------------");
        System.out.println("The AVERAGE score of the ages 20 ~ 30 is : " + avgOfArrAge(school, 20, 30)); // 6 . 1
        System.out.println("-----------------------------------Ex : Six . 2 -----------------------------------------");
        System.out.println("The AVERAGE score of the ages 31+ is : " + avgOfArrAge(school, 31, 120)); // 6 . 2
        System.out.println("-----------------------------------Ex : Six . 3 -----------------------------------------");
        System.out.println("AVERAGE age of the school student : " + avgAgeStudents(school)); //6.3
        System.out.println("-----------------------------------Ex : Six . 4 -----------------------------------------");
        System.out.println("The number of Teachers that teach math and physics is : " + numOfReTeacher(school, "math", "physics"));//6.4
        System.out.println("-----------------------------------Ex : Six . 5 -----------------------------------------");
        System.out.println("The number of Teachers that teach literature and sports is : " + numOfReTeacher(school, "sports", "literature"));//6.5
        System.out.println("-----------------------------------Ex : Six . 6 -----------------------------------------");
        System.out.println("Meet The Sport Team :\n" + Arrays.toString(specialStudents(school, "sports"))); // 6 . 6


    }

    private static float avg(float totalScore, float totalTests) {
        totalScore = (totalScore > 0) ? totalScore : 1;
        totalTests = (totalTests > 0) ? totalTests : 1;
        return (totalScore / totalTests);
    }

    private static float avgOfSchool(School school) {
        float totalTests = 0;
        float totalScore = 0;
        for (ClassRoom c: school.getClassRooms()) {
            for (Student s: c.getStudents()) {
                for (Grade g: s.getGrades()) {
                    totalTests++;
                    totalScore += g.getScore();
                }
            }
        }
        return avg(totalScore, totalTests);
    }

    private static float avgOfClass(School school, String className) {
        float totalTests = 0;
        float totalScore = 0;
        for (ClassRoom c: school.getClassRooms()) {
            if (c.getName().equals(className)) {
                for (Student s: c.getStudents()) {
                    for (Grade g: s.getGrades()) {
                        totalTests++;
                        totalScore += g.getScore();
                    }
                }
            }
        }
        return avg(totalScore, totalTests);
    }

    private static void printAVG_ClassFrom(School school) {
        for (int i = 0; i < 5; i++) {
            int idx = i + 1;
            System.out.println("The AVERAGE of Class " + idx + " is : " + avgOfClass(school, "Class " + idx));
        }
    }

    private static float avgOfSpecific(School school, String professionName) {
        float totalTests = 0;
        float totalScore = 0;
        for (ClassRoom c: school.getClassRooms()) {
            for (Student s: c.getStudents()) {
                for (Grade g: s.getGrades()) {
                    if (g.getProfession().equals(professionName)) {
                        totalTests++;
                        totalScore += g.getScore();
                    }
                }
            }
        }
        return avg(totalScore, totalTests);
    }

    private static void printAVG_Specific(School school) {
        for (int i = 0; i < FactoryUtils.professions.length; i++) {
            System.out.println("The AVERAGE of the topic " + FactoryUtils.professions[i] + " is : " + avgOfSpecific(school, FactoryUtils.professions[i]));
        }
    }

    private static int avgAgeStudents(School school) {
        float totalTests = 0;
        float totalScore = 0;
        for (ClassRoom c: school.getClassRooms()) {
            for (Student s: c.getStudents()) {
                totalTests++;
                totalScore += s.getAge();
            }
        }
        return ((int) avg(totalScore, totalTests));
    } // 6 . 3

    private static int numOfReTeacher(School school, String pro1, String pro2) {
        int totalReTeacher = 0;
        for (ClassRoom c: school.getClassRooms()) {
            if (c.getTeacher().getProfession().equals(pro1) || c.getTeacher().getProfession().equals(pro2)) {
                totalReTeacher++;
            }
        }


        return totalReTeacher;
    } // 6 . 4 + 6 . 5

    private static String[] specialStudents(School school, String pro) {
        int totalTeam = 0;
        for (ClassRoom c: school.getClassRooms()) {
            for (Student s: c.getStudents()) {
                for (Grade g: s.getGrades()) {
                    if (g.getProfession().equals(pro) && g.getScore() >= 90) {
                        totalTeam++;
                    }
                }
            }
        }
        String[] students = new String[totalTeam];
        int sofer = 0;
        for (ClassRoom c: school.getClassRooms()) {
            for (Student s: c.getStudents()) {
                for (Grade g: s.getGrades()) {
                    if (g.getProfession().equals(pro) && g.getScore() >= 90) {
                        students[sofer] = s.getName();
                        sofer++;
                    }
                }
            }
        }
        return students;
    } // 6 . 6

    private static float avgOfArrAge(School school, int min, int max) {
        float totalScore = 0;
        float totalTests = 0;
        for (ClassRoom c: school.getClassRooms()) {
            for (Student s: c.getStudents()) {
                if (s.getAge() >= min && s.getAge() <= max) {
                    for (Grade g: s.getGrades()) {
                        totalTests++;
                        totalScore += g.getScore();
                    }
                }
            }
        }
        return avg(totalScore, totalTests);
    } // 6 . 1 + 6 . 2

}
