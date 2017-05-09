
public class Test {

	public static void main(String[] args) {
		//客人点了一份吐司，不需要加配料
		Breakfast breakfast1=new Toast();
		System.out.println("你的餐点是："+breakfast1.getDescription()+"	价格为："+breakfast1.cost());
		
		//客人点了一份吐司，加双倍火腿
		Breakfast breakfast2=new Toast();
		breakfast2=new Ham(breakfast2);
		breakfast2=new Ham(breakfast2);
		System.out.println("你的餐点是："+breakfast2.getDescription()+"	价格为："+breakfast2.cost());
		
		//客人点了一份汉堡，加火腿和双倍起司
		Breakfast breakfast3=new Burger();
		breakfast3=new Ham(breakfast3);
		breakfast3=new Cheese(breakfast3);
		breakfast3=new Cheese(breakfast3);
		System.out.println("你的餐点是："+breakfast3.getDescription()+"	价格为："+breakfast3.cost());
			
		//客人点了一份蛋饼，加火腿和果酱
		Breakfast breakfast4=new Danbing();
		breakfast4=new Ham(breakfast4);
		breakfast4=new Guojiang(breakfast4);
		System.out.println("你的餐点是："+breakfast4.getDescription()+"	价格为："+breakfast4.cost());
			

	}

}
