public class Adventure {
    Map map = new Map();
    Player player;

    public Adventure(){
        player = new Player(map.getCurrentRoom());
    }

    public void buildMap(){
        map.buildMap();
        player.setCurrentRoom(map.getStartingRoom());
    }

    public String getCurrentRoomDescription(){
        return player.getCurrentRoomDescription();
    }

    public String move(String direction){
        return player.move(direction);
    }

 public boolean takeItem(String itemName){
        return player.takeItem(itemName);
 }

 //public void dropItem(String itemName){
//       return player.dropItem(String itemName);
 //}




}
