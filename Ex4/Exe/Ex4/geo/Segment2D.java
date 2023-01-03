package Exe.Ex4.geo;


/**
 * This class represents a 2D segment on the plane, 
 * Ex4: you should implement this class!
 * @author I2CS
 *
 */
public class Segment2D implements GeoShapeable{
	private Point2D _p1;
	private Point2D _p2;

	public Segment2D(Point2D p1,Point2D p2)
	{
		this._p1=p1;
		this._p2=p2;
	}
	public Point2D getP1(){
		return this._p1;
	}
	public Point2D getP2(){
		return this._p2;
	}
	@Override
	public boolean contains(Point2D ot) {
		if(_p1.distance(ot)+_p2.distance(ot)==_p1.distance(_p2)) 
			return true;
		
	return false;
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return 2*_p1.distance(_p2);
	}

	@Override
	public void move(Point2D vec) {
		_p1.move(vec);
		_p2.move(vec);
	}

	@Override
	public GeoShapeable copy() {
		return new Segment2D(_p1,_p2);
	}
	
	@Override
	public Point2D[] getPoints() {
	Point2D[] ans= new Point2D[2];
	ans[0] =new Point2D(_p1);
	ans[1] =new Point2D(_p2);
	return ans;
	}
	
	@Override
	public void scale(Point2D center, double ratio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate(Point2D center, double angleDegrees) {
		// TODO Auto-generated method stub
		
	}

	
	
}