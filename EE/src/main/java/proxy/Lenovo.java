package proxy;

public class Lenovo implements SaleComputer{

	@Override
	public String sale(double money) {
		System.out.println("花了 "+money+" 元買一台電腦。");
		return "聯想電腦";
	}

	@Override
	public void show() {
		System.out.println("展示電腦");
		
	}

}
