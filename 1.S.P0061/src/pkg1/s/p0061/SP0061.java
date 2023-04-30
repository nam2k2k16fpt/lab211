/*

 */
package pkg1.s.p0061;


public class SP0061 {

    public static void main(String[] args) {
        System.out.println("=====Calculator Shape Program=====");
        UserInput ui = new UserInput();
       //User enter side width of Rectangle
       double width = ui.inputNumber("Please input side width of Rectangle:");
       
       //User enter side length of Rectangle
       double length = ui.inputNumber("Please input side width of Rectangle:");
       
       Rectangle r = new Rectangle(width,length);
       
       //User enter radius length of Crticle
       double radius = ui.inputNumber("Please input radius of Circle:");
       Circle c = new Circle(radius);
      
       //User enter side A of Triangle
       double sideA = ui.inputNumber("Please input side A of Triangle:");
       
       //User enter side B of Triangle
       double sideB = ui.inputNumber("Please input side B of Triangle:");
       
       //User enter side C of Triangle
       double sideC = ui.inputNumber("Please input side C of Triangle:");
       
       Triangle t = new Triangle(sideA, sideB, sideC);
       
       //Display infor of Rectangle
       r.printResult();
       //Display infor of Cricle
       c.printResult();
       //Display infor of Triangle
       t.printResult();
    }
    
}
