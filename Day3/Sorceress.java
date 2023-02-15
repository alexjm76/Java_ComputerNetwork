public class Sorceress extends Charcater{
    public Sorceress(){
        hp =300;
        mp = 550;
    }
    @Override
    void info() {
        System.out.println("체력 : " + hp + "\n지능 : " + mp);

    }
}
