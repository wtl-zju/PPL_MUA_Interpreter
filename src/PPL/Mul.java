package PPL;

public class Mul extends Function{
	public Mul(Interpreter ip){
		super(ip);
	}
	public Variable execute() throws Exception
	{ 
		Variable num1 = ip.doInterpreter();
		
		Variable num2 = ip.doInterpreter();
		if(num1 instanceof Number)
		{
			if(num2 instanceof Number)
			{
				Double result = Double.valueOf((((Number) num1).a)) * Double.valueOf((((Number) num2).a));
				String s = result.toString();
				return new Number(s);
			}
			else
			{
				System.out.println("The second parameter is not a number in mul");
			}
		}
		else
		{
			System.out.println("The first parameter is not a number in mul");
		}
		return null;
	}
}
