String name = "King";
int health = 85;
int maxHealth = 100;
int level = 5;
int experiencePoints = 2300;
double gold = 156.50;
boolean isAlive = true;
char classType = 'W';
String[] inventory = {"Sword", "Shield", "Potion"};
int incomingDamage = 30;

void main(){

    System.out.println("=== CHARACTER SHEET ===");
    System.out.println("Name: " + name);
    System.out.println("Class: " + classType);
    System.out.println("Level: " + level);
    System.out.println("Health: " + health + "/" + maxHealth);
    System.out.println("XP: " + experiencePoints);
    System.out.println("Gold: " + gold);
    System.out.println("Alive: " + isAlive);

    System.out.println("\nInventory (" + inventory.length + " items):");
    for(String item : inventory) {
        System.out.println("- " + item);
    }

//    for(int i = 0; i < inventory.length; i++){
//        System.out.println("- " + inventory[i]);
//    }
//    System.out.println("- " + inventory[0]);
//    System.out.println("- " + inventory[1]);
//    System.out.println("- " + inventory[2]);

    System.out.println("\n=== STATUS ===");

    if (health <= 0) {
        isAlive = false;
        System.out.println("The king has fallen!(");
    } else if (health < maxHealth * 0.25) {
        System.out.println("WARNING: Health critical");
    }

    switch (classType) {
        case 'W':
            System.out.println("You are big and strong warrior");
            break;
        case 'M':
            System.out.println("You are bad mage");
            break;
        case 'R':
            System.out.println("You are sneaky Rogue");
            break;
        default:
            System.out.println("Unknown class");
    }

    int levelUpThreshold = 1000 * level;
    if (experiencePoints >= levelUpThreshold) {
        System.out.println("\nReady to level op");
    }

    System.out.println("\n=== COMBAT ===");

    if(incomingDamage >= health) {
        System.out.println(name + " takes " + incomingDamage + " damage!");
        System.out.println("Health: " + health + " -> 0");
        health = 0;
        isAlive = false;
        System.out.println(name + " is dead.");
    } else {
        System.out.println(name + " takes " + incomingDamage + " damage!");
        System.out.println("Health: " + health + " -> " + (health - incomingDamage));
        health -= incomingDamage;
        isAlive = true;
        System.out.println(name + " is still alive.");
    }




}
