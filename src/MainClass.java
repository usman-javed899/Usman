
public class MainClass {
	
	public static void main(String[] args){
		ShapeFactory f = new ShapeFactory();
		Shape c = f.getObject("CIRCL");
		c.draw();
	}
	
}
