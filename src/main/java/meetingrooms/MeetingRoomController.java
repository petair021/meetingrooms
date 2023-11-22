package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MeetingRoomController controller = new MeetingRoomController();
        controller.runMenu();
    }

    private void runMenu(){
        int meetingRooms = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= meetingRooms; i++){
            String name = scanner.nextLine();
            int width = scanner.nextInt();
            scanner.nextLine();
            int length = scanner.nextInt();
            scanner.nextLine();
            office.addMeetingRoom(name, width, length);
        }
        printMenu();
        int menuItem = scanner.nextInt();
        scanner.nextLine();
        if (menuItem == 1){

        }
        if (menuItem == 2){

        }
        if (menuItem == 3){

        }
        if (menuItem == 4){

        }
        if (menuItem == 5){

        }
        if (menuItem == 6){

        }
        if (menuItem == 7){

        }
        if (menuItem == 8){

        }
    }

    private void printMenu(){
        System.out.println(
                "1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján\n" +
                "8. Kilépés" );
    }

}
