package builder.cn;

import product.cn.Actor;
import product.cn.Angle;

public class AngleBuilder implements ActorBuilder {

	private Actor product=new Angle();
	@Override
	public void type() {
		product.add("类型：天使");

	}

	@Override
	public void sex() {
		product.add("性别：女");

	}

	@Override
	public void face() {
		product.add("外貌：漂亮");

	}

	@Override
	public void dress() {
		product.add("衣着：白衣飘飘");

	}

	@Override
	public Actor getResult() {
		return product;
	}

}
