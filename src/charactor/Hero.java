package charactor;

public class Hero {
	
    public String name;
    public float hp;
    public int damage;
    public int id;
 
    static String copyright;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getCopyright() {
		return copyright;
	}

	public static void setCopyright(String copyright) {
		Hero.copyright = copyright;
	}
    
    static {
        System.out.println("��ʼ�� copyright");
        copyright = "��Ȩ��Riot Games��˾����";
    }
	
	
}
