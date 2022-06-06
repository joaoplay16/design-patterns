package chainofresponsability.certificados;

public class Arquivo {

	private String name;
	private String extension;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public boolean isValido() {
		return name != null && !name.equalsIgnoreCase("");
	}
}
