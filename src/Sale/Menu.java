package Sale;

public class Menu<K,V> {
	
	//Generic(제네릭) : 결정되지 않은 파라미터를 처리
	//실제 객체를 생성할 때 파라미터 타입을 결정해서 대체
	//<T> <K,V> 한 개만 있을 땐 T, 두 개는 Key, Value
	
	private K menu;
	private V price;
	
	public Menu() {}
	public Menu(K menu, V price) {
		this.menu=menu;
		this.price=price;
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return menu +" : "+ price;
	}
	
}
