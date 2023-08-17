package Player2;

import java.time.LocalDate;
import java.time.Period;

class Goalkeeper extends Sportsman implements Player {
        public Goalkeeper(String firstName, String lastName, LocalDate birthDate, int height, int weight) {
            super(firstName, lastName, birthDate, height, weight);
        }

        @Override
        public void play() {
            System.out.println("Goalkeeper " + getFirstName() + " " + getLastName() + " is keeping goal.");
        }

        @Override
        public void displayInfo() {
            System.out.println("Goalkeeper: " + getFirstName() + " " + getLastName() +
                    ", Age: " + Period.between(getBirthDate(), LocalDate.now()).getYears() +
                    ", Height: " + getHeight() + "cm, Weight: " + getWeight() + "kg");
        }

    }




