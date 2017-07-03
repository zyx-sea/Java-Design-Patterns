package view;

/**
 * <br>
 * create:2017-06-27 16:29
 *
 * @author zhou
 */
public class Test {
    public static void main(String[] args) {
        View textview=new TextView();
        View picview=new PictureView();
        textview=new ScrollbarDecorator(textview);
        textview.display();
        picview=new BlackborderDecorator(picview);
        picview.display();
        picview=new BlackborderDecorator(picview);
        picview.display();
    }
}
