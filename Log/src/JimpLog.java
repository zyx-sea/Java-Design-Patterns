//具体实现角色
public class JimpLog extends ImpLog {

	@Override
	public void execute(String msg) {
		System.out.println("在Java平台上记录日志，"+msg);

	}

}
