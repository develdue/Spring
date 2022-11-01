import java.util.HashMap;
import java.util.Map;

class Singleton {

	public Repository repository = new Repository(); //수정 못하게 하려고 접근지정자 private, 필드값
	private static final Singleton instance = new Singleton();//상수(변하지 않는수), Singleton 타입의 instance라는 변수는 새로운 Singleton객체가 있다.
   															 //static 으로 한 이유 -> static이란 필드나 변수를 시스템에(jvm) 저장.
   															 
	private Singleton() {
		
	}
   
	
	public Repository getRepository () {
		return repository;
	}
	
   public static Singleton getInstance() {
      return instance;
   }
   
   public Item setRepository(int price , String name) {//setRepository 매개변수 int와 name을 집어 넣는다.
	   Item item = new Item(); //Item객체 생성
	   item.setPrice(price); 
	   item.setName(name);
	   repository.setItem(item);//setItem메소드에 item매개변수를 집어넣으면 이름을 저장하고 아이템에 저장된 이름을 가져오고 item 주소값 store에 세팅.
	   
	   return item; //이후 아이템 주소값 반환
   }
}
class Repository {
	
	private static Map<String , Item> store = new HashMap<>();
	
	public void setItem(Item item) { //Item 타입의 매개변수를 넣으면 store 맵 변수에 item에 저장된 이름과 주소값 세팅
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
 