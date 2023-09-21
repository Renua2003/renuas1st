import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> addressholder;


    public AddressBook() {
        ArrayList<BuddyInfo> addresholder = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo var){
        addressholder.add(var);
    }

    public void removeBuddy(BuddyInfo var){
        addressholder.remove(var);

    }


    public static void main(String[] args) {
        System.out.println("hello cruel world" );}
}
