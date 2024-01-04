import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    private static final Map<String, ContactInfo> contactList = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Address Book");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("See you later.");
                    break;
                default:
                    System.out.println("Error! Please enter 1 -> 4!");
            }
        } while (choice != 4);
    }

    //add contact method
    private static void add(){
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phone = sc.nextLine();

        ContactInfo contact = new ContactInfo(name, phone);
        contactList.put(name, contact);
        System.out.println("Added successfully!");
    }

    //find contact method
    private static void search() {
        System.out.print("Enter contact's name to find: ");
        String name = sc.nextLine();

        ContactInfo contactS = contactList.get(name);
        if (contactS != null) {
            System.out.println("Address Book");
            System.out.println("Contact Name\tPhone number");
            System.out.println(contactS.getName() + "\t\t\t" + contactS.getPhone());
        } else {
            System.out.println("Not found!");
        }
    }

    //display contact method
    private static void display() {
        System.out.println("Address Book");
        System.out.println("Contact Name\tPhone number");
        for (ContactInfo contactInfo : contactList.values()) {
            System.out.println(contactInfo.getName() + "\t\t\t" + contactInfo.getPhone());
        }
    }
}
