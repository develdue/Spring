
public class Main {

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		single.setRepository(500, "서재연");
		
		Singleton single2 = Singleton.getInstance();
		single2.setRepository(400, "tjwodus");
		System.out.println(single.repository);
		
		System.out.println(single.getRepository().getItem("서재연").getPrice());
		single2.repository= null;
		single2.repository= new Repository();
		System.out.println(single2.repository);
		System.out.println(single2.getRepository().getItem("tjwodus").getPrice());
	}
}

class Member {
	private Long memberId;
	private String memberName;
	private String Grade; //enum 사용 VIP / BASIC
}