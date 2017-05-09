
public class Prototype {

	public static void main(String[] args) {
		Resume a=new ConcreteResume1("张三三");
		a.setPersonInfo("2.23", "男", "XX大学");
		a.setWorkExperience("2015.02.04", "xxxxx有限公司");
		
		Resume b=null;
		try{
			b=(Resume)a.cloneMe();
		}catch(CloneNotSupportedException ex){
			System.out.println("出错");
		}
		
		System.out.println("----------A----------");
		a.display();
		System.out.println("-----------B-----------");
		b.display();
		
		System.out.println("A==B?  ");
		System.out.println(a==b);
		
		System.out.println("A.getClass==B.getClass?  ");
		System.out.println(a.getClass()==b.getClass());
		

	}

}
