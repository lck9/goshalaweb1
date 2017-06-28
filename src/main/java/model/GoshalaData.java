package model;

public class GoshalaData{
	
	private int id;
	private String page;	
	private String text;
	private String url;
	private String createDateTime;
	private String updateDateTime;

	public GoshalaData(){}
	
	public GoshalaData(String page, String text, String url) {
		super();
		this.url = url;
		this.page = page;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCreateDateTime() {
		return createDateTime;
	}

	public String getUpdateDateTime() {
		return updateDateTime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}