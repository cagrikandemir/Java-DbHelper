package SpringIntro;

public class CustomerManager {
	
	private ICustomerDal CustomerDal;
		public CustomerManager(ICustomerDal customerDal) {
		CustomerDal = customerDal;
	}
		public void add() {
			CustomerDal.add();
		}
	
}
