package pkgShape;

import java.util.*;

public class Cuboid extends Rectangle{
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
		
		if (iDepth < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int depth) {
		iDepth = depth;
	}
	
	public double volume() {
		return (double) (getiLength() * getiWidth() * iDepth);
	}
	
	@Override
	public double area() {
		return (double) (2 * ((getiLength() * getiWidth()) + (iDepth * getiWidth()) + (iDepth * getiLength())));
	}
	
	@Override
	public double perimeter() throws Exception {
		throw new Exception("UnsupportedOperationException");
	}
	
	public static class SortByArea implements Comparator<Cuboid> {
		public int compare(Cuboid a, Cuboid b) {
			return (int) (a.area() - b.area());
		}
	}
	
	public static class SortByVolume implements Comparator<Cuboid> {
		public int compare(Cuboid c, Cuboid d) {
			return (int) (c.volume() - d.volume());
		}
	}
}

