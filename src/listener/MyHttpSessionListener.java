package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by Lembre on 2018.5.8
 */
//session事件监听器
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("sessionDestroyed");

    }
}
/*<session-config> <!-- 设定超时销毁时间(分钟) 然而这个时间并不精确，而且当为0的时候表示无超时销毁-->
<session-timeout>1</session-timeout> </session-config> session 失效的三种场景 1.关闭服务器 2
.关闭浏览器，一段时间后，session自动消失 3.seesion 超时*/