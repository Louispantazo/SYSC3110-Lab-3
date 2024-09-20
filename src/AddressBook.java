import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        this.buddyInfos = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddyInfos.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        if (buddyInfos.contains(buddy)){
            buddyInfos.remove(buddy);
        }
    }

    public static void main(String[] args){
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(new BuddyInfo("Louis", "123 Raod rd", "613-613-6613"));
        System.out.println(addressBook);
    }
}
