
public class GeneralSwitchFacade {
	
	public  Light light[]=new Light[4];
	
	public Fan fan;
	public AirConditioner ac;
	public Television tv;
	
	public GeneralSwitchFacade(){
		light[0]=new Light("√≈µ∆");
		light[1]=new Light("øÕÃ¸µ∆");
		light[2]=new Light("Œ‘ “µ∆");
		light[3]=new Light("Œ¿…˙º‰µ∆");
		
		fan=new Fan();
		ac=new AirConditioner();
		tv=new Television();
		
	}
	
	public void on(){
		light[0].on();
		light[1].on();
		light[2].on();
		light[3].on();
		
		fan.on();
		ac.on();
		tv.on();
	}
	
	public void off(){
		light[0].off();
		light[1].off();
		light[2].off();
		light[3].off();
		
		fan.off();
		ac.off();
		tv.off();
	}

}
