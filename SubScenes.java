import org.code.theater.*;
import org.code.media.*;
/**
  *SubScenes defines two animated sequences initialized in the superclass.
  *It overrides drawSceneLoop and drawSceneLoop2 to show different animations.
  */
public class SubScenes extends BigScene{

  /*Provides positions for the first animation sequence. The player 
 is the position for the first 3 elements in the array and the ball is the last three
  */
 private int[][] positionArray = {
    {70,164,100,88,160,30},
    {70,70,100,88,63,30},
    {70,85,100,181,51,30},
    {70,120,100,303,83,30},
    {70,140,100,309,134,30},
    {70,164,100,326,324,30},
  };

   /*Provides positions for the second animation sequence. The player 
 is the position for the first 3 elements in the array and the ball is the last three
  */
   private int[][] positionArray2 = {
   {280,165,175,330,180,30},
   {280,130,175,300,140,30},
   {280,110,175,250,100,30},
   {280,125,175,165,90,30},
   {280,140,175,110,145,30},
   {280,165,175,50,200,30}
 };

  public void drawSceneLoop() {
    for (int[] row : positionArray) {
      clear("white");//clears each instance allowing for a seamless animation
      drawImage("Screenshot-2025-03-26-144746.png",-550,0,1000);
      drawImage("Screenshot_2025-03-26_145628-removebg-preview.png",row[0],row[1],row[2]);
      drawImage("download-removebg-preview.png",row[3],row[4],row[5]);
      pause(1.0);//pause between each frame
    }
   //Cheer method is called
    Kobe();
  }

 
  public void drawSceneLoop2() {
    for (int[] row : positionArray2) {
      clear("white");//clears each instance allowing for a seamless animation
      drawImage("Screenshot-2025-03-26-144746.png",0,0,1000);
      drawImage("ca-times.brightspotcdn-removebg-preview.png",row[0],row[1],row[2]);
      drawImage("download-removebg-preview.png",row[3],row[4],row[5]);
      pause(1.0);//pause between each frame
    }
//Cheer method is called
    Lebron();
  }

   /**
   * Displays Kobe celebration message with audio.
   */
private void Kobe(){  
setTextColor("white");
drawText("Nice Shot!!!",175,290);
playSound("NiceShot.wav");
pause(1.5);
}
/**
   * Displays Lebron celebration message with audio.
   */
private void Lebron(){  
setTextColor("white");
drawText("BOOOOOOOM!!!",50,290);
playSound("Boom.wav");
pause(1.5);
}
}