import java.io.*;

public class CellManipulation {
	
	static Cell focusedArray[][] = new Cell[75][80];
	public static int refreshrate = 500;
	
	
	public CellManipulation() {
		
		
		
		//this will be the main array for all cell manipulating. 2D Object array
		
		
		for(int x = 0; x < 75; x++) {
			for(int y = 0; y < 80; y++) {
				
				focusedArray[x][y] = new Cell((y+1)*10 + 1, (x+4)*10 + 1, false); //all cells start off as false. initial true cells will be user defined
				//just to test the values. will probably need to divide by a constant so that x and y coords match
				System.out.println(focusedArray[x][y].x + ", " + focusedArray[x][y].y + ", " + focusedArray[x][y].state);
			}
		}
		
		String selectedcoords = Menu.textField.getText();
		/*if(!(selectedcoords.contains("\\d+"))) {
			//int j = 3/0;
			System.out.println("triggered");
		}*/
		String[] strlist = selectedcoords.split(",");
		
		
		
		for(int x = 0; x < 75; x++) {
			for(int y = 0; y < 80; y++) {
				
				System.out.println(focusedArray[x][y].x + ", " + focusedArray[x][y].y + ", " + focusedArray[x][y].state);
			}
		}
		
		
		for(String element: strlist) {
			System.out.println(element);
		}
		
		
		
		int[] coordslist = new int[strlist.length];
		
		for(int x = 0; x < coordslist.length; x++) {
			coordslist[x] = Integer.parseInt(strlist[x]);
		}
		
		for(int x = 0; x < coordslist.length; x=x+2) {
			focusedArray[coordslist[x]][coordslist[x+1]].state = true;
		}
		
		//focusedArray[50][60].state = true;
			
		
		/*
			
		for(int x = 1; x < 74; x++) {
			for(int y = 1; y < 79; y++) {
				
				focusedArray[x][y].lifecount = 0;
				for(int z = 0; z < 9; z++) {
					if(focusedArray[x-1][y-1].state == true)
						focusedArray[x][y].lifecount++;
					if(focusedArray[x-1][y].state == true)
						focusedArray[x][y].lifecount++;
					if(focusedArray[x-1][y+1].state == true)
						focusedArray[x][y].lifecount++;
					if(focusedArray[x][y-1].state == true)
						focusedArray[x][y].lifecount++;
					if(focusedArray[x][y+1].state == true)
						focusedArray[x][y].lifecount++;
					if(focusedArray[x+1][y-1].state == true)
						focusedArray[x][y].lifecount++;
					if(focusedArray[x+1][y].state == true)
						focusedArray[x][y].lifecount++;
					if(focusedArray[x+1][y+1].state == true)
						focusedArray[x][y].lifecount++;
				}
					
			}
		}
		
		for(int x = 1; x < 74; x++) {
			for(int y = 1; y < 79; y++) {
				
				if(focusedArray[x][y].lifecount == 2 || focusedArray[x][y].lifecount == 3) {
					focusedArray[x][y].statetwo = true;
				}
				else
					focusedArray[x][y].statetwo = false;
					
				
			}
		}
		
		for(int x = 1; x < 74; x++) {
			for(int y = 1; y < 79; y++) {
				
				focusedArray[x][y].state = focusedArray[x][y].statetwo;
			}
		}
		*/
		/*
	    for(int x = 0; x < 75; x++) {
			for(int y = 0; y < 80; y++) {
				
				focusedArray[x][y].state = focusedArray[x][y].statetwo;
			}
		}
	    
		}while(true); */
	    
	    
	}
}
