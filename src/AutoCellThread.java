import javax.swing.*;

public class AutoCellThread extends Thread {

	public JFrame JF;

	public AutoCellThread(JFrame JF) {

		this.JF = JF;

	}

	public void run() {
		System.out.println("OOOOO" + GridFrame.trigger);
		while (GridFrame.trigger == 1) {
			new CellStateChanges();
			SwingUtilities.updateComponentTreeUI(JF);
			GridFrame.gencount++;
			GridFrame.gendisplaynum.setText(Integer.toString(GridFrame.gencount));
			//System.out.println(GridFrame.trigger);
			try {
				AutoCellThread.sleep(CellManipulation.refreshrate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
