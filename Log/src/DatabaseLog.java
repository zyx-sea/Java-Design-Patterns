//�ŽӾ����ࣨ�����ĳ��󻯽�ɫ��
public class DatabaseLog extends Log {

	public DatabaseLog(ImpLog implementor){
		super(implementor);
	}
	@Override
	public void Write(String log) {
		implementor.execute("ʹ�����ݿ�ķ�ʽ��"+log);

	}

}
