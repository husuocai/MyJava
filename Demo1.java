class Demo1{
	public static void main(String[] args){
		
		//定义一个自核类型
		//byte b = 1;
		//基本数据类型在计算时候，数值常量默认为int
		//byte b1 = b+1; 错的
		//int b1 = b+1;
		
		//byte,short,int,char,四种发生运算都会自动把结果提升为int
		
		//定义一个char类型
		/*char c = 'a';
		int i1 = c +1;
		System.out.println(i1);*/		
		
		//如果两个int类型计算会不会自动提升类型呢
		/*int a = 2111111111;
		int b2 = 12;
		int e =a + b2;*/
		//int,float,double 自身计算的时候没有类型的提升，如果超出范围了就会出现精度的损失
		//System.out.println(e);
		//int,float,double 不同类型计算的时候没有类型的提升的会向大的表数范围提升
		
		int y = 12;
		float f = 1.3f;
		//int类型和float类型计算转换成float
		float f1 = f + y;
		System.out.println(f1);
		//小数的常量的默认值是double
		double d = f + 1.3;
		//12.5f表示float类型的常量，小的表数范围的常量或变量可以自动的向大的表数范围的类型转换
		double d1 = 12.5f;
		
		double d2 = 1;
		
		
	}
	
	
	}