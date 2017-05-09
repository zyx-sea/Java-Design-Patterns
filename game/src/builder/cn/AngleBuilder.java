package builder.cn;

import product.cn.Actor;
import product.cn.Angle;

public class AngleBuilder implements ActorBuilder {

	private Actor product=new Angle();
	@Override
	public void type() {
		product.add("���ͣ���ʹ");

	}

	@Override
	public void sex() {
		product.add("�Ա�Ů");

	}

	@Override
	public void face() {
		product.add("��ò��Ư��");

	}

	@Override
	public void dress() {
		product.add("���ţ�����ƮƮ");

	}

	@Override
	public Actor getResult() {
		return product;
	}

}
