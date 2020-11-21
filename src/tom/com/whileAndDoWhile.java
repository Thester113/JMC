package tom.com;

import static java.lang.System.*;

public class whileAndDoWhile {

  public static void main(String[] args) {
//        int count = 1;
//        while(count !=6) {
//            out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        out.println("Count value is " + count);
//        count++;
//        while (count != 6) {
//            out.println("Count value is " + count);
//            count++;
//        }
//        count = 6;
//        do {
//            out.println("Count value is " + count);
//            count++;
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

      int  number = 4;
      int finishNumber = 20;

      while (number <= finishNumber) {
        number++;
        if(!isEvenNumber(number)) {
            continue;
        }
          out.println("Even number " + number);
      }

  }

  public static boolean isEvenNumber(int number) {
    if ((number % 2) == 0) {
      return true;
    } else {
      return false;
    }
  }
}
