class Demo3{
	public static void main(String[] args){
	
	//��ӡÿ����Ա�Ĺ��ʵȼ����������3000����D���������5000��C��������8000��B��������10000��A��
	
	//����һ������
	/*	int salary = 7000;
		
		if(salary > 3000 && salary <=5000){
			System.out.println("D��");
		}
		if(salary > 5000 && salary <= 8000){
			System.out.println("C��");
		}
		if(salary > 8000 && salary <= 10000){
			System.out.println("B��");
		}
		if(salary > 10000){
			System.out.println("A��");
		}
		System.out.println("�������");*/
		
		int salary = 7000;
		
		if(salary > 10000){
			System.out.println("A��");
		}else if(salary > 8000){
			System.out.println("B��");
		}else if(salary > 5000){
			System.out.println("C��");
		}else if(salary < 3000){
			System.out.println("D��");
		}
	}
	
	
	}