
package triangle;

public class IllegalTriangleException extends Exception{
    Triangle triangle;
    IllegalTriangleException()
    {super("Illegal triangle parameters");
    }
    IllegalTriangleException(Triangle triangle)
    {
        this();
        this.triangle=triangle;
    }
    
}
