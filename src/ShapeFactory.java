
public class ShapeFactory {
	
	public Shape getObject(String name){
		
		if(name.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      } else {
	         return new Rectangle();
	      }
	}
}
	
