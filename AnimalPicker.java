import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validResponse = false;
        while (!validResponse) {
    System.out.println("What animal would you like to see? \n1.Dog \n2.Cat \n3.Fish \n4.Duck \n5.Duck \n6.Elephant");
    System.out.println("Please enter in the values 1-6 or the name of the animal you would like to see");
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
    } else if(response.equalsIgnoreCase("Duck") || response.equals("4")){
        System.out.println("Duck ACII Code here");
        System.out.println("    __\n___( o)>\n\\ <_. )\n `---\' ");
        validResponse = true;
    } else if(response.equalsIgnoreCase("Pig") || response.equals("5")){
        System.out.println("Pig ACII Code here");
        System.out.println(" _____  \n^..^     \\9\n(oo)_____/ \n   WW  WW");
        validResponse = true;
    } else if(response.equalsIgnoreCase("Elephant") || response.equals("6")){
        System.out.println("Elephant ACII Code here");
        System.out.println("                        ____\n                   .---\'-    \\\n      .-----------/           \\\n     /           (         ^  |   __\n&   (             \\        O  /  / .\'\n\'._/(              \'-\'  (.   (_.\' /\n     \\                    \\     ./\n      |    |       |    |/ \'._.\'\n       )   @).____\\|  @ |\n   .  /    /       (    | \n  \\|, \'_:::\\  . ..  \'_:::\\ ..\\).");
        validResponse = true;
    } else {
        System.out.println("Wrong Input");
    }

    }

        
}
}