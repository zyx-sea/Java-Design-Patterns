//源
public class Student {

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void study(){
		System.out.println(name+"现就读于初三一班");
	}
	public void hobby(){
		System.out.println(name+"喜欢游泳、唱歌！！");
	}
}
