//�ͻ�������
public class Client {

	public static void main(String[] args) {
		//Javaƽ̨�µ�Text File Log
		ImpLog implementor=new JimpLog();
		Log dblog=new TextFileLog(implementor);
		dblog.Write("������������");

	}

}
