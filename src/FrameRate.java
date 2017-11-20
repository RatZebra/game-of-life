
public class FrameRate {
	
	public int timemodifier;

	public FrameRate(int a) {
		timemodifier = a;
		
	}
	
	public boolean nextFrame() {
		
		long initial_time = System.currentTimeMillis();
		
		if((System.currentTimeMillis()-initial_time) % timemodifier == 0)
			return true;
		
		else
			return false;
	}
}
