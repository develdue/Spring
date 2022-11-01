class Singleton {

   private int price; //접근지정자는 상관 없음 static 도 마찬가지, 이렇게 하면 안되는 이유 -> 
	
   private static final Singleton instance = new Singleton();//상수(변하지 않는수), Singleton 타입의 instance라는 변수는 새로운 Singleton객체가 있다.
   															 //static 으로 한 이유 -> static이란 필드나 변수를 시스템에(jvm) 저장.
   
   private Singleton() {//private이므로 이 생성자 호출 불가능. 이렇게 한 이유 -> 
      
   }
   
   public Singleton getInstance() {//이 클래스에서 유일하게 호출가능. getInstance()를 사용하면 instance를 반환. 
	   								//틀림 -> 
      return instance;
   }
}
 