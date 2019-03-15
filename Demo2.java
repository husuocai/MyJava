class Demo2{
	public static void main(String[] args){
	
		int i =10;
		//数值类型的转换的前提是精度不会损失
		byte b = (byte)i;
		System.out.println(b);
		
		//小数类型强转
		float f = 199.5f;
		int i1 = (int)f;
		//转换成int,小数转换成整数，就是把小数点去掉
		System.out.println(i1);
		
	  //double向float转
	  double d = 10.4;
	  float f1 = (float)d;
	  System.out.println(f1);
	  
	  //字符的转换
	  char c = 'a';
	  int x = c;
	  System.out.println(x);
	  
	  int y = 98;
	  char c1 = (char)y;
	  System.out.println(c1);
	}
	
	
	}