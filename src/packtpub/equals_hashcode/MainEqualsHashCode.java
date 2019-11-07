package packtpub.equals_hashcode;

import java.util.HashSet;
import java.util.Set;

public class MainEqualsHashCode {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("RAYMONDS");
        s1.setAge(20);
        s1.setYearOfPassing(2011);

        Student s2 = new Student();
        s2.setName("ALLEN");
        s2.setAge(19);
        s2.setYearOfPassing(2010);

        Student s3 = new Student();
        s3.setName("MAGGY");
        s3.setAge(18);
        s3.setYearOfPassing(2012);

        Student s4 = new Student();
        s4.setName("MAGGY");
        s4.setAge(18);
        s4.setYearOfPassing(2012);

        Set<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);

        for (Student s : hashSet) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getYearOfPassing());
        }
    }
}
