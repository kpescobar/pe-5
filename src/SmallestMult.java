/**
 * 
 */

/**
 * @author Kelly Escobar
 *
 */
public class SmallestMult {

  /**
   * @param args
   */
  public static void main(String[] args) {
    for (int i = 0; i <= 10_000_000; i++) {
      for (int j = 1; j <= 20; ) {
        if (i % j == 0) {
         j++;
        } else {
          break;
        }
      } System.out.print(i);
    }


  }
}
