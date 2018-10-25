public class Plant {
    private int hp = 100;
    private int strength =(int) (Math.random() * 10 + 1);

    public Plant() {
    }

    public void attack(Zombie a){
        System.out.println("The plant attacks:");
        int damage = (int) (Math.random() * 15 + 5 + strength);
        a.takeDamage(damage);
        System.out.println("The plant hits " + damage + " and the zombies hp drops to " + a.getHp());
        System.out.println();
    }

    public void takeDamage(int a){
        hp -= a;
    }

    public int getHp() {
        return hp;
    }
}
