//����������
/*public class StudentAdaptor extends Student implements Target {

	@Override
	public void exam() {
		System.out.println(name+"�п��ɼ�����");

	}

	@Override
	public void result() {
		System.out.println(name+"��ʵ����гɹ�¼ȡ����");

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
		System.out.println(stu.getName()+"�п��ɼ�����");
		System.out.println(stu.getName()+"��ʵ����гɹ�¼ȡ����");
	}
	
}