
public class CellStateChanges {

	public CellStateChanges() {
		
		
		for(int x = 1; x < 74; x++) {
			for(int y = 1; y < 79; y++) {
				
				CellManipulation.focusedArray[x][y].lifecount = 0;
					if(CellManipulation.focusedArray[x-1][y-1].state == true)
						CellManipulation.focusedArray[x][y].lifecount++;
					if(CellManipulation.focusedArray[x-1][y].state == true)
						CellManipulation.focusedArray[x][y].lifecount++;
					if(CellManipulation.focusedArray[x-1][y+1].state == true)
						CellManipulation.focusedArray[x][y].lifecount++;
					if(CellManipulation.focusedArray[x][y-1].state == true)
						CellManipulation.focusedArray[x][y].lifecount++;
					if(CellManipulation.focusedArray[x][y+1].state == true)
						CellManipulation.focusedArray[x][y].lifecount++;
					if(CellManipulation.focusedArray[x+1][y-1].state == true)
						CellManipulation.focusedArray[x][y].lifecount++;
					if(CellManipulation.focusedArray[x+1][y].state == true)
						CellManipulation.focusedArray[x][y].lifecount++;
					if(CellManipulation.focusedArray[x+1][y+1].state == true)
						CellManipulation.focusedArray[x][y].lifecount++;
				
					
			}
		}
		
		for(int x = 1; x < 74; x++) {
			for(int y = 1; y < 79; y++) {
				
				if((CellManipulation.focusedArray[x][y].lifecount == 2 || CellManipulation.focusedArray[x][y].lifecount == 3) && CellManipulation.focusedArray[x][y].state == true) {
					CellManipulation.focusedArray[x][y].statetwo = true;
				}
				if((CellManipulation.focusedArray[x][y].lifecount == 3 && CellManipulation.focusedArray[x][y].state == false)) {
					CellManipulation.focusedArray[x][y].statetwo = true;
				}
				if((CellManipulation.focusedArray[x][y].lifecount > 3 && CellManipulation.focusedArray[x][y].state == true)) {
					CellManipulation.focusedArray[x][y].statetwo = false;
				}
				if((CellManipulation.focusedArray[x][y].lifecount < 2 && CellManipulation.focusedArray[x][y].state == true)) {
					CellManipulation.focusedArray[x][y].statetwo = false;
				}
				else
					CellManipulation.focusedArray[x][y].state = false;
					
				
			}
		}
		
		
		
		for(int x = 1; x < 74; x++) {
			for(int y = 1; y < 79; y++) {
				
				CellManipulation.focusedArray[x][y].state = CellManipulation.focusedArray[x][y].statetwo;
			}
		}
		
		
		
	}
	
}
