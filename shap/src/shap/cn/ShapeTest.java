package shap.cn;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shap myshape=Shapefarm.productshape("Բ��");
		if(myshape!=null){
			myshape.draw();
			myshape.erase();
		}

		Shap myshape2=Shapefarm.productshape("xxxx��");
		if(myshape2!=null){
			myshape2.draw();
			myshape2.erase();
		}
	}

}
