package test215;
//�ŽӾ�����
public class UrgentMessage extends AbstrctMessage {

	public UrgentMessage(MessageImplement MImpl) {
		super(MImpl);
		
	}
	
	public void SendMessage(String message,String toUser){
		super.SendMessage(message, toUser);
	}

}

