import java.util.*;

@FunctionalInterface  
interface Addition{
    public int add(int a,int b);
}
public class AdditionUsingLambdaExpression
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no.s to be added");
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    Addition ob = (int a,int b)->{    //LambdaExpression
	        return(a+b);
	    };
	    System.out.println(ob.add(x,y));
	}
}