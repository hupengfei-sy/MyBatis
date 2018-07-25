package testMyBatils;

public class MetadataTable {

	private String description;
	private String data;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "metadataTable [description=" + description + ", data=" + data + "]";
	}

}
