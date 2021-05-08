package top.ysxc.o2o.exceptions;

/**
 * @author ysxc
 * @create 2021-01-14 7:53 下午
 */
public class ShopOperationException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = 2361446884822298905L;

    public ShopOperationException(String msg) {
        super(msg);
    }
}
