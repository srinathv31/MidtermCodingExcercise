package pkgShape;

public class Rectangle extends Shape implements Comparable {
		private int iWidth;
		private int iLength;
		
		public Rectangle(int iWidth, int iLength) {
			this.iWidth = iWidth;
			this.iLength = iLength;
			
			if (iWidth < 0 || iLength < 0) {
				throw new IllegalArgumentException();
			}
		}
		
		public int getiWidth() {
			return iWidth;
		}
		
		public void setiWidth(int width) {
			iWidth = width;
		}
		
		public int getiLength() {
			return iLength;
		}
		
		public void setiLength(int length) {
			iLength = length;
		}
		
		public double area() {
			return (double)(this.iWidth * this.iLength);
		}
		
		public double perimeter() throws Exception{
			return (double) (this.iWidth * 2) + (this.iLength * 2);
		}
		
		@Override
		public int compareTo(Object o) {
			
			Rectangle r = (Rectangle) o;
			return (int) (this.area() - r.area());
		}

}

