package model;

public class StoryDTO {

	private String title;
	private String stage;
	private String userChoice1;
	private String userChoice2;
	private String userChoice3;
	private String userChoice4;

	public StoryDTO(String title, String stage, String userChoice1, String userChoice2, String userChoice3, String userChoice4) {
		super();
		this.title = title;
		this.stage = stage;
		this.userChoice1 = userChoice1;
		this.userChoice2 = userChoice2;
		this.userChoice3 = userChoice3;
		this.userChoice4 = userChoice4;
	}


	public String getTitle() {
		return title;
	}

	public String getUserChoice1() {
		return userChoice1;
	}

	public void setUserChoice1(String userChoice1) {
		this.userChoice1 = userChoice1;
	}

	public String getUserChoice2() {
		return userChoice2;
	}

	public void setUserChoice2(String userChoice2) {
		this.userChoice2 = userChoice2;
	}

	public String getUserChoice3() {
		return userChoice3;
	}

	public void setUserChoice3(String userChoice3) {
		this.userChoice3 = userChoice3;
	}

	public String getUserChoice4() {
		return userChoice4;
	}

	public void setUserChoice4(String userChoice4) {
		this.userChoice4 = userChoice4;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

}
