public class Day3 {
    //v0.3
    public static void main(String[] args) {
        Barbarian b1 = new Barbarian();
        Sorceress s1 = new Sorceress();
        Bow windForce = new Bow();
        Axe berserkerAce =new Axe();
        b1.setWeapon(berserkerAce);
        s1.setWeapon(windForce);
        s1.performWeapon();
        b1.performWeapon();
        s1.setWeapon(new Axe()); //활이 있지만 도끼로 장착
        s1.performWeapon();
        s1.info();
    }
}
