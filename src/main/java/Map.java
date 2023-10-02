public class Map {
    public Room currentRoom;

    public void buildMap() {
        Room room1 = new Room("Campsite", "get a bag and go on");
        Room room2 = new Room("The Meadow", "you're in room2");
        Room room3 = new Room("Lake Blabla", "go fishing");
        Room room4 = new Room("The North Forrest", "4 for forrest");
        Room room5 = new Room("Ilse of Sorrow", "5 and now you're in a hive");
        Room room6 = new Room("The Abandoned Barn", "6 this is where you get your fix");
        Room room7 = new Room("The South Forrest", "7 is for heaven");
        Room room8 = new Room("Main Square, Arith", "fight or buy your way to somethingsomething");
        Room room9 = new Room("Woodworker", "9 you did devine!");

        currentRoom = room1;

        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItem("Satchel", "blabla");

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

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public Room getStartingRoom(){
        return currentRoom;
    }

}
