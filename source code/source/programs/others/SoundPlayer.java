package source.programs.others;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundPlayer {
    public void playSound(String where) {
       File raid = new File(System.getProperty("user.dir") + "/src/source/sounds/click.wav");
       try {
          Clip clip = AudioSystem.getClip();
          clip.open(AudioSystem.getAudioInputStream(raid));
          System.out.println(clip.getFrameLength() / 24);
          clip.start();
          Thread.sleep( clip.getFrameLength() / 24); //Could use a timer here instead
       }
       catch (Exception e) {
          System.out.println("Error playing sound!");
          e.printStackTrace();
       }
   }
}
