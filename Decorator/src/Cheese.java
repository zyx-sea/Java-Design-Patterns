//����װ����
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
	public String getDescription(){//���������Ʒ������
		return super.getDescription()+",��˾";
	}
}
