import java.util.*;

class Student {
    private String name;
    private int id;
    private List<Integer> marks;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.marks = new ArrayList<>();
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public double getAverage() {
        if (marks.isEmpty()) return 0;
        int sum = 0;
        for (int mark : marks) sum += mark;
        return (double) sum / marks.size();
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public void printDetails() {
        System.out.printf("Name: %s, ID: %d, Average: %.2f, Grade: %s%n", name, id, getAverage(), getGrade());
    }
}

public class StudentGradeSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);
        Student s3 = new Student("Carol", 103);

        s1.addMark(80);
        s1.addMark(90);
        s1.addMark(90);

        s2.addMark(50);
        s2.addMark(40);
        s2.addMark(45);

        s3.addMark(95);
        s3.addMark(89);
        s3.addMark(89);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}