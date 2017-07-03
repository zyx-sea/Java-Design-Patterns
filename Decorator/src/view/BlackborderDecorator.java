package view;

/**
 * 具体装饰者<br>
 * create:2017-06-27 16:20
 *
 * @author zhou
 */
public class BlackborderDecorator extends Decorator {
    public BlackborderDecorator(View view) {
        super(view);
    }
    public void  display(){
        System.out.println("带有黑色边框的");
        super.display();
    }
}
