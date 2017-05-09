package test215;
//桥接具体类
public class UrgentMessage extends AbstrctMessage {

	public UrgentMessage(MessageImplement MImpl) {
		super(MImpl);
		
	}
	
	public void SendMessage(String message,String toUser){
		super.SendMessage(message, toUser);
	}

}

