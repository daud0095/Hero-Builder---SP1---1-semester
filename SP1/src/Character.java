import java.util.ArrayList;

class Character {
    private int health;
    private String name;
    int level;
    char classType;
    int maxHealth;
    double gold;
    int xp;

    ArrayList<String> inventory;

    Character(String name, char classType){
        this.name = name;
        this.classType = classType;
        this.level = 1;
        this.maxHealth = 100;
        this.health = maxHealth;
        this.gold = 0;
        this.xp = 0;
        this.inventory = new ArrayList<>();
    }

    public void printCharacterSheet(){
        System.out.println("\n=== CHARACTER SHEET ===");
        System.out.println("Characters name: " + name + " (" + classType + ")");
        System.out.println("Characters level: " + level + " Health: " + health + "/" + maxHealth);
        System.out.println("XP: " + xp);
        System.out.println("Gold: " + gold);
    }

    public void takeDamage(int amount){
        int oldHealth = health;
        health -= amount;
        if (health <= 0){
            health = 0;
            System.out.println(name +  " is dead");
        } else {
            System.out.println(name + " took " + amount + " damage. Health: " + oldHealth + " -> " + health);
        }
    }

    public void heal(int amount){
        int oldHealth = health;
        health += health;
        if(health > maxHealth) {
            health = maxHealth;
            System.out.println(name + " heals " + amount + " HP! Health: " + oldHealth + "/" + health);
        }
    }

    public void addGold(double amount){
        gold += amount;
    }

    public boolean removeGold(double amount){
        if(gold >= amount){
            gold -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void addXP(int amount){
        xp += amount;
        System.out.println(name + " gains " + amount + " XP Total: " + xp);
        if(xp >= 1000){
            levelUp();
        }
    }

    public void levelUp(){
        level++;
        xp = 0;
        maxHealth += 20;
        health = maxHealth;
        System.out.println(name + " leveled up! Current level is: " + level + " with max health " + maxHealth);
    }

    public boolean isHealthCritical(){
        return health < maxHealth * 0.25;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public double getHealthPercentage(){
        return (health * 100.0) / maxHealth;
    }

    void attack(Character enemy){
        int damage = (int)(Math.random() * 20) + 5; // Damage er mellem 5 og 24;
        System.out.println(name + " \nattacks " + enemy.name + " for " + damage + " damage");
        enemy.takeDamage(damage);
    }

    public void printInventory(){
        System.out.println("\nInventory:");
        if(inventory.isEmpty()){
            System.out.println("empty");
        } else {
            for(String invent : inventory){
                System.out.println(" -" + invent);
            }
        }
    }

}
