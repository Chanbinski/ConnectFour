
/**
 * Write a description of class BoardTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoardTester
{
    public static void main(String [] args)
    {
        System.out.println("This is my first project, Connect Four!");
        System.out.println("");
        System.out.println("This is your game board. Connect the Four horizontally, vertically, or even diagonally. Good Luck!");
        System.out.println("");
        Board board = new Board();
        board.setBoard();
        System.out.println("");
        
        System.out.println("First player has 'O' stones.");
        System.out.println("");
        board.changeBoardO();
        System.out.println("");
        
        System.out.println("Second player has 'X' stones.");
        System.out.println("");
        board.changeBoardX();
        System.out.println("");
        
        int count = 3;
        while(true)
        {
            if(count % 2 != 0)
            {
                System.out.println("Move " + count);
                board.changeBoardO();
                count++;
                if(board.checkFourHor() == "end" || board.checkFourVer() == "end" || board.checkFourDia1() == "end" || board.checkFourDia2() == "end" )
                {
                    System.out.println("==================================================");
                    System.out.println("Congratulations! Game ends, and O wins!");
                    System.out.println("==================================================");
                    break;
                }
            }            
            else if(count % 2 == 0)
            {
                System.out.println("Move " + count);
                board.changeBoardX();
                count++;
                if(board.checkFourHor() == "end" || board.checkFourVer() == "end" || board.checkFourDia1() == "end" || board.checkFourDia2() == "end")
                {
                    System.out.println("==================================================");
                    System.out.println("Congratulations! Game ends, and X wins!");
                    System.out.println("==================================================");
                    break;
                }                
            }
        }
    }
}
