package test215;
//�ŽӾ�����
public class CommonMessage extends AbstrctMessage {

	public CommonMessage(MessageImplement MImpl) {
		super(MImpl);
		
	}
	
	public void SendMessage(String message,String toUser){
		super.SendMessage(message, toUser);
	}

}
