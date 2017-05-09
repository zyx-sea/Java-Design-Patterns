//客户测试类
public class Client {

	public static void main(String[] args) {
		//Java平台下的Text File Log
		ImpLog implementor=new JimpLog();
		Log dblog=new TextFileLog(implementor);
		dblog.Write("运行正常！！");

	}

}
