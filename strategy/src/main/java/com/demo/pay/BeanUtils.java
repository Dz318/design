package com.demo.pay;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

/***
 * Bean工具类 作用:自己new的对象怎么注入spring管理的对象
 * Created by dz on 2019-9-3
 * @author dz
 */
@Service
public class BeanUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanUtils.applicationContext = applicationContext;
    }

    /***
     * 抽象类注入对象
     */
    public static Object getObject(String id){
        Object object = null;
        object = applicationContext.getBean(id);
        return object;
    }

    /***
     * 把继承该类的成员变量(通过spring 管理的bean) 注入到继承的类中
     */
    @Deprecated
    public BeanUtils(){
        if(applicationContext==null) {
            return;
        }
        // 加载继承该类的类 扫描成员变量
        Field[] fields = this.getClass().getDeclaredFields();
        //扫描所有注入的成员变量
        //Set<Field> fields = reflections.getFieldsAnnotatedWith(javax.annotation.Resource.class);
        // 遍历成员变量
        for(Field f:fields){
            try {
                //获取成员变量的名字
                String simpleName = f.getType().getSimpleName();
                //成员变量名称首字母转小写
                String beanName = toLowerCaseFirstLetter(simpleName);
                Object bean = applicationContext.getBean(beanName);
                if ( null == bean ) {
                    return;
                }
                //打破封装 private失效
                f.setAccessible(true);
                //将spring管理的对象 设置到我们反射出来的对象中
                f.set(this,bean);
            } catch (IllegalAccessException e) {
                //e.printStackTrace();
            }
        }
    }
    @Deprecated
    private static String toLowerCaseFirstLetter(String str) {
        String first = str.substring(0, 1);
        //substring(1),获取索引位置1后面所有剩余的字符串
        String after = str.substring(1);
        first = first.toLowerCase();
        return first + after;
    }
}
