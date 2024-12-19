package c17_bean;

import lombok.Data;

public class Person {
    // 필드 선언
    private final String name;      // 필드에 final이 붙으면 생성자들을 만들 때 필수로 들어가야만 함.
    private int age;

    public Person(String name) {
        this.name = name;
    }

    // AllArgsConstructor만 만들 수 있음

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
