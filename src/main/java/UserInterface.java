import java.util.Scanner;

public class UserInterface {
    public void startProgram() {
        Adventure adventure = new Adventure();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the ADVENTURE GAME\nI hope you're ready for an adventure, brace yourself and lets get going!" +
                "First of all the rules:\nYou can move in between rooms by writing 'go north', 'go south', 'go east' and 'go west'\n" +
                "Write 'exit' if you want to stop playing, 'look' if you want a description of your surroundings and 'exit' to exit game.");

        while (true) {
            System.out.println(adventure.getCurrentRoomDescription());
            String input = keyboard.nextLine();

            /*switch (direction) {
                case "Go north" -> System.out.println("going north");
                case "Go east" -> System.out.println("going east");
                case "Go south" -> System.out.println("going south");
                case "Go west" -> System.out.println("going west");
                default -> System.out.println("Unknown character");
            }*/
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            } else if (input.equalsIgnoreCase("help")) {
                // sout help
            } else if (input.equalsIgnoreCase("look")) {
                // getDescription
            } else if (input.startsWith("go ")) {
                String direction = input.substring(3);
                String result = adventure.move(direction);
                System.out.println(result);
            } else {
                System.out.println("Unknown command. Type 'help' for commands.");
            }
        }
    }
}
