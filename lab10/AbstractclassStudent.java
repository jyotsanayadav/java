abstract class Student {
    abstract void calculateGrade();
}

class EngineeringStudent extends Student {
    void calculateGrade() {
        System.out.println("Engineering Student Grade: A");
    }
}

class MedicalStudent extends Student {
    void calculateGrade() {
        System.out.println("Medical Student Grade: B");
    }
}

public class AbstractclassStudent {
    public static void main(String[] args) {

        Student s1 = new EngineeringStudent();
        Student s2 = new MedicalStudent();

        s1.calculateGrade();
        s2.calculateGrade();
    }
}