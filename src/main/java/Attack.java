public class Attack {
    private Player player;

    public Attack(Player player) {
        this.player = player;
    }

    public AttackEnum attack(Enemy enemy) {
        if (player.getHealth() <= 0) {
            return AttackEnum.PLAYER_DEAD;
        }
        if (enemy.getHealth() <= 0) {
            return AttackEnum.ENEMY_DEAD;
        }
        int damage = player.getCurrentWeapon.getDamage();
        enemy.reduceHealth(damage);

        if (enemy.getHealth() <= 0) {
            player.setHealth(5);
            return AttackEnum.ENEMY_DEAD;
        } else {
            player.reduceHealth(enemy.getDamage());
            return AttackEnum.PLAYER_SUCCESS;
        }
    }
}

