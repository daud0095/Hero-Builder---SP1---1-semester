

public class Main{
    public static void main(String[] args){

        Character king = new Character("King", 'W');
        Character enemy = new Character("Enemy", 'D');

        king.inventory.add("Sword");
        king.inventory.add("Shield");
        king.inventory.add("Potion");

        enemy.inventory.add("Axe");
        enemy.inventory.add("Knife");
        enemy.inventory.add("Potion");

        king.addXP(900);
        enemy.addXP(850);


        king.addGold(1250);
        enemy.addGold(950);

        king.printCharacterSheet();
        king.printInventory();

        enemy.printCharacterSheet();
        enemy.printInventory();

        fight(king, enemy);

//        king.attack(enemy);
//        enemy.attack(king);

//        king.heal(100);
//        enemy.heal(80);

        king.removeGold(450);
        enemy.removeGold(700);

        king.printCharacterSheet();
        king.printInventory();

        enemy.printCharacterSheet();
        enemy.printInventory();

    }

 public static void fight(Character one, Character two){
       while(one.isAlive() && two.isAlive()){
           System.out.println(one.getName() + " attacks " + two.getName());
           one.attack(two);

           if(!two.isAlive()){
               System.out.println(two.getName() + " is dead");
               break;
           }

           System.out.println(two.getName() + " attacks " + one.getName());
           two.attack(one);

           if(!one.isAlive()){
               System.out.println(one.getName() + " er død.");
               break;
           }
     }
     System.out.println("Battle is over.");
     System.out.println("Winner is: " + ((one.isAlive()) ? one.getName() : two.getName()));
    }
}