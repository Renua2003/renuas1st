import java.util.ArrayList;
public class AddressBook {
    ArrayList<BuddyInfo> addresholder;


    public AddressBook() {
        addresholder = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo var){
        addresholder.add(var);
    }

    public void removeBuddy(BuddyInfo var){
        addresholder.remove(var);

    }





    public static void main(String[] args) {
        System.out.println("hello cruel world" );
       AddressBook address1 = new AddressBook();
       BuddyInfo buddy1 = new BuddyInfo("Bola","dry lane Avenue","21");
       BuddyInfo buddy2 = new BuddyInfo("Tunde","happines lane ","2");
       address1.addBuddy(buddy2);
       address1.addBuddy(buddy1);





    }


}
