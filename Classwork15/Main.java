public class Main {
	public static void main(String[] args) {
		User user1 = new User("юля", UserRole.ADMIN, 19);
        User user2 = new User("оля", UserRole.MODERATOR, 17);
        User user3 = new User("амир", UserRole.USER, 18);

        Action action = new Action() {
        	@Override
        	public void execute(User user) {
        		try {
        			user.checkAge();
        			switch (user.getRole()) {
        				case ADMIN:
                            System.out.println(user.getUsername() + " имеет права администратора");
                            break;
                        case MODERATOR:
                            System.out.println(user.getUsername() + " может модерировать контент");
                            break;
                        case USER:
                            System.out.println(user.getUsername() + " имеет базовые права пользователя");
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                    System.out.println(user.getUsername() + ": " + e.getMessage());
                }
            }
        };

        action.execute(user1);
        action.execute(user2);
        action.execute(user3);
    }
}