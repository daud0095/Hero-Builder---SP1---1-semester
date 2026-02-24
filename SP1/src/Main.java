

public class Main{
    public static void main(String[] args){

        Character king = new Character("King", 'W');
        Character enemy = new Character("Enemy", 'D');

        king.inventory.add("Sword");
        king.inventory.add("Shiled");

        enemy.inventory.add("Axe");
        enemy.inventory.add("Knife");

        king.addGold(1250);
        enemy.addGold(950);

        king.heal(100);
        enemy.heal(80);

        king.printCharacterSheet();

        enemy.printInventory();

        king.attack(enemy);
        enemy.attack(king);

       king.addXP(1200);
       enemy.addXP(1000);



    }
}