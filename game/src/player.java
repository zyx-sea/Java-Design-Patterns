import builder.cn.ActorBuilder;
import builder.cn.AngleBuilder;
import director.cn.ActorDirector;
import product.cn.Actor;

public class player {
	
	public static void main(String[] args){
		ActorBuilder builder=new AngleBuilder();
		ActorDirector director=new ActorDirector(builder);
		System.out.println("��Ϸ��ɫ��");
		director.construct();
		Actor product=builder.getResult();
		product.show();
	}

}
