//������
//ע�Ͳ���Ϊ��������
//δע�Ͳ���Ϊ����������
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		StudentAdaptor a=new StudentAdaptor();
		a.setName("��һ");
		a.study();
		a.hobby();
		a.exam();
		a.result();
*/
		Student stu=new Student();
		stu.setName("��С��");
		StudentAdaptor b=new StudentAdaptor(stu);
		b.Result();
		
		
	}

}
