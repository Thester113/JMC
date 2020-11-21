package tom.com;

public class main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Mac", "240", dimensions);

        Monitor theMonitor = new Monitor("27 INCH BEAST", "ASUS", 27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
