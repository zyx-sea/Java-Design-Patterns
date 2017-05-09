package shap.cn;

public class Shapefarm {
	
	
	public static Shap productshape(String type){
		try{
		if(type.equals("圆形")){
			return new Circle();
		}else if(type.equals("矩形")){
			return new Rectangle();
		}else if(type.equals("三角形")){
			return new Triangle();
		}else{
			System.out.println("没有这个形状！！");
			return null;
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return null;
		
	}

}
