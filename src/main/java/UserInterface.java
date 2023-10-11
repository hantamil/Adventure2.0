import java.util.Scanner;

public class UserInterface {

    public void startProgram() {
        Adventure adventure = new Adventure();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("The Story of a Warlock: Ghouls & Gemstones\nI hope you're ready for an adventure, brace yourself and lets get going!" +
                "First of all the rules:\nYou can move in between rooms by writing 'go north', 'go south', 'go east' and 'go west'\n" +
                "Write 'look' if you want a description of your surroundings, 'take' to pick up an item on your journey and 'exit' if you want to stop playing.\n" +
                "If you are ever in need of guidance simply write 'help'.\n" +
                "Press 'Enter' to start playing.");

        keyboard.nextLine();
        adventure.buildMap();
        System.out.println(adventure.getCurrentRoomDescription());


        while (true) {
            String input = keyboard.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
            else if (input.equalsIgnoreCase("help")) {
                System.out.println("You can move in between rooms by writing 'go north', 'go south', 'go east' and 'go west'\n" +
                        "Hint: not all rooms are connected! Maybe try a different direction." +
                        "Write 'exit' if you want to stop playing, 'look' if you want a description of your surroundings and 'take' to pick up an item on your journey.");
            }
            else if (input.equalsIgnoreCase("look")) {
                System.out.println(adventure.getCurrentRoomDescription());
            }
            else if (input.startsWith("go ")) {
                String direction = input.substring(3);
                String result = adventure.move(direction);
                if (result !=null){
                    System.out.println(result);
                }
            }
            else {
                System.out.println("Unknown command. Type 'help' for commands.");
                keyboard.nextLine();
            }
        }
    }
}
