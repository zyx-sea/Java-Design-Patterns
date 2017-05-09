//����װ����
public abstract class CondimentDecorator extends Breakfast {

	Breakfast myfood;
	
	
	public CondimentDecorator(Breakfast myfood) {
		this.myfood=myfood;
	}

	public String getDescription(){//���������Ʒ������
		return myfood.getDescription();
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return myfood.cost();
	}

}
