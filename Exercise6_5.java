package firstJava;

public class Exercise6_5 {

	public static void main(String[] args) {
		AddAmount a=new AddAmount();
		AddAmount b=new AddAmount(30);
		System.out.println(b.increase());
		System.out.println(b.increase());
		System.out.println(a.increase());
		System.out.println(a.increase());
		System.out.println(b.showTransaction());

	}

}
class AddAmount{
	int amount=50;
	int add;
	int transaction=0;
	public  AddAmount() {
		this.add=0;
		}
	public AddAmount(int a) {
		this.add=a;
	}
	int increase() {
		this.transaction++;
		this.amount=this.amount+this.add;
		return this.amount;
	}
	int showTransaction() {
		return this.transaction;
	}
}
