	public class employee {
		private int id;
		private int age;
		public employee(int id,int age ) {
			this.id=id;
			this.age=age;
		}
		public  void show()
		{
			System.out.println("id is:"+id +"age is:"+age);
		}
		
	}
	 class Display {
	public static void main(String args[]) {
		employee e=new employee(1,20);
		e.show();
		
	}
	}

