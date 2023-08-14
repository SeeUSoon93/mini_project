package model;

public class MusicDTO {

	private String title;
	private String path;
	
	public MusicDTO(String title, String path) {
		super();
		this.title = title;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
