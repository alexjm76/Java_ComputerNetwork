public class Pokemon {
    static int count = 0;
    private String hiddenOwner;
    public String[] skills;

    public Pokemon(String owner, String skills) {
        this.hiddenOwner = owner;
        this.skills = skills.split("/");
        System.out.print("포켓몬 생성 : ");
        count++;
    }

    public String getOwner() {
        return hiddenOwner;
    }

    public void setOwner(String owner) {
        this.hiddenOwner = owner;
    }

    public void attack(int idx) {
        System.out.println("[삐까삐까] " + hiddenOwner + "의 " + "가 " + skills[idx] + " 공격 시전!");
    }
}

class Ggoboogi extends Pokemon {
    public Ggoboogi(String owner, String skills) {
        super(owner, skills);
    }

    @Override
    public void attack(int idx) {
        System.out.println("[꼬북꼬북] " + getOwner() + "의 " + "가 " + skills[idx] + " 공격 시전!");
    }

    public void swim() {
        System.out.println("가 수영을 합니다");
    }
}

class ParuParu extends Pokemon {
    public ParuParu(String owner, String skills) {
        super(owner, skills);
    }

    @Override
    public void attack(int idx) {
        System.out.println("[파읠파읠] " + getOwner() + "의 " + "가 " + skills[idx] + " 공격(불) 시전!");
    }
}

public class Pokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("총 " + Pokemon.count + "마리의 포켓몬이 생성되었습니다");
            System.out.print("1) 포켓몬 생성  2) 프로그램 종료 : ");
            String menu = sc.nextLine();

            if (menu.equals("2")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }

        sc.close();
    }
}
