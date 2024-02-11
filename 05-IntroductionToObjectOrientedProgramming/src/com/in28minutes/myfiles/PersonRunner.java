package com.in28minutes.myfiles;

public class PersonRunner {
  public static void main(String[] args) {
    Person randomGuy = new Person("Paul", 30, "Hispanic");

    randomGuy.setAge(32);
    randomGuy.happyBirthday();
    System.out.println(randomGuy.getAge());

    randomGuy.setName("Dom");
  }
}
