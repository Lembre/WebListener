package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * Created by Lembre on 2018.5.8
 */
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener{
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequest_attributeAdded :" + srae.getName());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequest_attributeRemoved :" + srae.getName());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequest_attributeReplaced :" + srae.getName());
    }
}
