public class Room {
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.north = null;
        this.south = null;
        this.east = null;
        this.west = null;
    }

    public String getName () {
        return name;
    }

    public String getRoomDescription () {
        return name + "\n" + description;
    }

    public Room getNorth () {
        return north;
    }

    public Room getSouth () {
        return south;
    }

    public Room getEast () {
        return east;
    }

    public Room getWest () {
        return west;
    }

    public void setNorth(Room room){
        this.north = room;
    }

    public void setSouth(Room room){
        this.south = room;
    }

    public void setEast(Room room){
        this.east = room;
    }

    public void setWest(Room room){
        this.west = room;
    }
}
