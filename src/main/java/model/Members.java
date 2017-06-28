package model;

public class Members {

	private int id;
	private String name;
	private Long number;
	private String url;
	private String type;
	private String designation;
	private String createDateTime;
	private String updateDateTime;

	public Members(){}
	
	public Members(String name, Long number, String type, String designation, String url) {
		super();
		this.url = url;
		this.name = name;
		this.number = number;
		this.type = type;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
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
