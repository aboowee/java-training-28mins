package com.in28minutes.myfiles;

public class Person {
  private int age;
  private String name;
  private String ethnicity;

  public Person (String name, int age, String ethnicity) {
    this.age = age;
    this.name = name;
    this.ethnicity = ethnicity;
  }

  public void setAge (int newAge) {
    this.age = newAge;
  }

  public void happyBirthday () {
    this.age++;
  }

  public int getAge() {
    return this.age;
  }

  public void setName (String newName) {
    this.name = newName;
    System.out.println("Hello, " + this.name);
  }
}
