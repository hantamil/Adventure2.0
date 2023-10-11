import java.util.ArrayList;

public class Room {
    private final String name;
    private final String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    public ArrayList<Item> itemList;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.north = null;
        this.south = null;
        this.east = null;
        this.west = null;
        itemList = new ArrayList<>();
    }

    public String getRoomDescription() {
        final String WHITE_BOLD = "\033[1;97m";
        final String RESET_BOLD = "\033[0m";
        String formattedName = WHITE_BOLD + name + RESET_BOLD;
        return formattedName + "\n" + description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public void setNorth(Room room) {
        this.north = room;
    }

    public void setSouth(Room room) {
        this.south = room;
    }

    public void setEast(Room room) {
        this.east = room;
    }

    public void setWest(Room room) {
        this.west = room;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Item removeItem(String item) {
        itemList.remove(item);
        return null;
    }

    public ArrayList<Item> getItemList(){
        return itemList;
    }
}
