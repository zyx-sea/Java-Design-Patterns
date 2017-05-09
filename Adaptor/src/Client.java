//测试类
//注释部分为类适配器
//未注释部分为对象适配器
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		StudentAdaptor a=new StudentAdaptor();
		a.setName("周一");
		a.study();
		a.hobby();
		a.exam();
		a.result();
*/
		Student stu=new Student();
		stu.setName("王小二");
		StudentAdaptor b=new StudentAdaptor(stu);
		b.Result();
		
		
	}

}
