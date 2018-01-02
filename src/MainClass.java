
public class MainClass {
	
	public static void main(String[] args){
		ShapeFactory f = new ShapeFactory();
		Shape c = f.getObject("CIRCL");
		//This is a test comment
		c.draw();
	}
	
}
