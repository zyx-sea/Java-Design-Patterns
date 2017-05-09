package builder.cn;

import product.cn.Actor;
import product.cn.Ghost;

public class GhostBuilder implements ActorBuilder {

	private Actor product=new Ghost();
	@Override
	public void type() {
		product.add("����");

	}

	@Override
	public void sex() {
		product.add("��");

	}

	@Override
	public void face() {
		product.add("�ֲ�");

	}

	@Override
	public void dress() {
		product.add("������");

	}

	@Override
	public Actor getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
