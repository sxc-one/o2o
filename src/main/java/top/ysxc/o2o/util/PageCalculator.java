package top.ysxc.o2o.util;

/**
 * @author ysxc
 * @create 2021-02-10 7:18 下午
 */
public class PageCalculator {
    public static int calculateRowIndex(int pageIndex, int pageSize) {
        return (pageIndex > 0) ? (pageIndex - 1) * pageSize : 0;
    }
}
