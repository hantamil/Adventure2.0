public class Map {
    public Room currentRoom;

    public void buildMap() {
        Room room1 = new Room("Camp at the forrest egde", "maybe ghouls, bag, dead campfire, footprints in the ground, foggy, air makes your clothes stick uncomfortablly to your skin");
        Room room2 = new Room("The Meadow", "watch out for holes in the ground (holes if u go direction with no path, u fall and twist your ankle and loose healthpoints");
        Room room3 = new Room("Lake Baranthos", "fish for food, find fishing rod and string to go fishing, goul in the cave on the other side /go north, /go west into the waters to find gem hidden");
        Room room4 = new Room("The Northern Forrest", "lots of ghouls, gem, mostly fight");
        Room room5 = new Room("Isle of Sorrow", "fight like 5 ghouls and drop all gemstones somewhere and the sun shines and all is good");
        Room room6 = new Room("The gates of Arith", "watch out for thieves, dont loose your bag if /go east to sleep with singing gypsies, /go west overhear somebody saying dont stay here after nighttime and strongly suggest one to go through the gates before they close it for the night");
        Room room7 = new Room("The Southern Forrest", "some ghouls, gem if go keep heading west and seek inside a tree, food like nuts and berries");
        Room room8 = new Room("Main Square, Arith", "food bread and stew, /go south kill spell, /go east gemstone");
        Room room9 = new Room("The Harbour, Arith", "somehow get a boat");

        currentRoom = room1;

        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItem(new Item("Bag", "The bag is great way to store and keep all your belongings close - you will need it on your journey"));
        //room1.addItem(new Item(""));

        room2.setEast(room3);
        room2.setWest(room1);

        room3.setWest(room2);
        room3.setSouth(room6);
        room3.addItem(new Item("Blue gemstone", "One of the four gemstones Baranthos hid before his imminent death"));

        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.addItem(new Item("Yellow gemstone", "One of the four gemstones Baranthos hid before his imminent death"));

        room5.setSouth(room8);
        //room5.addItem(new Item(""));

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);
        //room1.addItem(new Item(""));
        room7.addItem(new Item("Green gemstone", "One of the four gemstones Baranthos hid before his imminent death"));

        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        //room1.addItem(new Item(""));

        room9.setNorth(room6);
        room9.setWest(room8);
        room9.addItem(new Item("Purple gemstone", "One of the four gemstones Baranthos hid before his imminent death"));
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public Room getStartingRoom(){
        return currentRoom;
    }

}
