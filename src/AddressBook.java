import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> myList;
	
	
	public AddressBook() {
		myList = new ArrayList<>();		
	}
	
	public void addBuddy(BuddyInfo buddy) {
		myList.add(buddy);
		
	}
	
	public boolean removeBuddy(BuddyInfo buddy) {
		
		return myList.remove(buddy);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo();
		buddy.setNmae("David");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);
		System.out.println("Hello world! ");
		
	}
	
}
