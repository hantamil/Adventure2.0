public class Player {
    private Room currentRoom;
    private Item inventory;

   public Player(Room currentRoom){
       this.currentRoom = currentRoom;
       inventory = new Item();
   }

   public Item getInventory(){
       return inventory;
   }

    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }


    public String getCurrentRoomDescription(){
        return currentRoom.getRoomDescription();
    }

    public String move(String direction) {
        Room nextRoom = null;
        switch (direction) {
            case "n", "north":
                nextRoom = currentRoom.getNorth();
                break;
            case "s", "south":
                nextRoom = currentRoom.getSouth();
                break;
            case "e", "east":
                nextRoom = currentRoom.getEast();
                break;
            case "w", "west":
                nextRoom = currentRoom.getWest();
                break;
        }
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return currentRoom.getRoomDescription();
        } else {
            return "You have chosen a path that leads nowhere. Try a different path.";
        }
    }

   /* public boolean move(String direction) {
        switch (direction) {
            case "n", "north": {
                if (currentRoom.getNorth() != null) {
                    return true;
                }
                break;
            }
            case "s", "south": {
                if (currentRoom.getSouth() != null) {
                    return true;
                }
                break;
            }
            case "e", "east": {
                if (currentRoom.getEast() != null) {
                    return true;
                }
                break;
            }
            case "w", "west": {
                if (currentRoom.getWest() != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }*/
}



