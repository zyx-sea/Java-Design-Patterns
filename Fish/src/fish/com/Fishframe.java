package fish.com;

public class Fishframe {
	
	public static Freshwaterfish productfish(String type){
		if(type.equals("����")){
			return new Grasscarp();
		}else if(type.equals("����")){
			return new Catfish();
		}else if(type.equals("����")){
			return new Carp();
		}else if(type.equals("����")){
			return new Jifish();
		}else{
			System.out.println("����ֳ�������������㣡��");
			return null;
		}
		
		
	}

}
