package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 19;
        student1.grade = 80;

        System.out.println("name = " + student1.name + ", age = " + student1.age + ", grade = " + student1.grade);
    }
}
