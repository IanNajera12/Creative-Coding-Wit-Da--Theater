import org.code.theater.*;
import org.code.media.*;
/**
 * The main class to run the theater scene animation.
 */
public class TheaterRunner {
  public static void main(String[] args) {

    BigScene Ian = new SubScenes();  /* <-- Create the subclass instance as a BigScene object, 
    allowing for BigScene to access methods from its subclass*/

  //Calls drawScene and plays it in the theater 
  Ian.drawScene();
  Theater.playScenes(Ian);

  }
}