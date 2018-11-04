import java.util.Scanner;
/**
 * Write a description of class Board here.
 *
 * @Chanbin Park
 * @2018.10.22
 */
public class Board
{
    private String[][] board;
    private int count = 1;

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        this.board = board;
    }

    public void printBoard()
    {
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) 
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void setBoard()
    {
        System.out.println("Enter the size of the board you wanna play(Write one integer): ");
        Scanner x = new Scanner(System.in);
        int row = x.nextInt();
        int col = row;
        
        board = new String[row][col];
        
        for(int a = 0; a < row; a++)
        {
            for(int b = 0; b < col; b++)
            {
                board[a][b] = "-";
            }
        }
        
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[i].length; j++) 
                {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void changeBoardO()
    {
        System.out.println("Where do you want to put your stone?(row col): ");
        Scanner O = new Scanner(System.in); 
        int selRow = O.nextInt();
        int selCol = O.nextInt();
        //check if the user chosen spot is -
        while(true)
        {
            if(board[selRow - 1][selCol - 1] == "-" && (selRow == 5 || board[selRow][selCol - 1] == "O" || board[selRow][selCol - 1] == "X"))
            {
                board[selRow - 1][selCol - 1] = "O";
                break;
            }
                
            else
            {
                System.out.println("You can't put it there, choose another spot: ");
                changeBoardO();
                break;
            }
        } 
        printBoard();
    }
    
    public void changeBoardX()
    {
        System.out.println("Where do you want to put your stone?(row col): ");
        Scanner X = new Scanner(System.in); 
        int selRow = X.nextInt();
        int selCol = X.nextInt();
        //check if the user chosen spot is -
        while(true)
        {
            if(board[selRow - 1][selCol - 1] == "-" && (selRow == 5 || board[selRow][selCol - 1] == "O" || board[selRow][selCol - 1] == "X"))
            {
                board[selRow - 1][selCol - 1] = "X";
                break;
            }
                
            else
            {
                System.out.println("You can't put it there, choose another spot: ");
                changeBoardX(); // prints the board as much as the user picked the unempty spot.
                break;
            }
        }
        printBoard();
    }
    
    public String checkFourHor()
    {
        String result = "";
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j <= board[i].length - 4; j++)
            {
                if(board[i][j] == board[i][j+1] && board[i][j+1] == board[i][j+2] && board[i][j+2] == board[i][j+3] && board[i][j] != "-")
                {
                    result = "end";
                    return result;
                }
            }
        }
        return "";
    }
    
    public String checkFourVer()
    {
        String result = "";
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j <= board[i].length - 4; j++)
            {
                if(board[j][i] == board[j + 1][i] && board[j + 1][i] == board[j + 2][i] && board[j + 2][i] == board[j + 3][i] && board[j][i] != "-")
                {
                    result = "end";
                    return result;
                }
            }
        }
        return "";
    }
    
    public String checkFourDia1()
    {
        String result = "";
        for(int i = board.length - 4; i >= 0 ; i--)
        {
            for(int j = board[i].length - 4; j >= 0; j--)
            {
                if(board[i][j] != "-" && board[i][j] == board[i+1][j+1] && board[i+1][j+1] == board[i+2][j+2] && board[i+2][j+2] == board[i+3][j+3])
                {
                    result = "end";
                    return result;
                }
            }
        }
        return "";
    }
    
    public String checkFourDia2()
    {
        String result = "";
        for(int i = 0; i <= board.length - 4; i++)
        {
            for(int j = board[i].length - 1; j >= board[i].length - 2; j--)
            {
                if(board[i][j] != "-" && board[i][j] == board[i+1][j-1] && board[i+1][j-1] == board[i+2][j-2] && board[i+2][j-2] == board[i+3][j-3])
                {
                    result = "end";
                    return result;
                }
            }
        }
        return "";
    }
}
