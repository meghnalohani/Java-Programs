
package triangle;

public class SideIsZero extends IllegalTriangleException {
    
    SideIsZero(String s)
    {   System.out.println(s);
        System.out.println("Side cannot be zero");
    }
}
