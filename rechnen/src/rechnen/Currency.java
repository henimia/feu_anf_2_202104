package rechnen;

public enum Currency {
	EUR("EUR"), USD("USD"), YEN("YEN");

	private String representation;

	Currency(String representation) {
		this.representation = representation;
	}

	public String getRepresentation() {
		return representation;
	}

	public static Currency of(String representation) {
		for (Currency cur : values()) {
			if (cur.representation.equals(representation)) {
				return cur;
			}
		}
		throw new IllegalArgumentException("No such currency.");
	}

}
