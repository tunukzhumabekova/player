package Player2;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
            Sportsman[] players = new Sportsman[4];

            players[0] = new Forward("John", "Doe", LocalDate.of(1995, 5, 10), 180, 75);
            players[1] = new Defender("Jane", "Smith", LocalDate.of(1998, 8, 22), 170, 65);
            players[2] = new Goalkeeper("Michael", "Johnson", LocalDate.of(1990, 3, 15), 190, 80);

            Coach coach = new Coach("Alex", "Brown");


            for (Sportsman player : players) {
                if (player instanceof Player) {
                    ((Player) player).play();
                }
                System.out.println();
            }

            coach.displayInfo();

            for (Sportsman player : players) {

                System.out.println(player);
            }




        }

    }


