package builder.cn;

import product.cn.Actor;

public interface ActorBuilder {
	
	public void type();
	public void sex();
	public void face();
	public void dress();
	public Actor getResult();

}



