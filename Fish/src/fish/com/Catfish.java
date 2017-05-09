package fish.com;

public class Catfish implements Freshwaterfish {

	@Override
	public void grow() {
		System.out.println("鲶鱼在生长！！");

	}

	@Override
	public void harvest() {
		System.out.println("收获鲶鱼！！");

	}

}
