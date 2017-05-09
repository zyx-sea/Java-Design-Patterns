package director.cn;

import builder.cn.ActorBuilder;

public class ActorDirector {

	private ActorBuilder builder;
	
	public ActorDirector(ActorBuilder builder){
		this.builder=builder;
	}
	
	public void construct(){
		builder.type();
		builder.sex();
		builder.face();
		builder.dress();
		
	}
}
