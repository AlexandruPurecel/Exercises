package Chapter1;

import java.util.Scanner;

public class VehicleSpeedMonitor {

    void main() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Vehicle Type: ");
            String type = sc.nextLine();
            System.out.print("Enter Speed: ");
            int speed = Integer.parseInt(sc.nextLine());
            if(speed < 0){
                System.out.println("Exiting system…");
                break;
            }
            switch (type) {

                case "Car" -> {
                    String checkSpeed = speed < 100 ? "Ok" : "Speeding!";
                    System.out.println(checkSpeed);
                }
                case "Bus" -> {
                    String checkSpeed = speed < 80 ? "Ok" : "Speeding!";
                    System.out.println(checkSpeed);

                }
                case "Bike " -> {
                    String checkSpeed = speed < 60 ? "Ok" : "Speeding!";
                    System.out.println(checkSpeed);
                }

                default -> System.out.println("Unknown Type");
            }
        }
        sc.close();

    }


}
