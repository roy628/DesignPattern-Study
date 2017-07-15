public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated method stub
		this.beverage = beverage;

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if (beverage.getSize() == Size.tall){
			return 0.1+beverage.cost();
		}else if(beverage.getSize() == Size.grande){
			return 0.15+beverage.cost();
		}else{
			return 0.2+beverage.cost();
		}
	}
}