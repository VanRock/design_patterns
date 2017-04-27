package net.metrosystems.designpattern.prototype;

public class PrototypePatternDemo {
	public static void main(String[] args){
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());
	}
}
