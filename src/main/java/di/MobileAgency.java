package di;

public class MobileAgency {
	private String name;

	public MobileAgency() {
		super();
	}

	public MobileAgency(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MobileAgency [name=" + name + "]";
	}

}
