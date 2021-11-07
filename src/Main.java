import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Friend> friendList = new ArrayList<>();

    public static void main(String[] args) {
        new Main().menuRun();
    }

    public void menuRun(){

        String[] menuItem = new String[6];

        Menu menu = new Menu("MENU:", "Choose option: ", menuItem);


        menuItem[0] = "0: Show list of friends";
        menuItem[1] = "1: Enter new friend";
        menuItem[2] = "2: Delete friend";
        menuItem[3] = "3: Save list";
        menuItem[4] = "4: Load list";
        menuItem[5] = "5: Quit";

        menu.printMenu();
        boolean checkChoice;
        int option = menu.readChoice();
        Scanner input = new Scanner(System.in);

        switch (option) {
            case 0:
                System.out.println("list of friends: ");
                new Friend().showList();
                checkChoice = true;
                break;
            case 1:
                System.out.println("You chose 'Enter new friend'"); // Hvis bruger har skrevet 2 vil den sige dette
                new Friend().enterNewFriend();
                checkChoice = true;
                break;
            case 2:
                break;
            default:
                // code block

        }
    }
}
