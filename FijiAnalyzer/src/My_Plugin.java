import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;

@Plugin
public class My_Plugin implements PlugIn {

	public void run(String arg) {
		int final MINGFP = 1000;
		int final MAXGFP = 45000;
		int final MINCHERRY = 1000;
		int final MAXMCHERRY = 35000;
		String titleGFP = "gfp";
		String titleMCHERRY = "mcherry";
		
		String pos = "Pos23";
		String root = "D:/Trabajo/microfluidics/2021-04-20-CHAS1003-0-14-CHAOS1004-15-LAST/";
		String path = root+pos+"/";
		String pathMovie = path+"MOVIES/"+pos+".avi";
		ImagePlus imp = IJ.getImage();
		ImagePlus imp = IJ.getImage();
		imp = FolderOpener.open(path," file=channel001");
		//IJ.run("Brightness/Contrast...");
		imp.setDisplayRange(MINGFP, MAXGFP);
		imp.renameResults(titleGFP);
		ImagePlus imp2 = IJ.getImage();
		imp2 = FolderOpener.open(path," file=channel002");
		imp.renameResults(titleMCHERRY);
		//IJ.run("Brightness/Contrast...");
		imp2.setDisplayRange(MINCHERRY, MAXMCHERRY);
		IJ.run(imp, "Merge Channels...", "c1="+titleGFP+" c5="+titleMCHERRY"+" create");
		IJ.run(imp, "Cyan Hot", "");
		IJ.run(imp, "AVI... ", "compression=JPEG frame=13 save="+pathMovie);
	}

}
