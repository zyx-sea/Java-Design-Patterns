package shap.cn;

public class Shapefarm {
	
	
	public static Shap productshape(String type){
		try{
		if(type.equals("Բ��")){
			return new Circle();
		}else if(type.equals("����")){
			return new Rectangle();
		}else if(type.equals("������")){
			return new Triangle();
		}else{
			System.out.println("û�������״����");
			return null;
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return null;
		
	}

}
