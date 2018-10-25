public class Game {

    public static void startGame(){
        int turn = (int) (Math.random() * 2);
        Plant rose = new Plant();
        Zombie greg = new Zombie();
        while(rose.getHp() > 0 && greg.getHp() > 0){
            if(turn % 2 == 0)
                rose.attack(greg);
            else
                greg.attack(rose);

            turn++;
        }
        if(rose.getHp() > 0)
            System.out.println("The plant won!!!");
        else
            System.out.println("The Zombie won");
    }
}
