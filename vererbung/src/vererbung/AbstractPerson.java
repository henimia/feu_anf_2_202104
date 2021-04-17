package vererbung;

public abstract class AbstractPerson {
	protected String name;
	protected String lastname;

	public AbstractPerson(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "AbstractPerson [name=" + name + ", lastname=" + lastname + "]";
	}

}
