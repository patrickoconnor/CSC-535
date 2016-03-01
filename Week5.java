import java.util.Scanner;

public class Week5
// Collection of methods used to create the game board, red and black player patterns, winner check, and print to screen.
{
	public static void main (String[] args)
		{
			//Call the method to create the Connect Four game board using columns and rows.
			String[][] game = Gameboard();
			//Loop used to check for game winner.
			boolean loop = true;
			//Print the game board and alternate between red and black player.
			int count = 0;
			PrintGameboard(game);
			while(loop)
				{
					//Red goes first
					if (count % 2 == 0) DropRedPiece(game);
						//Black goes after.
						else DropBlackPiece(game);
						
					count++;
					PrintGameboard(game);
					//Check for a winner and announce it and end the game.
					if (WinnerCheck(game) != null)
						{
							if (WinnerCheck(game) == "R")
								System.out.println("The red player won.");
									else if (WinnerCheck(game)== "B")
										System.out.println("The black player won.");
											loop = false;
						}
				}
		}
	
	//Method used to create the game board layout.
	static String[][] Gameboard()
		{
		//Create the game board, need four rows and six columns for the pieces, and seven columns and one row for the pipes and lines.
			String[][] gb = new String[7][15];
			//Time to loop over each row from up to down
			for (int i =0;i<gb.length;i++)
			{
				//Create the columns and rows of the gmae board.
				for (int j =0;j<gb[i].length;j++)
					{
						if (j% 2 == 0) gb[i][j] ="|";
							else gb[i][j] = " ";
								if (i==6) gb[i][j]= "-";
					}
			}
			return gb;
		}

	//Method used to visually display the game board as it is being played.
    static void PrintGameboard(String[][] gb)
    	{
    		for (int i =0;i<gb.length;i++)
    			{
    				for (int j=0;j<gb[i].length;j++)
    					{
    						System.out.print(gb[i][j]);
    					}
    				System.out.println();
    			}
    	}

    //Method used to drop the red pieces on the game board.
    static void DropRedPiece(String[][] rp)
    	{
    		//Input from player red on which column to drop the red piece.
    		System.out.println("Drop a red piece at column (0–6): ");
    		Scanner scan = new Scanner (System.in);
    		int c = 2*scan.nextInt()+1;
    		for (int i =5;i>=0;i--)
    			{
    				if (rp[i][c] == " ")
    					{
    						rp[i][c] = "R";
    						break;
    					}
        
    			}
    	}
    
    //Method used to drop the black pieces on the board.
    static void DropBlackPiece(String[][] bp)
    	{
    	//Input from player red on which column to drop the red piece.
    		System.out.println("Drop a black piece at column (0–6): ");
    		Scanner scan = new Scanner (System.in);
    		int c = 2*scan.nextInt()+1;
    		for (int i =5;i>=0;i--)
    			{
    				if (bp[i][c] == " ")
    					{
    						bp[i][c] = "B";
    						break;
    					}
        
    			}
    	}

    //Method used to check for a winner. A winner is determined if either player has four pieces connected either vertically, horizontally, or diagonally.
    static String WinnerCheck(String[][] w)
    	{
    	//Check for winner horizontally.
    		for (int i =0;i<6;i++)
    			{
    				for (int j=0;j<7;j+=2)
    					{
    						if ((w[i][j+1] != " ") && (w[i][j+3] != " ") && (w[i][j+5] != " ") && (w[i][j+7] != " ") && ((w[i][j+1] == w[i][j+3]) && (w[i][j+3] == w[i][j+5]) && (w[i][j+5] == w[i][j+7])))
    						return w[i][j+1];  
    					}
    			}
  
    		//Check for a winner vertically.
    		for (int i=1;i<15;i+=2)
    			{
    				for (int j =0;j<3;j++)
    					{
    						if((w[j][i] != " ") && (w[j+1][i] != " ") && (w[j+2][i] != " ") && (w[j+3][i] != " ") && ((w[j][i] == w[j+1][i]) && (w[j+1][i] == w[j+2][i]) && (w[j+2][i] == w[j+3][i])))
    						return w[j][i];  
    					}  
    			}
  
    		//Check for a winner left to right diagonally.
    		for (int i=0;i<3;i++)
    			{
    				for (int j=1;j<9;j+=2)
    					{
    						if((w[i][j] != " ") && (w[i+1][j+2] != " ") && (w[i+2][j+4] != " ") && (w[i+3][j+6] != " ") && ((w[i][j] == w[i+1][j+2]) && (w[i+1][j+2] == w[i+2][j+4]) && (w[i+2][j+4] == w[i+3][j+6])))
    						return w[i][j];  
    					}  
    			}
  
    		//Check for a winner right to left diagonally.
    		for (int i=0;i<3;i++)
    			{
    				for (int j=7;j<15;j+=2)
    					{
    						if((w[i][j] != " ") && (w[i+1][j-2] != " ") && (w[i+2][j-4] != " ") && (w[i+3][j-6] != " ") && ((w[i][j] == w[i+1][j-2]) && (w[i+1][j-2] == w[i+2][j-4]) && (w[i+2][j-4] == w[i+3][j-6])))
    						return w[i][j];  
    					}  
    			}
    		//Still no winner, keep going.
    		return null;
    	}

}