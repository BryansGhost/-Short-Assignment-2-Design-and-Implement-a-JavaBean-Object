import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        

        String videoLength = JOptionPane.showInputDialog("Enter video size in Seconds: ");
        String videoQuality = JOptionPane.showInputDialog("Is video quality 720p or 1080p?\n(1) = 720\t (2) = 1080");
     
        int length = Integer.parseInt(videoLength);
        int quality = Integer.parseInt(videoQuality);
        
        VideoReader.getVideoLength(length); //videoLength accessor method
        VideoReader.getVideoQuality(quality);//videoQuality accessor method

        //Video Object
        VideoReader videoSize = new VideoReader();
        videoSize.size(length, quality);
        
        VideoReader vs = videoSize;

        //Main Java Pain
        JOptionPane.showMessageDialog(null, "Video Size: " +  vs, "Video Size Conversion", JOptionPane.PLAIN_MESSAGE);
    }
}


