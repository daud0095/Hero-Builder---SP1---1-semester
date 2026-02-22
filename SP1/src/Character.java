class Character {
    int health;
    String name;
    int level;
    char classType;
    int maxHealth;
    double gold;
    int xp;

    Character(String name, char classType){
        this.name = name;
        this.classType = classType;
        this.level = 1;
        this.maxHealth = 100;
        this.health = maxHealth;
        this.gold = 0;
        this.xp = 0;
    }

    void printCharacterSheet(){
        System.out.println("Characters name: " + name + " (" + classType + ")");
        System.out.println("Characters level: " + level + " Health: " + health + "/" + maxHealth);
    }

}
