package com.gupaoedu.a_factory.simple_factory;

import com.gupaoedu.a_factory.MailSender;
import com.gupaoedu.a_factory.Sender;
import com.gupaoedu.a_factory.SmsSender;

public class SenderFactory {

    /**
     * 根据type返回具体对象，
     * 但如果type错误，不能正确返回.  代码复杂 if else
     * @param type
     * @return
     */
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }
        return null;
    }

    /**
     * 通过入参className  类名反射
     * 针对上一方法优化，但人不能解决 className 错误的情况
     * @param className
     * @return
     */
    public Sender produce_className(String className){
        if(null != className && className != ""){
            try {
               return (Sender) Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**
     * 直接传入对象实例
     * @param clazz
     * @return
     */
    public Sender produce_class(Class clazz){
        if(null != clazz){
            try {
                return (Sender) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
