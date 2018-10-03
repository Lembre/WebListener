package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Created by Lembre on 2018.5.8
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("ServletContext_attributeAdded :" + scae.getName());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("ServletContext_attributeRemoved :" + scae.getName());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("ServletContext_attributeReplaced :" + scae.getName());
    }
}
