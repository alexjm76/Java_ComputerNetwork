public abstract class Charcater {
    protected int hp;
    protected int mp;

    WeaponBehavior weapon; // Association(더 자세한 정보를 원하면 Aggregation)

    abstract void info(); //자식클래스에서 오버라이드하면된다

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    public final void performWeapon(){ //클래스 메소드 변수 앞에 붙을 수 있다. 클래스: 상속 불가(상속이 안된다.) 메소드(상속관계에서 자식이 고치는거 불가) 변수(수정불가)

        weapon.useWeapon();
    }
    }
