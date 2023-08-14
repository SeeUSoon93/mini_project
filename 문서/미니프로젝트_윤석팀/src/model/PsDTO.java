package model;

public class PsDTO {

	// 공주 테이블
	private String id; // 회원id 포리너키
	private String name; // 공주이름
	private int str; // 힘
	private int intel; // 지능
	private int money; // 재력
	private int charm; // 매력
	private int mor; // 도덕성
	private int story; // 스토리진행도
	private int exCount;


	public PsDTO(String id, String name, int str, int intel, int money, int charm, int mor, int exCount, int story) {
		super();
		this.id = id;
		this.name = name;
		this.str = str;
		this.intel = intel;
		this.money = money;
		this.charm = charm;
		this.mor = mor;
		this.exCount = exCount;
		this.story = story;
	}
	
	public PsDTO(String id, int exCount, int story) {
		super();
		this.id = id;
		this.exCount = exCount;
		this.story =story;
	}
	
	public PsDTO(String id, int str, int intel, int money, int charm, int mor) {
		super();
		this.id = id;
		this.str = str;
		this.intel = intel;
		this.money = money;
		this.charm = charm;
		this.mor = mor;
	}

	public int getStory() {
		return story;
	}

	public void setStory(int story) {
		this.story = story;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCharm() {
		return charm;
	}

	public void setCharm(int charm) {
		this.charm = charm;
	}

	public int getMor() {
		return mor;
	}

	public void setMor(int mor) {
		this.mor = mor;
	}

	public int getExCount() {
		return exCount;
	}

	
	
}
