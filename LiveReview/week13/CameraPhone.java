package week13;

public class CameraPhone extends Phone {

    int imageSize; // this is in MegaBytes
    int memorySize;// this is in gigaBytes

    public CameraPhone(int imageSize, int memorySize) {
        //super();
       // super(); //this();
        this.imageSize = imageSize;
        this.memorySize = memorySize;
        // super(); compile error, it has to be at the first line
    }
public CameraPhone(){}
    public int numPictures(){
        return  memorySize*1000/imageSize;
    }
}
