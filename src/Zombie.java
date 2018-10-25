

public class Zombie {
    private int hp = 100;
    private int strength =(int) (Math.random() * 10 + 1);

    public Zombie() {
    }

    public void attack(Plant a){
        System.out.println("The zombie attacks:");
        int damage = (int) (Math.random() * 15 + 15 + strength);
        a.takeDamage(damage);
        System.out.println("The zombie hits " + damage + " and the plants hp drops to " + a.getHp());
        System.out.println();
    }

    public void takeDamage(int a){
        hp -= a;
    }

    public int getHp() {
        return hp;
    }


}
