class Mobile {
    private String company_name;
    private double screen_size;
    public Mobile() {
        company_name = "Unknown";
        screen_size = 5.0;
    }
    public Mobile(String compName) {
        company_name = compName;
        screen_size = 6.0;
    }
    public Mobile(String compName, double scrSize) {
        company_name = compName;
        screen_size = scrSize;
    }
    public void displayDetails() {
        System.out.println("Company Name: " + company_name + " | Screen Size: " + screen_size + " inches");
    }    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[5];
        mobiles[0] = new Mobile();
        mobiles[1] = new Mobile("Apple");
        mobiles[2] = new Mobile("Samsung", 6.7);
        mobiles[3] = new Mobile("OnePlus", 6.5);
        mobiles[4] = new Mobile("Google", 6.3);

        System.out.println("--- Mobile Phone Details ---");
        for (int i = 1; i < mobiles.length; i++) {
            System.out.print("Mobile " + (i + 1) + ": ");
            mobiles[i].displayDetails();
        }
    }
}