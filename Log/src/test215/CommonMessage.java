package test215;
//桥接具体类
public class CommonMessage extends AbstrctMessage {

	public CommonMessage(MessageImplement MImpl) {
		super(MImpl);
		
	}
	
	public void SendMessage(String message,String toUser){
		super.SendMessage(message, toUser);
	}

}
