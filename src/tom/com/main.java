package tom.com;

public class main {
    public static void main(String[] args) {
        int switchValue = 1;

       switch(switchValue) {
           case 1:
               System.out.println("Value was 1");
               break;

           case 2:
               System.out.println("Value was 2");
               break;

           case 3: case 4: case 5:
               System.out.println("Value was 3, 4, or 5");
               System.out.println("Actually it was a " + switchValue);
               break;

           default:
               System.out.println("Was not 1 - 6");
               break;
       }
        char switchChar = 'A';

        switch(switchChar) {
            case 'A':
                System.out.println("Char is A");
                break;
            case 'B':
                System.out.println("Char is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchChar+ "was found");
                break;
            default:
                System.out.println("Could not find");


        }

    }
}
