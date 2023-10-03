public class Map {
    public Room currentRoom;

    public void buildMap() {
        Room room1 = new Room("The Campsite : The games starts in the woods.", "Where you need to survive to win.");
        Room room2 = new Room("The medow.","The medow is dark and there is no lifestock just a dark thick fog.");
        Room room3 = new Room("a lake,", "where it is dark and the water is a nasty green colour.");
        Room room4 = new Room("the north forrest,", "where all the trees have died as well as dark shadows and limbs acroos the path.");
        Room room5 = new Room("Ilse of Sorrow", "5 and now you're in a hive");
        Room room6 = new Room("The Abandoned Barn", "where there is humans remains every where and blod.");
        Room room7 = new Room("south forrest", "where you can see the exit but there are monsters guarding the exit");
        Room room8 = new Room("a place right by the exit","where the monsters village is and there can you see humans trap in a prison");
        Room room9 = new Room("the adventure towns main street", "the main street are filled with shops.");

        currentRoom = room1;

        room1.setEast(room2);
        room1.setSouth(room4);

        //room1.addItems(item1);

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
