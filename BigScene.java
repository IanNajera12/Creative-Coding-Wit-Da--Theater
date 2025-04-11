import org.code.theater.*;
import org.code.media.*;

/**
 * BigScene is the superclass that extends the Theater Scene class.
 * It provides structure for drawing animated sequences.
 */

public class BigScene extends Scene{

/**
   * Draws the full scene by executing two animation loops.
   */
public void drawScene(){
drawSceneLoop();
drawSceneLoop2();
}
 
  /*Creates two empty methods which will be overriden in the subclass*/
  public void drawSceneLoop() {
    // default behavior or leave empty
  }

  public void drawSceneLoop2() {
    // default behavior or leave empty
  }
}