public class BuddyInfo {

    private String name;
    private String address;
    private String number;
    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public BuddyInfo() {
        this.name = "Dan";
        this.address = " 1294 drive ottawa";
        this.number = "9058123421" ;
    }

    public String name() {
        return name;
    }



    public String address() {
        return address;
    }



    public String number() {
        return number;
    }



    public static void main(String[] args) {
        System.out.println("Hello World.!");

        int c =10;
        int t= 7;


        System.out.println( c +t);
    }

}

