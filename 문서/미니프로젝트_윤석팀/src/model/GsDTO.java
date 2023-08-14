package model;

public class GsDTO {
	// Field
	String id = null;
	String name = null;
	int story = 0;
	int exCount = 0;
	int cnt = 0;

	// Generator
	public GsDTO(String id, String name, int story, int cnt) {
		this.id = id;
		this.name = name;
		this.story = story;
		this.cnt = cnt;
	}

	public GsDTO(String id, int story, String name, int exCount) {
		this.id = id;
		this.name = name;
		this.story = story;
		this.exCount = exCount;
	}

	public GsDTO() {

	}

	// Getter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStory() {
		return story;
	}
	
	public int getExCount() {
		return exCount;
	}

	public int getCnt() {
		return cnt;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}
}
