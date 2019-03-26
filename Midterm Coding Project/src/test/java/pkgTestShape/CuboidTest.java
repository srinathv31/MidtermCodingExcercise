package pkgTestShape;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Cuboid.SortByArea;

public class CuboidTest {
	
	@Test
	public void CuboidTest() {
		Cuboid cub1 = new Cuboid(2,4,6);
		Cuboid cub3 = new Cuboid(8,4,12);
		
		try { Cuboid cub2 = new Cuboid(5,8,-4);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Illegal Depth");
		}
		
		System.out.println("Cub1 Depth");     //Getter Method for Depth
		System.out.println(cub1.getiDepth());
		
		cub3.setiDepth(10);					//Setter Method for Depth
		
		System.out.println("Cub3 Depth");
		System.out.println(cub3.getiDepth());
		
		System.out.println("Cuboid Areas");
		System.out.println(cub1.area()); 	//Area Method
		System.out.println(cub3.area());
	
		
	}
	
	@Test(expected = IndexOutOfBoundsException.class) 
	public void testIndexOutOfBoundsException() {
	    ArrayList emptyList = new ArrayList();
	    Object o = emptyList.get(0);
	}
	
	@Test
	public void TestCuboidAreaSort() {
		
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
		
		for (int i = 0; i<10; i++)
		{
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iDepth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			cubs.add(new Cuboid(iWidth, iLength, iDepth));
		}
		
		System.out.println("***Before Sorting***");
		PrintCuboids(cubs);
		Collections.sort(cubs, new SortByArea());
		System.out.println("Sorted Cuboids");
		PrintCuboids(cubs);
		
	}

	private static void PrintCuboids(ArrayList<Cuboid> cubs) {
		System.out.println("***Before Sorting***");
		for (Cuboid c: cubs)
		{
			System.out.println(c.area());
		}
		System.out.println("*** Surface Area by Ascending Order***");
	}

	


}

