package cn.edu.cqu.annotation;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class PersonProxy {
	private static Enhancer enhancer;
	static {
		enhancer =new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new MethodInterceptor() {

			@Override
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
				Interceptor inter=method.getAnnotation(Interceptor.class);
				Object result;
				if(inter!=null)
				{
					System.out.println("开始调用"+method.getName());
					result = proxy.invokeSuper(obj, args);
					System.out.println("结束调用"+method.getName());
				}
				else {
					result = proxy.invokeSuper(obj, args);
				}
		        return result;
			}
        });
	}
	public static Person create(String name,int age)
	{
		return (Person) enhancer.create(new Class[] {String.class,int.class},new Object[] {name,age} );
	}
}
