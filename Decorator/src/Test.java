
public class Test {

	public static void main(String[] args) {
		//���˵���һ����˾������Ҫ������
		Breakfast breakfast1=new Toast();
		System.out.println("��Ĳ͵��ǣ�"+breakfast1.getDescription()+"	�۸�Ϊ��"+breakfast1.cost());
		
		//���˵���һ����˾����˫������
		Breakfast breakfast2=new Toast();
		breakfast2=new Ham(breakfast2);
		breakfast2=new Ham(breakfast2);
		System.out.println("��Ĳ͵��ǣ�"+breakfast2.getDescription()+"	�۸�Ϊ��"+breakfast2.cost());
		
		//���˵���һ�ݺ������ӻ��Ⱥ�˫����˾
		Breakfast breakfast3=new Burger();
		breakfast3=new Ham(breakfast3);
		breakfast3=new Cheese(breakfast3);
		breakfast3=new Cheese(breakfast3);
		System.out.println("��Ĳ͵��ǣ�"+breakfast3.getDescription()+"	�۸�Ϊ��"+breakfast3.cost());
			
		//���˵���һ�ݵ������ӻ��Ⱥ͹���
		Breakfast breakfast4=new Danbing();
		breakfast4=new Ham(breakfast4);
		breakfast4=new Guojiang(breakfast4);
		System.out.println("��Ĳ͵��ǣ�"+breakfast4.getDescription()+"	�۸�Ϊ��"+breakfast4.cost());
			

	}

}
