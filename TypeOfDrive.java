import javax.swing.filechooser.FileSystemView;
import java.io.File;
public class TypeOfDrive {

	public static void main(String[] args) {
		FileSystemView type = FileSystemView.getFileSystemView();
		System.out.println("Home Directory : "+type.getHomeDirectory());
		//type of drive in a system
		File[] fileRoots = File.listRoots();
	
	   for (int i = 0; i < fileRoots.length; i++)
	
   {
		
	   System.out.println();
		
	   System.out.println("System Drive: " + fileRoots[i]);
	
	   System.out.println("Drive Display name: " + type.getSystemDisplayName(fileRoots[i]));
	
	   System.out.println("Is drive: " + type.isDrive(fileRoots[i]));
		
	   System.out.println("Is floppy: " + type.isFloppyDrive(fileRoots[i]));
		
	   System.out.println("Readable: " + fileRoots[i].canRead());
	
	   System.out.println("Writable: " + fileRoots[i].canWrite());
	
	   System.out.println();
		
  }
		

	}

}
