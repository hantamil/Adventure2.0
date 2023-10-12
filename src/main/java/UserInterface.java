import java.util.Scanner;

public class UserInterface {

    public void startProgram() {
        Adventure adventure = new Adventure();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("The Story of a Warlock: Ghouls & Gemstones\nI hope you're ready for an adventure, brace yourself and lets get going!" +
                "First of all the rules:\nYou can move in between rooms by writing 'go north', 'go south', 'go east' and 'go west'\n" +
                "Write 'look' if you want a description of your surroundings, 'take' to pick up an item on your journey and 'exit' if you want to stop playing.\n" +
                "If you are ever in need of guidance simply write 'help'.\n" +
                "Press 'Enter' to start playing.");

        keyboard.nextLine();
        adventure.buildMap();
        System.out.println(adventure.getCurrentRoomDescription());


        while (true) {
            String input = keyboard.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            else if (input.equalsIgnoreCase("help")) {
                System.out.println("You can move in between rooms by writing 'go north', 'go south', 'go east' and 'go west'\n" +
                        "Not all roads and paths are connected. Maybe try a different direction." +
                        "Write 'exit' if you want to stop playing, 'look' if you want a description of your surroundings and 'take' to pick up an item on your journey.");
            }

            else if (input.equalsIgnoreCase("look")) {
                System.out.println(adventure.getCurrentRoomDescription());
            }

            else if (input.startsWith("go ")) {
                String direction = input.substring(3);
                String result = adventure.move(direction);
                if (result !=null){
                    System.out.println(result);
                }
            }

            else if (input.equals("inventory") || input.equals("inv")) {
                adventure.viewInventory();
            }

            else if (input.contains("take")) {
                String[] command = input.split(" ");
                boolean successTake = adventure.takeItem(command[1]);
                if (successTake) {
                    System.out.println("You have taken " + command[1]);
                }
                else {
                    System.out.println(" You cant take this item");
                }

            }
            else if (input.startsWith("drop")) {
                adventure.dropItem(input.substring(5));
            }

            else if (input.contains("eat")) {
                String[] command = input.split(" ");
                FoodEnum isFood = adventure.eatFood(command[1]);
                if (isFood == FoodEnum.FOOD) {
                    System.out.println("You have eaten: " + command[1]);
                    System.out.println("Your health in points: " + adventure.getHealth());
                    System.out.println(adventure.printHealthDescription());
                } else if (isFood == FoodEnum.NOT_FOUND) {
                    System.out.println(command[1] + " is not available.");
                } else if (isFood == FoodEnum.NOT_FOOD) {
                    System.out.println("You cannot eat " + command[1]);
                }
            }

            else if (input.contains("health")) {
                System.out.println("Your health in points: " + adventure.getHealth());
                System.out.println(adventure.printHealthDescription());
            }

            else if (input.contains("equip")) {
                String[] command = input.split(" ");
                WeaponEnum isWeapon = adventure.playerEquipWeapon(command[1]);
                if (isWeapon == WeaponEnum.WEAPON_EQUIPPED) {
                    System.out.println("You have equipped: " + command[1]);
                } else if (isWeapon == WeaponEnum.WEAPON_NOT_FOUND) {
                    System.out.println(command[1] + " is not available.");
                } else if (isWeapon == WeaponEnum.NOT_WEAPON) {
                    System.out.println("You cannot equip " + command[1]);
                }
            } else if (input.startsWith("attack")) {
                String enemyName = input.substring(7).toLowerCase();
                Enemy enemy = adventure.getPlayer().getCurrentRoom().findEnemyByName(enemyName);
                if (enemy != null) {
                    AttackEnum attackPossible = adventure.playerAttack(enemy);
                    if (attackPossible == AttackEnum.ATTACK_MELEE) {
                        System.out.println("You attack: " + enemyName);
                        System.out.println("You dealt damage to " + enemyName + ".");
                        System.out.println("Your health: " + adventure.getPlayer().getHealth());
                        if (enemy.getHealth() > 0) {
                            System.out.println(enemyName + " health: " + enemy.getHealth());
                        } else {
                            System.out.println("You defeated " + enemyName + "!");
                        }
                    } else if (attackPossible == AttackEnum.ATTACK_RANGED) {
                        System.out.println("You shoot: " + enemyName);
                        System.out.println("You shoot at " + enemyName + ".");
                        System.out.println("Your health: " + adventure.getPlayer().getHealth());
                        if (enemy.getHealth() > 0) {
                            System.out.println(enemyName + " health: " + enemy.getHealth());
                        }
                        else {
                            System.out.println("You defeated " + enemyName + "!");
                        }
                    }
                    else if (attackPossible == AttackEnum.NO_AMMO) {
                        System.out.println("You have no ammo left.");
                    }
                }
                else {
                    System.out.println("No enemy found with the name: " + enemyName);
                }
            }

            else {
                System.out.println("Unknown command. Type 'help' for commands.");
                keyboard.nextLine();
            }
        }
    }
}
