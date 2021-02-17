package top.ysxc.o2o.exceptions;

/**
 * @author ysxc
 * @create 2021-02-17 9:31 下午
 */
public class ProductOperationException extends RuntimeException{

    private static final long serialVersionUID = 5076172298827469013L;

    public ProductOperationException(String msg) {
        super(msg);
    }
}
