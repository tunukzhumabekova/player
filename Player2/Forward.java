package Player2;

import java.time.LocalDate;
import java.time.Period;

class Forward extends Sportsman implements Player {
    public Forward(String firstName, String lastName, LocalDate birthDate, int height, int weight) {
        super(firstName, lastName, birthDate, height, weight);
    }

    @Override
    public void play() {
        System.out.println("Forward " + getFirstName() + " " + getLastName() + " is attacking.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Forward: " + getFirstName() + " " + getLastName() +
                ", Age: " + Period.between(getBirthDate(), LocalDate.now()).getYears() +
                ", Height: " + getHeight() + "cm, Weight: " + getWeight() + "kg");
    }
}

