package Exe.Ex4.geo;

/**
 * This class represents a 2D rectangle (NOT necessarily axis parallel - this shape can be rotated!)
 * Ex4: you should implement this class!
 * @author I2CS
 *
 */
public class Rect2D implements GeoShapeable {
	private Point2D _p1;
	private Point2D _p2;
	
	public Rect2D (Point2D p1,Point2D p2) {
		this._p1= p1;
		this._p2 = p2;
	}
	public Point2D getP1(){
		return this._p1;
	}
	public Point2D getP2(){
		return this._p2;
	}
	public double getHeight(){
		double h= Math.max(_p1.y(), _p2.y())-(Math.min(_p1.y(), _p2.y()));
		return h;
	}
	public double getWidth(){
		double w= Math.max(_p1.x(), _p2.x())-(Math.min(_p1.x(), _p2.x()));
		return w;
	}
	
	@Override
	public boolean contains(Point2D ot) {
		double miny = Math.min(_p1.y(),_p2.y());
		double minx = Math.min(_p1.x(),_p2.x());
		double maxy = Math.max(_p1.y(),_p2.y());
		double maxx = Math.max(_p1.x(),_p2.x());
		if(ot.y()<miny ||ot.x()<minx||ot.x()>maxx||ot.y()>maxy)
		return false;
		
		return true;
	}

	@Override
	public double area() {
		return this.getHeight()*this.getWidth();
	}

	@Override
	public double perimeter() {
		return 2*this.getHeight()+2*this.getWidth();
	}

	@Override
	public void move(Point2D vec) {
		_p1.move(vec);
		_p2.move(vec);
	}

	@Override
	public GeoShapeable copy() {
		return new Rect2D(_p1,_p2);
	}
	@Override
	public Point2D[] getPoints() {
		double miny = Math.min(_p1.y(),_p2.y());
		double minx = Math.min(_p1.x(),_p2.x());
		double maxy = Math.max(_p1.y(),_p2.y());
		double maxx = Math.max(_p1.x(),_p2.x());
		Point2D[] ans = new Point2D[2];
		ans[0]=new Point2D(minx,miny);
		ans[1]=new Point2D(maxx,maxy);
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
