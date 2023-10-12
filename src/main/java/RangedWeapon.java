public class RangedWeapon extends Weapon {
    private int ammo;

    public RangedWeapon(String itemName, String itemDescription, int damage, int ammo) {
        super(itemName, itemDescription, damage);
        this.ammo = ammo;
    }
}
