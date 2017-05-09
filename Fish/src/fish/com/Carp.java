package fish.com;

public class Carp implements Freshwaterfish {

	@Override
	public void grow() {
		System.out.println("鲤鱼在生长！！");

	}

	@Override
	public void harvest() {
		System.out.println("收获鲤鱼！！");

	}

}