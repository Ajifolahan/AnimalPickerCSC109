import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        System.out.println("Hey");
        Scanner scanner = new Scanner(System.in);
        boolean validResponse = false;
        while (!validResponse) {
    System.out.println("What animal would you like to see? \n1.Dog \n2.Cat \n3.Fish");
    System.out.println("Please enter in the values 1-3 or the name of the animal you would like to see");
    String response = scanner.nextLine();
    if (response.equalsIgnoreCase("Dog") || response.equals("1")) {
        System.out.println("Dog ASCII Code here");
        System.out.println("            __\n(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
        validResponse = true;
    } else if (response.equalsIgnoreCase("Cat") || response.equals("2")) {
        System.out.println("Cat ASCII Code here");
        System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
        validResponse = true;
    } else if (response.equalsIgnoreCase("Fish") || response.equals("3")) {
        System.out.println("Fish ASCII Code here");
        System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
        validResponse = true;
    } else {
        System.out.println("Wrong Input");
    }

    }

}
}


