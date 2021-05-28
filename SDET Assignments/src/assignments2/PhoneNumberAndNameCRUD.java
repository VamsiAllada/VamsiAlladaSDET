package assignments2;
import java.util.ArrayList;
import java.util.List;
public class PhoneNumberAndNameCRUD {
	interface TelephoneDirectoryOperations{
		public void create(User user);
		public User read(String userName);
		public Boolean update(String userName,String newMobileNumber);
		public void delete(String userName);
		
	}

	class User{
		String userName;
		String mobileNumber;
		
		public User(String name, String mobileNumber) {
			super();
			this.userName = name;
			this.mobileNumber = mobileNumber;
		}
		
		public Boolean checkName(String name) {
			return this.userName == name;
		}
		
		public String getName() {
			return this.userName;
		}
		
		public String getNumber() {
			return this.mobileNumber;
		}
		
		public void updateMobileNumber(String newMobileNumber) {
			this.mobileNumber = newMobileNumber;
		}

		@Override
		public String toString() {
			return "User [userName=" + userName + ", mobileNumber=" + mobileNumber + "]";
		}	
	}

	class TelephoneDirectoryImpl implements TelephoneDirectoryOperations{
		
		List<User> users;
		
		public TelephoneDirectoryImpl() {
			users = new ArrayList<User>();
		}
		
		
		@Override
		public void create(User user) {
			// TODO Auto-generated method stub
			users.add(user);
			System.out.println("New User added to the Directory : "+user);
		}

		@Override
		public User read(final String userName) {
			// TODO Auto-generated method stub
			if(!users.isEmpty()) {
				for(User u:users) {
					if(u.checkName(userName)) {
						return u;
					}
				}
			}
			System.out.println("User Details not found..");
			return null;
		}

		@Override
		public Boolean update(String userName, String newMobileNumber) {
			// TODO Auto-generated method stub
			if(!users.isEmpty()) {
				for(User u:users) {
					if(u.checkName(userName)) {
						String oldNum = u.getNumber();
						u.updateMobileNumber(newMobileNumber);
						System.out.println("Mobile Number updated successfully");
						System.out.println("New User details : "+u+"[Old Mobile Number :"+oldNum+"]");
					}
				}
			}
			return false;
		}

		@Override
		public void delete(String userName) {
			// TODO Auto-generated method stub
			User user = read(userName);
			if(user != null) {
				users.remove(user);
				System.out.println("User deleted from the Directory : "+user);
			}
			
			System.out.println("User not found to delete");
		}
		
	}
}
