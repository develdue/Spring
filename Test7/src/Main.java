import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Item item = new Item(3L,1000);
		AImpl a2 = new AImpl();//나중에 유지보수를 할 때 편하기 위해서 접근성을 제어하기 위해서
		//AImpl에 따로 정의 되어있는 메소드들은 사용하지 못하게 되고 결국 인터페이스 A에 있는 메소드들만 사용하기 때문에
		//나중에 뒤부분인 new AImpl 이 부분만 수정하면 메소드들은 그대로 사용이 가능하기에 뒤에 있는 객체명만 수정하면 됌.
		A a = new AImpl();//AImpl이라는 익명객체를 타입A인 변수명 a에 추가한다.
		a.save(item);
		a.findById(3L);
		
		
		B b = new BImpl(a);//BImpl이라는 익명객체에 매개변수 a를 집어넣는 생성자로 만들어서 타입 (인터페이스)B인 변수명 b에 추가한다. 
		b.findItem(3L);
		b.setItem(item);

	}

}

interface A {
	void save(Item item);
    
    Item findById(Long id);
}

class AImpl implements A {
    private static Map<Long, Item> store = new HashMap<>();
    
    public void save(Item item) {
       store.put(item.getId() , item);
    }
    
    public Item findById(Long id) {
        return store.get(id);
     }
  }
interface B{
	
	Item findItem(Long id);
	
	void setItem(Item item);
}

class BImpl implements B{
	
	private final A b;//상수는 초기화해야하는데 되어있지 않으므로 에러 발생 이 부분을 해결해야만 한다.
	
	BImpl(A c){
		this.b=c;
	}	
	
	public Item findItem(Long id) {
		return b.findById(id);
	}
	
	public void setItem(Item item) {
		b.save(item);
	}
}

class Item{
	Long id;
	int price;
	
	Item(Long id, int price){
		this.id=id;
		this.price=price;
	}

	public Long getId() {return id;}

	public int getPrice() {return price;}
	
	public void setId(Long id) {this.id = id;}

	public void setPrice(int price) {this.price = price;}
	
	//Configuration이라는 어노테이션을 사용해서 스프링 컨테이너를 만든다음
	//포함되어 있는 메소드들을 Bean으로 지정해 스프링 컨테이너에서 스프링에서 관리하게 만들어줌.
	//나는 어느어느 부분에서 사용하라고 지정해줌. 어느 부분에 의존성 주입을 하라고 명령을 하는 것.
	
}

class AppComfiguration{
	
	BImpl bDependencyIn() {
		return new BImpl(aDependencyIn());
	}
	
	AImpl aDependencyIn() {
		return new AImpl();
	}
}