package top.ysxc.o2o.exceptions;

/**
 * @author ysxc
 * @create 2021-02-17 2:22 下午
 */
public class ProductCategoryOperationException extends RuntimeException{

    private static final long serialVersionUID = 1182563719599527969L;

    public ProductCategoryOperationException(String msg) {
        super(msg);
    }
}
