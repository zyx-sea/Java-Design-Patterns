package fish.com;

public class SimpleFactory {

	public static void main(String[] args) {
		Freshwaterfish mycarp=Fishframe.productfish("����");
		if(mycarp!=null){
			mycarp.grow();
			mycarp.harvest();
		}
		Freshwaterfish mygrasscarp=Fishframe.productfish("����");
		if(mygrasscarp!=null){
			mygrasscarp.grow();
			mygrasscarp.harvest();
		}
		Freshwaterfish myjifish=Fishframe.productfish("����");
		if(myjifish!=null){
			myjifish.grow();
			myjifish.harvest();
		}
		Freshwaterfish mygoldfish=Fishframe.productfish("����");
		if(mygoldfish!=null){
			mygoldfish.grow();
			mygoldfish.harvest();
		}

	}

}
