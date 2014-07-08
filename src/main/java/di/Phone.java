package di;

public class Phone {
	private String name;
	private String color;
	private MobileAgency agency;

	public Phone() {
		super();
	}

	public Phone(String name) {
		super();
		this.name = name;
	}

	public Phone(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Phone(MobileAgency agency) {
		super();
		this.agency = agency;
	}

	public MobileAgency getAgency() {
		return agency;
	}

	public void setAgency(MobileAgency agency) {
		this.agency = agency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + ", agency="
				+ agency + "]";
	}

}
