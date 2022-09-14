package K_Simolation.API_S2.Beans;

import K_Simolation.API_S2.Utils.DateFactory;
import K_Simolation.API_S2.Utils.DateUtils;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
        private static int count = 1;
        private int id = count;
        private String name = "Person " + String.format("%02d",id);
        private LocalDate Birthday = DateFactory.getLocalDate();

        public Person() {
                count++;
        }

        public Person(int id, String name, LocalDate birthday) {
                this.id = id;
                this.name = name;
                Birthday = birthday;
        }

        public static int getCount() {
                return count;
        }

        public static void setCount(int count) {
                Person.count = count;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public LocalDate getBirthday() {
                return Birthday;
        }

        public void setBirthday(LocalDate birthday) {
                Birthday = birthday;
        }

        @Override
        public int hashCode() {
                return this.Birthday.getDayOfYear();
        }

        @Override
        public boolean equals(Object obj) {
                return super.equals(((Person) obj));
        }

        @Override
        public int compareTo(Person other) {
                return this.hashCode() - other.hashCode();
        }

        @Override
        public String toString() {
                return "Person{" +
                        "id=" + String.format("%02d",id) +
                        ", name='" + name + '\'' +
                        ", Birthday=" + DateUtils.BeautifyDate(Birthday) +
                        '}';
        }
}
