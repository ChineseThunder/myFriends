import java.util.Scanner;

public class Friend {
    String name;
    String phone;
    String email;
    private String fileName;
    public int friendNumber = 0;

    public Friend(int friendNumber, String name, String phone, String email) {
    }


    public void friend (String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
        fileName = "ListOfFriends.txt";
    }
    public Friend() {

        fileName = "ListOfFriends.txt";
    }
    public void showList() {
        System.out.println(Main.friendList);
        new Main().menuRun();
    }
    public void enterNewFriend() {
        Scanner input = new Scanner(System.in);
        System.out.print("name: ");
        setName(input.nextLine());
        System.out.print("phonenumber: ");
        setPhone(input.nextLine());
        System.out.print("E-Mail: ");
        setEmail(input.nextLine());
        for (Friend friend : Main.friendList) {
            friendNumber++;
        }
        Friend friend = new Friend(friendNumber,this.name, this.phone, this.email);
        Main.friendList.add(friend);

        System.out.println("name: " + getName());
        System.out.println("phonenumber: " + getPhone());
        System.out.println("E-Mail: " + getEmail());
        new Main().menuRun();
    }
    public String getName() {
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public String setName(String s){
        return name;
    }
    public String setPhone(String s){
        return phone;
    }
    public String setEmail(String s){
        return email;
    }
}
