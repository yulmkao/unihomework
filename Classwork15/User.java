public class User {
	private String username;
	private UserRole role;
	private int age;

	public User(String username, UserRole role, int age) {
		this.username = username;
		this.role = role;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public UserRole getRole() {
		return role;
	}

	public int age() {
		return age;
	}

	public void checkAge() {
		if (age < 18) {
			throw new IllegalArgumentException("вам слишком мало лет");
		} else {
			System.out.println("все оки");
		}
	}

}