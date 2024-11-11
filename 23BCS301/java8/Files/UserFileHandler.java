package Files;

import java.io.File;

public class UserFileHandler {
    File aFile;
    boolean isReadable = false;
    boolean isWriteable = false;
    boolean isExists = false;
    int length = 0;

    public UserFileHandler(String path) {
        aFile = new File(path);
        this.isExists = aFile.exists();
        this.isReadable = aFile.canRead();
        this.isWriteable = aFile.canWrite();
        this.length = (int) aFile.length();
    }

    public void fileDetails() {
        if (isExists) {
            System.out.println("The File " + aFile.getName() + " is available at: " + aFile.getParent());

            if (isReadable && isWriteable) {
                System.out.println("File is Readable and Writeable");
            } else if (isReadable) {
                System.out.println("File is Only Readable");
            } else if (isWriteable) {
                System.out.println("File is Only Writeable");
            }

            System.out.println("Total length of the file is: " + this.length + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
