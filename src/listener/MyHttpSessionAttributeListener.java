package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by Lembre on 2018.5.8
 */
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener{
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("HttpSession_attributeAdded :" + se.getName());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("HttpSession_attributeRemoved :" + se.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("HttpSession_attributeReplaced :" + se.getName());
    }
}
