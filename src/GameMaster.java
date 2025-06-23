public class GameMaster {
    public static void main(String[] args) {
        Hero hero = new Hero("アベル",100,"銅の剣");
        Slime slime = new Slime("スライムA",30);
        System.out.println("冒険が始まる…！");

        hero.showStatus();
        slime.showStatus();

        System.out.println("戦闘開始！");

        hero.attack(slime);
        slime.showStatus();
        slime.attack(hero);
        hero.showStatus();
        hero.heal();
        hero.showStatus();
        for(int i = 0; i<3; i++) {
            hero.attack(slime);
        }
        System.out.println("--- 戦闘終了 ---");
        System.out.println("最終ステータス：");
        hero.showStatus();
        slime.showStatus();
        hero.isAlive();
        slime.isAlive();
        System.out.println("アベルは生きている：" + hero.isAlive());
        System.out.println("スライムAは生きている：" + slime.isAlive());
        System.out.println("--- 参照の確認 ---");
        Character partyMember = hero;
        partyMember.hp -= 50;
        System.out.println("partyMember経由でHPを減らした後：");
        hero.showStatus();
    }
}
