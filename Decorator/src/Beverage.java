
public abstract class Beverage{
	
	public enum Size {
	    tall,grande,venti;
	}
	
	private Size size = Size.tall;
	
	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public Size getSize(){
		return this.size;
	}
	
	public void setSize(Size size){
		this.size = size;
	}
	public abstract double cost();
	
	
}