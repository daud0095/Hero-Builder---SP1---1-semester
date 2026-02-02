String name = "King";
int HealthPoints = 85;
int maxHealth = 100;
int level = 5;
int experiencePoints = 2300;
double gold = 156.50;
boolean isAlive = true;
char classType = 'W';
String[] inventory = {"Sword", "Shield", "Potion"};

void main(){

    System.out.println("=== CHARACTER SHEET ===");
    System.out.println("Name: " + name);
    System.out.println("Class: " + classType);
    System.out.println("Level: " + level);
    System.out.println("Health: " + HealthPoints + "/" + maxHealth);
    System.out.println("XP: " + experiencePoints);
    System.out.println("Gold: " + gold);
    System.out.println("Alive: " + isAlive);

    System.out.println("\nInventory (" + inventory.length + " items):");
    System.out.println("- " + inventory[0]);
    System.out.println("- " + inventory[1]);
    System.out.println("- " + inventory[2]);



}
