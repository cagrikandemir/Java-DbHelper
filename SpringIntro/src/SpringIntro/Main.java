package SpringIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CustomerManager manager = new CustomerManager(new CustomerDal());
			manager.add();
	}

}
