package chapter3;


	import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


	public class ChapTest3_3 {
		public static void main(String[] args) {
			Hero3 h = new Hero3("斉藤");
			Hero3 hh = new Hero3("鈴木");

			List<Hero3> names = new ArrayList<Hero3>();
			names.add(h);
			names.add(hh);
			for (Hero3 hn : names) {
				System.out.println(hn.getName());
			}
				Map<Hero3, Integer> viran = new HashMap<Hero3, Integer>();
				viran.put(h, 3);
				viran.put(hh, 7);
				for (Hero3 key : viran.keySet()) {
					int value = viran.get(key);
					System.out.println(key.getName() +"が倒した敵は" + value);


			}
		}
	}



	class Hero3{
		private String name;
		public Hero3(String name) {
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
	}


