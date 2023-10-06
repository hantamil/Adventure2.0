import java.util.ArrayList;

public class Map {
    public Room currentRoom;

    public void buildMap() {
        Room room1 = new Room("The Campsite : The games starts in the woods.", "Where you need to survive to win.");
        Item item1 = new Item("Take a bag","and water");
        room1.addItem(item1);

        Room room2 = new Room("The meadow.","The meadow is dark and there is old fruit and a dark thick fog.");
        Item item2 = new Item("Old grapes","dead flowers");
        room2.addItem(item2);

        Room room3 = new Room("a lake,", "where it is dark and the water is still.");
        Item item3 = new Item("Fish","fishing harpoon");
        room3.addItem(item3);

        Room room4 = new Room("the north forrest,", "where all the trees have died as well as dark shadows and limbs acroos the path.");
        Item item4 = new Item("","");
        room4.addItem(item4);

        Room room5 = new Room("Ilse of Sorrow", "5 and now you're in a hive");
        Item item5 = new Item("","");
        room5.addItem(item5);

        Room room6 = new Room("The Abandoned Barn", "where there is humans remains every where and blod.");
        Item item6 = new Item("","");
        room6.addItem(item6);

        Room room7 = new Room("south forrest", "where you can see the exit but there are monsters guarding the exit");
        Item item7 = new Item("","");
        room7.addItem(item7);

        Room room8 = new Room("a place right by the exit","where the monsters village is and there can you see humans trap in a prison");
        Item item8 = new Item("","");
        room8.addItem(item8);

        Room room9 = new Room("the adventure towns main street", "the main street are filled with shops.");
        Item item9 = new Item("","");
        room9.addItem(item9);


        currentRoom = room1;

        room1.setEast(room2);
        room1.setSouth(room4);




        room2.setEast(room3);
        room2.setWest(room1);
        room2.addItem(item2);


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
