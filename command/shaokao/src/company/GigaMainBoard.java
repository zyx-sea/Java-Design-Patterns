package company;

/**
 * 接受者角色（主板实现类）<br>
 * create:2017-05-11 10:56
 *
 * @author zhou
 */
public class GigaMainBoard implements MainBoardApi {

    @Override
    public void open() {
        System.out.println("烤鸡翅");
        System.out.println("烤串");
    }
}
