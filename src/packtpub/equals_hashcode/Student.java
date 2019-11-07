package packtpub.equals_hashcode;

import java.util.Objects;

public class Student {
    private String name;
    private Integer age;
    private Integer yearOfPassing;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getYearOfPassing() {
        return yearOfPassing;
    }
    public void setYearOfPassing(int releaseYr) {
        this.yearOfPassing = releaseYr;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return student.name.equals(this.name) &&
                student.age.equals(this.age) &&
                student.yearOfPassing.equals(this.yearOfPassing);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.yearOfPassing.hashCode() + this.age.hashCode();
    }
}
