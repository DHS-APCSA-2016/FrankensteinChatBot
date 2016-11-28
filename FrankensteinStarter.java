import java.util.Scanner;
/**
 * Write a description of class FrankensteinStarter here.
 * 
 * @author Jacob Bratsman and Tim Degerness 
 * @version 11/27/2016
 */
public class FrankensteinStarter
{
    public static void main(String[] args)
    {
        Frankenstein Frank = new Frankenstein();
		
		System.out.println ("I am Victor Frankenstein, the scientist, not the monster. Do you have any questions about my life?");
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (Frank.returnResponse(statement));
			statement = in.nextLine();
		}
    }
}
