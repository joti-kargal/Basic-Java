package Module2;


interface Mesho
{
    void  abtractmethod1();
    void  abtractmethod2();
}
public class Interface  implements Mesho {

	public static void main(String[] args) {
		Interface I1= new Interface();
		I1.abtractmethod1();
	    I1.abtractmethod2();

	}

	@Override
	public void abtractmethod1() {
		System.out.println("Developer will add the logic here 1");
		
	}

	@Override
	public void abtractmethod2() {
		System.out.println("Developer will add the logic here 2");
		
	}

}
