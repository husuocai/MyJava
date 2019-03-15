class Demo3{
	public static void main(String[] args){
	
	//打印每个人员的工资等级，如果大于3000就是D级如果大于5000是C级，大于8000是B级，大于10000是A级
	
	//定义一个变量
	/*	int salary = 7000;
		
		if(salary > 3000 && salary <=5000){
			System.out.println("D级");
		}
		if(salary > 5000 && salary <= 8000){
			System.out.println("C级");
		}
		if(salary > 8000 && salary <= 10000){
			System.out.println("B级");
		}
		if(salary > 10000){
			System.out.println("A级");
		}
		System.out.println("程序结束");*/
		
		int salary = 7000;
		
		if(salary > 10000){
			System.out.println("A级");
		}else if(salary > 8000){
			System.out.println("B级");
		}else if(salary > 5000){
			System.out.println("C级");
		}else if(salary < 3000){
			System.out.println("D级");
		}
	}
	
	
	}