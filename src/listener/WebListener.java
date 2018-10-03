package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Lembre on 2018.5.8
 */

//ServletContextListener是ServletContext中定义的接口
    //ServletContext事件监听器
public class WebListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String initParam = sce.getServletContext().getInitParameter("initParam");
        System.out.println("contextInitialized : initParam = " + initParam);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed");
    }
}
/*ServletContext对象在Web应用创建时生成，在Web应用销毁时就会销毁,可以在控制台看到输出语句*/
/*有多个监听器的时候，按web.xml中注册顺序启动 监听器>过滤器>servlet的启动顺序*/
