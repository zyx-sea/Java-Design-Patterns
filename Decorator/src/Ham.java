//����װ����
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
	public String getDescription(){//���������Ʒ������
		return super.getDescription()+",����";
	}
}
