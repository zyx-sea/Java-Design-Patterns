//具体实现角色
public class NimpLog extends ImpLog {

	@Override
	public void execute(String msg) {
		System.out.println("在.NET平台上记录日志，"+msg);

	}

}
