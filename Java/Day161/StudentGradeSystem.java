package Java.Day161;
import java.util.*;

class Student {
    String name;
    int rollNumber;
    int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 5.0;
    }

    public char getGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
}

class GradeAnalyzer {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void analyze() {
        double classSum = 0;
        double highestAvg = -1;
        Student topper = null;

        for (Student s : students) {
            double avg = s.getAverage();
            char grade = s.getGrade();
            classSum += avg;
            System.out.println("Name: " + s.name + ", Roll: " + s.rollNumber + ", Average: " + avg + ", Grade: " + grade);
            if (avg > highestAvg) {
                highestAvg = avg;
                topper = s;
            }
        }

        if (topper != null) {
            System.out.println("\nTopper: " + topper.name + " with " + highestAvg + " average marks");
        }

        System.out.println("Class Average: " + (classSum / students.size()));
    }
}

public class StudentGradeSystem {
    public static void main(String[] args) {
        GradeAnalyzer analyzer = new GradeAnalyzer();
        analyzer.addStudent(new Student("Alice", 1, new int[]{95, 90, 92, 88, 98}));
        analyzer.addStudent(new Student("Bob", 2, new int[]{85, 80, 82, 87, 87}));
        analyzer.addStudent(new Student("Charlie", 3, new int[]{75, 72, 70, 74, 76}));
        analyzer.analyze();
    }
}