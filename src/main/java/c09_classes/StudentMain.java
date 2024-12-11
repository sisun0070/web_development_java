package c09_classes;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(123456, "이일");

        student.showInfo();

        Student02 Student02 = new Student02("이이");
        Student02 Student03 = new Student02(123456);
        Student02 Student04 = new Student02(987654,"이삼");
        Student02 Student05 = new Student02(654321,"이사",100.0);



    }
}
