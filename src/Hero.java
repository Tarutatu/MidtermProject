public class Hero extends Character  {
    String weapon;

    public Hero(String name,int hp,String weapon) {
        super(name,hp);
        this.weapon = weapon;
    }

    public void attack(Character target){
        System.out.println(this.name + "は" + this.weapon + "で攻撃！"+ target.name + "に10のダメージを与えた！");
        target.hp -= 10;
    }
    public void heal() {
        System.out.println(this.name + "は回復呪文を唱えた！HPが20回復した！");
        this.hp += 20;
    }
}
