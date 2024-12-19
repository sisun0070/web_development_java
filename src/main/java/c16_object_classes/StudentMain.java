package c16_object_classes;

import java.sql.SQLOutput;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("안근수","20241213");
        Student student2 = new Student("황지선","202312798");

        // 이렇게 작성하더라도 필드 내용이 나오게끔 하려면 특정 메서드가 필요합니다. -> 확인해서 override 하세요
        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.hashCode());
        System.out.println(student1.equals(student2));

//        System.out.println(student1.getName());
//        System.out.println(student1.getStudentId());
//        System.out.println(student2.getName());
//        System.out.println(student2.getStudentId());
        System.out.println();

    }
}
