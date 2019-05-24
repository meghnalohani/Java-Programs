
package triangle;

public class InvalidSides extends IllegalTriangleException{
    InvalidSides(String s)
    {
        System.out.println(s);
        System.out.println("Sum of length of two sides must be greater than the third side");
    }
            
}

    
