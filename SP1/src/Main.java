

public class Main{
    public static void main(String[] args){

        Character king = new Character("King", 'W');
        Character enemy = new Character("Enemy", 'D');

        king.inventory.add("Sword");
        king.inventory.add("Shiled");

        enemy.inventory.add("Axe");
        enemy.inventory.add("Knife");

        king.printCharacterSheet();
        enemy.printInventory();

        king.attack(enemy);
        enemy.attack(king);

       king.addXP(1200);
       enemy.addXP(1000);

       king.printCharacterSheet();
       enemy.printCharacterSheet();

    }
}