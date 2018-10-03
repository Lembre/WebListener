package entity;


import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by Lembre on 2018.5.8
 */
//感知监听器
public class User implements HttpSessionBindingListener {
    private String username;
    private String password;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("valueBound name:" +event.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("valueUnbound name:" +event.getName());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
