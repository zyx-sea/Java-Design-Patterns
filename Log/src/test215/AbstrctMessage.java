package test215;
//«≈Ω”¿‡
public abstract class AbstrctMessage {
	private MessageImplement MImpl;
	public AbstrctMessage(MessageImplement MImpl){
		this.MImpl=MImpl;
	}
	
	public void SendMessage(String message,String toUser){
		this.MImpl.send(message, toUser);
	}

}
