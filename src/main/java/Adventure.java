public class Adventure {
    private Room currentRoom;

    public Adventure() {
        Room room1 = new Room("Camp", "Welcome to room1 our home for now this is the first description");
        Room room2 = new Room("Room 2", "you're in room2");
        Room room3 = new Room("Room 3", "test for room3");
        Room room4 = new Room("The North Forrest", "4 for forrest");
        Room room5 = new Room("Ilse of Sorrow", "5 and now you're in a hive");
        Room room6 = new Room("Room 6", "6 this is where you get your fix");
        Room room7 = new Room("The South Forrest", "7 is for heaven");
        Room room8 = new Room("Room 8", "and 8 now you're bait");
        Room room9 = new Room("Room 9", "9 you did devine!");

        currentRoom = room1;

        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setEast(room3);
        room2.setWest(room1);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
    }

    public String move(String direction) {
        Room nextRoom = switch (direction) {
            case "north" -> currentRoom.getNorth();
            case "east" -> currentRoom.getEast();
            case "south" -> currentRoom.getSouth();
            case "west" -> currentRoom.getWest();
            default -> null;
        };

        if (nextRoom != null) {
            currentRoom = nextRoom;
            return currentRoom.getRoomDescription();
        } else {
            return "You cannot go that way. Please choose another path.";
        }
    }
}
