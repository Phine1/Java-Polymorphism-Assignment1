   class Shape {
   private String color;
   public Shape (String color) {
      this.color = color;
   }   
   
   public double getArea() {
	      System.out.println("Shape undefined, so cannot compute area");
	      return 00;
   }
   public String toString() {
      return "(The Object shape is undefined, but object color is" + color+")";
   }
   }
   
 class Rectangle extends Shape {
   private int length, width;
   public Rectangle(String color, int length, int width) {
      super(color);
      this.length = length;
      this.width = width;
 } 
   @Override
   public double getArea() {
      return length*width;
   }
   @Override
   public String toString() {
      return "Rectangle(length=" + length + ",width=" + width + "," + "Area =" +getArea() + ")";
      }
  
}
  class Triangle extends Shape {
   private int base, height;
   
   public Triangle(String color, int base, int height) {
      super(color);
      this.base = base;
      this.height = height;
 }
   @Override
   public double getArea() {
      return 0.5*base*height;
   }
   
   @Override
   public String toString() {
      return "Triangle(base=" + base + ",height=" + height + "," + "Area ="+ getArea()+")";
   }
   }
public class Q1 {
   public static void main(String[] args) {
      Shape s1 = new Rectangle("black", 8, 12);  
      System.out.println(s1);  
      System.out.println("Area is " + s1.getArea());  
    
      Shape s2 = new Triangle("oragee", 7, 10);  
      System.out.println(s2);  
      System.out.println("Area is " + s2.getArea()); 
    
      Shape s3 = new Shape("white");
      System.out.println(s3);
      System.out.println("Area is " + s3.getArea());
   }
}
   
	  
		  
		      
		   
	
