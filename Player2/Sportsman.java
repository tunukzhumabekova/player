package Player2;

import java.time.LocalDate;
import java.time.Period;

abstract class Sportsman {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int height;
    private int weight;

    private  int age;

    public Sportsman(String firstName, String lastName, LocalDate birthDate, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Period.between(birthDate,LocalDate.now()).getYears();
        this.height = height;
        this.weight = weight;
    }

    // Геттеры и сеттеры для полей

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Абстрактный метод для вывода информации о спортсмене
    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Sportsman{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
