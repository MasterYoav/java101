package Exe.Ex4.geo;

/**
 * This class represents a 2D Triangle in the plane.
 * Ex4: you should implement this class!
 * @author I2CS
 *
 */
public class Triangle2D implements GeoShapeable{
	private Point2D _p1;
	private Point2D _p2;
	private Point2D _p3;
	
	public Point2D getP1(){
		return this._p1;
	}
	public Point2D getP2(){
		return this._p2;
	}
	public Point2D getP3(){
		return this._p3;
	}
	@Override
	public boolean contains(Point2D ot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(Point2D vec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GeoShapeable copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scale(Point2D center, double ratio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate(Point2D center, double angleDegrees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point2D[] getPoints() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
