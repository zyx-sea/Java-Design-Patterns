package fish.com;

public class Fishframe {
	
	public static Freshwaterfish productfish(String type){
		if(type.equals("草鱼")){
			return new Grasscarp();
		}else if(type.equals("鲶鱼")){
			return new Catfish();
		}else if(type.equals("鲤鱼")){
			return new Carp();
		}else if(type.equals("鲫鱼")){
			return new Jifish();
		}else{
			System.out.println("本养殖场不生产这种鱼！！");
			return null;
		}
		
		
	}

}
