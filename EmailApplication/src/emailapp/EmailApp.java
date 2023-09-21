package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Create a new Email object
      Email email = new Email("patel@gmail.com");

      // Test the email operations
      System.out.println("Email Address: " + email.getEmailAddress());
      System.out.println("Mailbox Capacity: " + email.getMailboxCapacity());
      System.out.println("Alternate Email: " + email.getAlternateEmail());

      email.setMailboxCapacity(1000);
      email.setAlternateEmail("ronit@gmail.com");

      System.out.println("Updated Mailbox Capacity: " + email.getMailboxCapacity());
      System.out.println("Updated Alternate Email: " + email.getAlternateEmail());

      email.changePassword("oldPassword", "newPassword");
	}

}
