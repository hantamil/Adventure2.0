import java.util.Scanner;

public class UserInterface {

    private Adventure adventure;

    public UserInterface() {
        adventure = new Adventure();
        adventure.buildMap();
    }

    public void startGame() {
        Adventure adventure = new Adventure();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the ADVENTURE GAME\nI hope you are ready for an adventure, brace yourself and lets get going!\n" +
                "If you need help simply type 'help'.\n" +
                "Press 'Enter' to start playing.");

        keyboard.nextLine();
        adventure.buildMap();
        System.out.println(adventure.getCurrentRoomDescription());



        while (true) {
            System.out.println("\n" + "Where do you want to go next?");
            String input = keyboard.nextLine();

            switch (input.toLowerCase()) {

                case "exit":
                    if (input.equalsIgnoreCase("exit")) {
                        System.out.println("Thanks for playing! Goodbye.");
                        return;
                    }

                case "help":
                case "h":
                    System.out.println("You can move in between rooms by writing 'go north', 'go south', 'go east' and 'go west'\n" +
                            "Hint: not all rooms are connected! Maybe try a different direction." +
                            "Write 'exit' if you want to stop playing, \n" +
                            "Type 'look' if you want a description of your surroundings and 'take' to pick up an item on your journey.");
                    break;

                case "look":
                case  "l":
                    System.out.println(adventure.toString().toLowerCase());
                    System.out.println(" You are in the following room:" + " " + adventure.getCurrentRoomDescription());
                    break;

                case "drop":
                    System.out.println("what do you wanna ad");
                    String drop = keyboard.nextLine();
                    for(Item Items : adventure.map.getCurrentRoom().)
                    if(drop.equalsIgnoreCase(drop)){
                        adventure.map.currentRoom.removeItem(drop);
                        System.out.println("Item has been dropped" + drop + "in the room)");
                    }
                    break;

                case "take":
                    System.out.println("What item do you want to take with you?");
                    String take = keyboard.nextLine();
                    if(adventure.map.getCurrentRoom().removeItem(take);
                    if()
                    break;

                default:
                    if (input.startsWith("go")) {
                        String direction = input.substring(3);
                        String result = adventure.move(direction);
                        if (result != null) {
                            System.out.println(result);
                        }
                    } else {
                        System.out.println("Unknown command. Type 'help' for commands.");
                        keyboard.nextLine();
                    }
                    break;
            }
        }
    }
}
