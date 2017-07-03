package view;

/**
 * 具体装饰者<br>
 * create:2017-06-27 16:16
 *
 * @author zhou
 */
public class ScrollbarDecorator extends Decorator {
    public ScrollbarDecorator(View view) {
        super(view);
    }
    public void  display(){
        System.out.println("带有滚动条的");
       super.display();
    }
}
