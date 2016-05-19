package chapter7;

import java.lang.reflect.Method;

public class Launcher {
	public static void main(String[] args) {
		String func = args[0];
		String sw = args[1];
	showMemory();
	   try {
		Class<?> clazz = Class.forName(func);
		listMethod(clazz);
		if(sw.equals("E")){
			launchExternal(clazz);
		}else if(sw.equals("I")){
			launchInternal(clazz);
		}else{
			throw new IllegalArgumentException();
		}

	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		System.exit(0);
	 }
	   showMemory();
	   System.exit(0);

	}
	   public static void listMethod(Class<?> clazz){
		   System.out.println("メソッド一覧表示");
		   Method[] methods = clazz.getDeclaredMethods();
		   for(Method m : methods){
			   System.out.println(m.getName());
		   }
	   }

	   public static void launchExternal(Class<?> clazz)throws Exception{
		   ProcessBuilder pb = new ProcessBuilder(
				   "java",clazz.getName());
		   Process proc =pb.start();
		   proc.waitFor();
	   }
	   public static void launchInternal(Class<?> clazz)throws Exception{
		   Method m = clazz.getMethod("main", String[].class );
				   String[] args = {};
		   m.invoke(null, (Object)args);
	   }
	   public static void showMemory(){
		   long f = Runtime.getRuntime().freeMemory();
		   long total = Runtime.getRuntime().totalMemory();
		   long usage = (total - f) /1024/1024;
		   System.out.println("現在のメモリ使用量：" + usage + "MB");
   }
}
