package org.fastcampus.student_management.domain;

public class Student {

  private final String name;
  private final int age;
  private final String address;
  private boolean activated;

  public Student(String name, int age, String address) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("이름은 필수 입력값입니다.");
    }

    this.name = name;
    this.age = age;
    this.address = address;
    this.activated = true;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }
  public boolean isActivate() {
    return activated;
  }

  public void updateActivated(boolean isActivated) {
    if (this.activated == isActivated) {
      throw new RuntimeException("같은 활성 상태로 변경할 수 없습니다.");
    }
    this.activated = isActivated;
  }
}
