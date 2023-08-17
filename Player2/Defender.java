package Player2;

import java.time.LocalDate;
import java.time.Period;

class Defender extends Sportsman implements Player {
    public Defender(String firstName, String lastName, LocalDate birthDate, int height, int weight) {
        super(firstName, lastName, birthDate, height, weight);
    }

    @Override
    public void play() {
        System.out.println("Defender " + getFirstName() + " " + getLastName() + " is defending.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Defender: " + getFirstName() + " " + getLastName() +
                ", Age: " + Period.between(getBirthDate(), LocalDate.now()).getYears() +
                ", Height: " + getHeight() + "cm, Weight: " + getWeight() + "kg");
    }
}