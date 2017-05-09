package fish.com;

public class SimpleFactory {

	public static void main(String[] args) {
		Freshwaterfish mycarp=Fishframe.productfish("Р№гу");
		if(mycarp!=null){
			mycarp.grow();
			mycarp.harvest();
		}
		Freshwaterfish mygrasscarp=Fishframe.productfish("Внгу");
		if(mygrasscarp!=null){
			mygrasscarp.grow();
			mygrasscarp.harvest();
		}
		Freshwaterfish myjifish=Fishframe.productfish("іъгу");
		if(myjifish!=null){
			myjifish.grow();
			myjifish.harvest();
		}
		Freshwaterfish mygoldfish=Fishframe.productfish("Н№гу");
		if(mygoldfish!=null){
			mygoldfish.grow();
			mygoldfish.harvest();
		}

	}

}
