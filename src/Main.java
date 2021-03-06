import java.util.Scanner;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String answer = "yes";

        Scanner scanner = new Scanner(System.in);

        while (answer.equals("yes")) {

            System.out.println("Votre civilité ? (male/female)"); // ask question gender in the terminal
            String gender = scanner.next(); // record string

            System.out.println("Quel est votre nom ? "); // ask question lastname in the terminal
            String lastname = scanner.next(); // record string

            System.out.println("Quel est votre prénom ? "); // ask question firstname in the terminal
            String firstname = scanner.next(); // record string

            System.out.println("Quel est votre ville ? "); // ask question city in the terminal
            String city = scanner.next(); // record string
            scanner.nextLine();

            System.out.println("Quel est votre numéro de téléphone ? "); // ask question phone number in the terminal
            String phoneNumber = scanner.next(); // record integer

            Person customer1 = new Customer(); //create a new object Customer and put it into the variable customer1
            customer1.setGender(gender); // set the gender
            customer1.setLastname(lastname); // set the lastname
            customer1.setFirstname(firstname); // set the firstname
            customer1.setCity(city); // set the city
            customer1.setPhoneNumber(phoneNumber); // set the phone number

            // display the value of the input
            System.out.println(customer1.getFullName());
            System.out.println(customer1.getCity());
            System.out.println(customer1.getPhoneNumber());

            System.out.println("Voulez vous saisir un autre client ? (yes/no)"); // ask question in the terminal
            answer = scanner.next();
        }

        System.out.println("Merci, au revoir !");
    }
}
