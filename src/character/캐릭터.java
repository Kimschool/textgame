package character;

public class 캐릭터 {

	private String id;
	private int 직업;
	private int 레벨;
	private int hp;
	private int mp;
	private int 소지금;
	private int 경험치;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int get직업() {
		return 직업;
	}
	public void set직업(int 직업) {
		this.직업 = 직업;
	}
	public int get레벨() {
		return 레벨;
	}
	public void set레벨(int 레벨) {
		this.레벨 = 레벨;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int get소지금() {
		return 소지금;
	}
	public void set소지금(int 소지금) {
		this.소지금 = 소지금;
	}
	public int get경험치() {
		return 경험치;
	}
	public void set경험치(int 경험치) {
		this.경험치 = 경험치;
	}
	@Override
	public String toString() {
		return "캐릭터 [id=" + id + ", 직업=" + 직업 + ", 레벨=" + 레벨 + ", hp=" + hp + ", mp=" + mp + ", 소지금=" + 소지금 + ", 경험치="
				+ 경험치 + "]";
	}



}
