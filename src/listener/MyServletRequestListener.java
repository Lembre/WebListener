package listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created by Lembre on 2018.5.8
 */
//ServletRequest事件监听器
public class MyServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        String name = sre.getServletRequest().getParameter("name");
        //这里需要手动在浏览器输入的URL加上那么这个参数，因为只是测试而已
        System.out.println("requestInitialized name ：" + name);
    }
}
/*servletrequestevent.getServletRequest()获取的是request对象，request.getParameter("")获取请求的参数*/
