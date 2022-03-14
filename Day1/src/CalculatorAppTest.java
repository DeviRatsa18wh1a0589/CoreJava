
public class CalculatorAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int firstNum, secondNum,result;
           firstNum=20;
           secondNum=10;
           result=addTwoNumber(firstNum, secondNum);
           System.out.println("additon Result"+result);
           result=SubTwoNumber(firstNum, secondNum);
           System.out.println(" sub Result"+result);
          
	}

	 static int SubTwoNumber(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		return firstNum-secondNum;
	}

	static int addTwoNumber(int firstNum, int secondNum) {
		
		// TODO Auto-generated method stub
		return firstNum+secondNum;
	}

}
