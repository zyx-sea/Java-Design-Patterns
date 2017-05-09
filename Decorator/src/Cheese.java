//具体装饰类
public class Cheese extends CondimentDecorator {

	public Cheese(Breakfast myfood) {
		super(myfood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()+5;
	}
	public String getDescription(){//获得所定商品的描述
		return super.getDescription()+",起司";
	}
}
