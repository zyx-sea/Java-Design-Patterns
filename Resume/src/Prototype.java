
public class Prototype {

	public static void main(String[] args) {
		Resume a=new ConcreteResume1("������");
		a.setPersonInfo("2.23", "��", "XX��ѧ");
		a.setWorkExperience("2015.02.04", "xxxxx���޹�˾");
		
		Resume b=null;
		try{
			b=(Resume)a.cloneMe();
		}catch(CloneNotSupportedException ex){
			System.out.println("����");
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
