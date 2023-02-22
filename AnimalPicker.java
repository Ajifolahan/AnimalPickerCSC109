import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean validResponse = false;
while (!validResponse) {
    System.out.println("What animal would you like to see? \n1.Dog \n2.Cat");
    System.out.println("Please enter in the values 1-3 or the name of the animal you would like to see");
    String response = scanner.nextLine();
    if (response.equalsIgnoreCase("Dog") || response.equals("1")) {
        System.out.println("Dog ASCII Code here");
        validResponse = true;
    } else if (response.equalsIgnoreCase("Cat") || response.equals("2")) {
        System.out.println("Cat ASCII Code here");
        validResponse = true;
    }  else {
        System.out.println("Wrong Input!!!");
    }

    }

}
}


