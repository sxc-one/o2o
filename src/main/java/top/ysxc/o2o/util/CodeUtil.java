package top.ysxc.o2o.util;

import com.google.code.kaptcha.Constants;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ysxc
 * @create 2021-01-29 4:25 下午
 */
public class CodeUtil {

    /**
     * 检查验证码是否和预期相符
     *
     * @param request
     * @return
     */
    public static boolean checkVerifyCode(HttpServletRequest request) {
        String verifyCodeExpected = (String)request.getSession().getAttribute(
                Constants.KAPTCHA_SESSION_KEY
        );
        String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
        if (verifyCodeActual == null || !verifyCodeActual.equals(verifyCodeExpected)) {
            return false;
        }
        return true;
    }
}
