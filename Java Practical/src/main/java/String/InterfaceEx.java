//Write  a program create 2interface'Printable'and 'Calculate'and use these 2 interface in 2 different classes on will calculate square and cube
package String;

interface Printable
{
	public int calculateSquare(int S);
}
class Square implements Printable
{
	public int calculateSquare(int S)
	{
		return(S*S);
	}
}
interface Calculate
{
	public int calculateCubee(int C);
}
class Cube implements Printable
{
	public int calculateSquare(int C)
	{
		return(C*C*C);
	}
}
public class InterfaceEx {
	public static void main(String args[])
	{
		Square S1 =new Square();
		System.out.println("Square Area: "+S1.calculateSquare(20));
		
		Cube C1 =new Cube();
		System.out.println("Cube Area: "+C1.calculateSquare(30));
	}
	

}