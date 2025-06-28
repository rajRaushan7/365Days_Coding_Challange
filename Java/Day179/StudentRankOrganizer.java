import java.util.*;

class Student {
    String name;
    int marks;
    int rollNumber;

    public Student(String name, int marks, int rollNumber) {
        this.name = name;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }
}

public class StudentRankOrganizer {

    public static void main(String[] args) {
        Student[] students = {
            new Student("Raj", 85, 102),
            new Student("Anita", 92, 101),
            new Student("Vikram", 85, 100),
            new Student("Priya", 95, 103),
            new Student("Ravi", 92, 104)
        };

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s2.marks != s1.marks) {
                    return s2.marks - s1.marks; // Descending marks
                } else {
                    return s1.rollNumber - s2.rollNumber; // Ascending roll number
                }
            }
        });

        int rank = 1;
        for (Student s : students) {
            System.out.println(rank + ". " + s.name + " (Roll No: " + s.rollNumber + "): " + s.marks);
            rank++;
        }
    }
}