//抽象装饰类
public abstract class CondimentDecorator extends Breakfast {

	Breakfast myfood;
	
	
	public CondimentDecorator(Breakfast myfood) {
		this.myfood=myfood;
	}

	public String getDescription(){//获得所定商品的描述
		return myfood.getDescription();
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return myfood.cost();
	}

}
