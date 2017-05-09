//被适配者类
/*public class StudentAdaptor extends Student implements Target {

	@Override
	public void exam() {
		System.out.println(name+"中考成绩优异");

	}

	@Override
	public void result() {
		System.out.println(name+"被实验高中成功录取！！");

	}

}
*/
public class StudentAdaptor implements Target{
	Student stu;
	
	public StudentAdaptor(Student stu){
		this.stu=stu;
	}
	public void Result(){
		stu.study();
		stu.hobby();
		System.out.println(stu.getName()+"中考成绩优异");
		System.out.println(stu.getName()+"被实验高中成功录取！！");
	}
	
}