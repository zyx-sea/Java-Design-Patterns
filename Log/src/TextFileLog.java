//�ŽӾ����ࣨ�����ĳ��󻯽�ɫ��
public class TextFileLog extends Log {

	public TextFileLog(ImpLog implementor){
		super(implementor);
	}
	@Override
	public void Write(String log) {
		implementor.execute("ʹ���ı��ļ��ķ�ʽ��"+log);

	}

}
