package chapter7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class List7_6 {
	public static void main(String[] args) throws Exception{
		Class clazz = RefSample7_6.class;
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample7_6 rs = (RefSample7_6) cons.newInstance(256);

		Field f = clazz.getField("items");
		f.set(rs,2);
		System.out.println(f.get(rs));

		Method m = clazz.getMethod("hello",String.class,int.class);
		m.invoke(rs, "reflection!",128);


		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
	}
}