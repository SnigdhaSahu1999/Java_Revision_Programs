import java.io.FileOutputStream;
public class FileOutputStreamExamle
{
	public static void main(String[] args) {
	    try{
	    FileOutputStream fs = new FileOutputStream("D:\\a.txt");
	    fs.write(66);
	    fs.close();
		    System.out.println("Character added to the file successfuly");
	    }
	    catch(Exception e){
	        System.out.println("Error while writing in file");
	    }
	}
}
