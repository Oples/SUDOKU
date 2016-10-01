/*
 * Imports
 */
import java.lang.String;
import java.io.*;
import java.util.*;
//import Classes.Updater;
/*
 * SUDOKU MAIN CLASS
 */
//package sudoku;

/**
 * @author Lince99
 * @author Oples
 * @author Marxist Carbonara
 */
public class SUDOKU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application down here, we hope this java application doesn't have SO MUCH BUGS
	try
	{
		String User_name = "Bob"; // For now I let this has defaults but soon it will be dynamic
		System.out.println("Hello "+User_name+"!\n\nInput: ");
		Scanner input = new Scanner("System.in");
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec("echo hi");   // <- already triggered of about this :C
	}
	catch (IOException e)
	{
		System.out.println("Failed to execute!");
	}
    }
}
