//抽象原型类
public interface Resume {

	public Object cloneMe() throws CloneNotSupportedException;
	public void setPersonInfo(String birthday,String sex,String school);
	public void setWorkExperience(String timeArea,String company);
	public void display();

}
