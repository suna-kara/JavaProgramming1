package week10.week11;

public class TV {

    // Data fields + attributes
 public    int channel=1; // Default: geçerli. channel is 1
  public   int volumeLevel=1; // Default volume is 1
 public    boolean on=false; // TV is off

    public  TV(){
        // Constructor with NO parameters

        // why are we initializing these values without constructor by one by an d don t we use constructor?
    }
    public  void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }
    public void setChannel(int newChannel){
        if (on && newChannel >=1 && newChannel <= 120){
            channel=newChannel;
        }
    }
   public void setVolume(int newVolume){
        if (on && newVolume >=1 && newVolume <= 7){
            volumeLevel=newVolume;
        }
   }
   public void channelUp(){
        if (on&& channel < 120)
            channel++;
   }
    public void channelDown(){
        if (on&& channel < 120)
            channel--;
    }
    public void volumeUp(){
        if (on&& volumeLevel < 7)
           volumeLevel++;
    }
    public void volumeDown(){
        if (on&& volumeLevel > 1)
            volumeLevel--;
    }

    public String toString() {
        return "TV" +
                "\nchannel=" + channel +
                "\n, volumeLevel=" + volumeLevel +
                "\n, on=" + on +
                '}';
    }
}
