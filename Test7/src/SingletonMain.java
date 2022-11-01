import java.util.HashMap;
import java.util.Map;

class Singleton {

	private Repository repository = new Repository();
	private static final Singleton instance = new Singleton();//상수(변하지 않는수), Singleton 타입의 instance라는 변수는 새로운 Singleton객체가 있다.
   															 //static 으로 한 이유 -> static이란 필드나 변수를 시스템에(jvm) 저장.
   															 
	private Singleton() {
		
	}
   
   public static Singleton getInstance() {
      return instance;
   }
   
   public Item setRepository(int price , String name) {
	   Item item = new Item();
	   item.setPrice(price);
	   item.setName(name);
	   repository.setItem(item);
	   
	   return item;
   }
}

class Repository {
	
	private static Map<String , Item> store = new HashMap<>();
	
	public void setItem(Item item) {
		store.put(item.getName(), item);
	}
	
	//그냥 알아야함
	public Item getItem(String name) {
		return store.get(name);
	}
	
	public void clearStore() {
		store.clear();
	}
}

class Item {
	
	private int price;
	private String name;
	
	public void setPrice(int price) {this.price = price; }
	public void setName(String name) {this.name = name; }
	
	public int getPrice() {return price; }
	public String getName() {return name; }
}
 