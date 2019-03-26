package pkgTestShape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void RectangleTest() throws Exception {
		Rectangle rec1 = new Rectangle(2,4);
		Rectangle rec3 = new Rectangle(4,8);
		Rectangle rec4 = new Rectangle(10,5);
		
		try { Rectangle rec2 = new Rectangle(-1,4);
	}
		catch (IllegalArgumentException e) {
			System.out.println("Illegal Dimensions");
		}
		
		try { Rectangle rec5 = new Rectangle(3,-1990);
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Illegal Dimensions");
		}
		
		System.out.println("Rec1 Width");
		System.out.println(rec1.getiWidth()); //Getter Method for Width
		System.out.println("Rec1 Length");
		System.out.println(rec1.getiLength()); //Getter Method for Length
		
		System.out.println("Rec3 Width");
		System.out.println(rec3.getiWidth());
		System.out.println("Rec3 Length");
		System.out.println(rec3.getiLength());
		
		rec4.setiWidth(12); 				//Setter Method for Width
		System.out.println("Rec4 Width");
		System.out.println(rec4.getiWidth());
		
		rec4.setiLength(6); 				//Setter Method for Length
		System.out.println("Rec4 Length");
		System.out.println(rec4.getiLength());
		
		System.out.println("Rec1 Area");       // Area Method
		System.out.println(rec1.area());
		System.out.println("Rec1 Perimeter");  // Perimeter Method
		System.out.println(rec1.perimeter());
		
		System.out.println("Rec3 Area");
		System.out.println(rec3.area());
		System.out.println("Rec3 Perimeter");
		System.out.println(rec3.perimeter());
		
		System.out.println("Rec4 Area");
		System.out.println(rec4.area());
		System.out.println("Rec4 Perimeter");
		System.out.println(rec4.perimeter());
		
	}
	
	@Test
	public void TestRectangleSort() {		//compareTo method sorting
		
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		
		for (int i = 0; i<10; i++)
		{
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			recs.add(new Rectangle(iWidth, iLength));
		}
		
		PrintRectangles(recs);
		
		Collections.sort(recs);
		PrintRectangles(recs);
	}

	private static void PrintRectangles(ArrayList<Rectangle> recs) {
		System.out.println("***Before Sorting***");
		for (Rectangle r: recs)
		{
			System.out.println(r.area());
		}
		System.out.println("***Area by Ascending Order***");
	}
	
	
	
	
	
	
	
	
	
	
	
}
