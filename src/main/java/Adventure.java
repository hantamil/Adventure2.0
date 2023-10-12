import java.util.List;

public class Adventure {
    Map map = new Map();
    Player player;
    Room room;

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

    public Player viewInventory() {
        return player.viewInventory();
    }

    public boolean takeItem(String itemName) {
        return player.takeItem(itemName);
    }

    public Player dropItem(String itemName) {
        return player.dropItem(itemName);
    }

    public String printHealthDescription() {
        return player.healthDescription();
    }

    public int getHealth() {
        return player.getHealth();
    }

    public FoodEnum eatFood(String food) {
        return player.eatFood(food);
    }

    public AttackEnum attack(Enemy enemy) {
        return player.attack(enemy);
    }

    private WeaponEnum equipWeapon(String weaponName) {
        return player.equipWeapon(weaponName);
    }

    public AttackEnum playerAttack(Enemy enemy) {
        return attack(enemy);
    }

    public WeaponEnum playerEquipWeapon(String weaponName) {
        return equipWeapon(weaponName);
    }

    public String getEnemyDescription(Enemy enemy) {
        return enemy.getEnemyDescription();
    }

    public Player getPlayer(){
        return player;
    }


}
