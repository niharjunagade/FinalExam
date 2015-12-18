package QuestionC;

import java.io.EOFException;

public class IllegalRectangle extends Exception {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	public void rectangle(int newx, int newy) throws EOFException {
		
		if (newx > 0 or newy > 0) {
			ComputeArea();
		}
			else
			{
				throw new EOFException;
		}
	
	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}

}
