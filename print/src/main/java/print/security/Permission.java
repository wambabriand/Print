package print.security;


public enum Permission {
	
	ONE("permission_one"),
	TWO("permission_two"),
	THREE("permission_three");
	
	private final String permission;
	
	private Permission(String permission) {
		this.permission =	permission;
	}

	public String getPermission() {
		return permission;
	}
	
	
}
