
/**
 *具体原型类
 *
 */
public class ConcreteResume1 implements Resume,Cloneable {
	private String name;
	private String birthday;
	private String sex;
	private String school;
	private String timeArea;
	private String company;


	public Object cloneMe() throws CloneNotSupportedException{
		Resume resume=null;
		try{
			resume=(Resume)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			System.out.println(e.getMessage());	
		}
		return resume;
	
	}
	public ConcreteResume1(String name){
		this.name=name;
	}
	@Override
	public void setPersonInfo(String birthday, String sex, String school) {
		this.birthday=birthday;
		this.sex=sex;
		this.school=school;

	}

	
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea=timeArea;
		this.company=company;

	}

	
	@Override
	public void display() {
		System.out.println("姓名："+name);
		System.out.println("生日："+birthday+" 性别："+sex+" 毕业学校："+school);
		System.out.println("工作年限："+timeArea+" 公司："+company);

	}
	
	public Object clone() throws CloneNotSupportedException {
		Resume resume=null;
		try{
			resume=(Resume)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			System.out.println(e.getMessage());	
		}
		return resume;
	}

	
}
