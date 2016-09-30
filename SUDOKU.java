/*
 * Imports
 */
import java.lang.String;
/*
 * SUDOKU MAIN CLASS
 */
package sudoku;

/**
 * @author Lince99
 * @author Oples
 * @author Marxist Carbonara
 */
public class SUDOKU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application down here, we hope this java application doesn't have SO MUCH BUGS
		try{
			String options = args[0];
			if (options.startsWith("-"))
			{
				if(options == "-h")
				{
					System.out.println(help());
				}
			}
			else
			{
				System.out.println("Don't fuck with commands plz");
				// TODO: improve savages way to insult testers :3
			}
		}
		catch (Exception e)
		{
				System.out.println(help());
		}
	}
   public static String help(){
      String msgbox = new String();
      msgbox  = "################################\n";
      msgbox += "#  HELP REQUESTED! (help menu) #\n";
      msgbox += "#                              #\n";
      msgbox += "################################\n";
      
      return msgbox; 
   }
}
