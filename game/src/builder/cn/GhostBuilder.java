package builder.cn;

import product.cn.Actor;
import product.cn.Ghost;

public class GhostBuilder implements ActorBuilder {

	private Actor product=new Ghost();
	@Override
	public void type() {
		product.add("ÓÄÁé");

	}

	@Override
	public void sex() {
		product.add("ÎÞ");

	}

	@Override
	public void face() {
		product.add("¿Ö²À");

	}

	@Override
	public void dress() {
		product.add("°×ÆÆÉÀ");

	}

	@Override
	public Actor getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
