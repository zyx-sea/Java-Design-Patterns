//具体装饰类
public class Ham extends CondimentDecorator {

	public Ham(Breakfast myfood) {
		super(myfood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()+10;
	}
	public String getDescription(){//获得所定商品的描述
		return super.getDescription()+",火腿";
	}
}
