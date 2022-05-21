package collections;

public class Person implements Comparable {
    public String userName;
    public int age;
    public String gender;

    public Person(String userName, int age, String gender) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
