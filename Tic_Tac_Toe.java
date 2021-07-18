import java.util.*;
class Tic_Tac_Toe
{
    Scanner sc=new Scanner(System.in);
    String board[][]=new String[3][3];
    int cnt=0,a,cntx=0,cnto=0,i=0,r,c;
    void start()
    {
        int k=1;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]=Integer.toString(k);
                k++;
            }
        }
    }
    void board()
    {
        for(int i =0 ; i <board.length;i++)
        {
            for(int j =0 ; j <board.length;j++)
            {
                if(j!=2)
                {
                    System.out.print("  "+board[i][j]+"  |");
                }
                else
                {
                    System.out.print("  "+board[i][j]+"  ");
                }
            }
            System.out.println("");        
            if(i!=2)
            {
                System.out.println("-----------------");
            }
        }
    }
    void clear()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]=" ";                
            }
        }
    }
    void design()
    {
        if(a==1)
        {
            r=1;
            c=1;
        }
        else if(a==2)
        {
            r=1;
            c=2;
        }
        else if(a==3)
        {
            r=1;
            c=3;
        }
        else if(a==4)
        {
            r=2;
            c=1;
        }
        else if(a==5)
        {
            r=2;
            c=2;
        }
        else if(a==6)
        {
            r=2;
            c=3;
        }
        else if(a==7)
        {
            r=3;
            c=1;
        }
        else if(a==8)
        {
            r=3;
            c=2;
        }
        else if(a==9)
        {
            r=3;
            c=3;
        }
        else
        {
            System.out.println("Invalid position");
            if(i%2!=0)
            {
                System.out.println("Enter the position of X");
                try_catch();
                design();
            }
            else
            {
                System.out.println("Enter the position of O");
                try_catch();
                design();
            }
        }
    }
    void check()
    {
        boolean b=false;
        while(!b)
        {
            if(r<=3&&c<=3)
            {
                if(board[r-1][c-1]!="X" && board[r-1][c-1]!="O")
                b=true;
                else
                {
                    System.out.println("Position filled");
                    if(i%2!=0)
                    {
                        System.out.println("Enter the position of X");
                        try_catch();
                        design();
                    }
                    else
                    {
                        System.out.println("Enter the position of O");
                        try_catch();
                        design();
                    }
                }
            }
            else
            {
                System.out.println("Invalid position");
                if(i%2!=0)
                {
                    System.out.println("Enter the position of X");
                    try_catch();
                    design();
                }
                else
                {
                    System.out.println("Enter the position of O");
                    try_catch();
                    design();
                }
            }
        }
    }
    void try_catch()
    {
        boolean t=true;
        do
        {
            Scanner sc = new Scanner(System.in);
            try
            {
                a= sc.nextInt();
                t=false;
            }
            catch(Exception e)
            {
                System.out.println("Enter only Positive Integer values...");
                t=true;
            }
            sc.close();
        }
        while(t);
    }
    void end()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]=="X" || board[i][j]=="O")
                cnt++;
            }
        }
    }
    void victory()
    {
        if(board[0][0]=="X"&&board[1][1]=="X"&&board[2][2]=="X")
        cntx++;
        else if(board[0][2]=="X"&&board[1][1]=="X"&&board[2][0]=="X")
        cntx++;
        else if(board[0][0]=="X"&&board[0][1]=="X"&&board[0][2]=="X")
        cntx++;
        else if(board[1][0]=="X"&&board[1][1]=="X"&&board[1][2]=="X")
        cntx++;
        else if(board[2][0]=="X"&&board[2][1]=="X"&&board[2][2]=="X")
        cntx++;
        else if(board[0][0]=="X"&&board[1][0]=="X"&&board[2][0]=="X")
        cntx++;
        else if(board[0][1]=="X"&&board[1][1]=="X"&&board[2][1]=="X")
        cntx++;
        else if(board[0][2]=="X"&&board[1][2]=="X"&&board[2][2]=="X")
        cntx++;
        if(board[0][0]=="O"&&board[1][1]=="O"&&board[2][2]=="O")
        cnto++;
        else if(board[0][2]=="O"&&board[1][1]=="O"&&board[2][0]=="O")
        cnto++;
        else if(board[0][0]=="O"&&board[0][1]=="O"&&board[0][2]=="O")
        cnto++;
        else if(board[1][0]=="O"&&board[1][1]=="O"&&board[1][2]=="O")
        cnto++;
        else if(board[2][0]=="O"&&board[2][1]=="O"&&board[2][2]=="O")
        cnto++;
        else if(board[0][0]=="O"&&board[1][0]=="O"&&board[2][0]=="O")
        cnto++;
        else if(board[0][1]=="O"&&board[1][1]=="O"&&board[2][1]=="O")
        cnto++;
        else if(board[0][2]=="O"&&board[1][2]=="O"&&board[2][2]=="O")
        cnto++;
    }
    void contd()
    {
        System.out.println("Press c to continue playing and press any other letter to exit.");
        char ch=sc.next().charAt(0);
        if(ch=='C'||ch=='c')
        {
            System.out.print("\f");
            clear();
            cntx=0;
            cnto=0;
            play();
        }
        else
        System.out.println("Thank you. Visit again.");
    }
    public void play()
    {
        System.out.println("Welcome to the game.");
        System.out.println("Player 1  :  X");
        System.out.println("Player 2  :  O");
        System.out.println("Press s to start");
        start();
        //clear();
        char ch=sc.next().charAt(0);
        if(ch=='S'||ch=='s')
        {
            for(i=1;;i++)
            {
                board();
                if(i%2!=0)
                {
                    System.out.println("Enter the position of X");
                    try_catch();
                    design();
                    check();
                    board[r-1][c-1]="X";
                }
                else
                {
                    System.out.println("Enter the position of O");
                    try_catch();
                    design();
                    check();
                    board[r-1][c-1]="O";
                }
                end();                
                victory();
                if(cntx>=1)
                {
                    System.out.print("\f");
                    board();
                    System.out.println("Player 1 won");
                    break;
                }
                else if(cnto>=1)
                {
                    System.out.print("\f");
                    board();
                    System.out.println("Player 2 won");
                    break;
                }
                else if(cnt==9)
                {
                    System.out.print("\f");
                    board();
                    System.out.println("Draw");
                    break;
                }
                else
                cnt=0;
            }
            contd();
        }
        else
        {
            System.out.println("Thank you. Visit again.");
        }
    }    
    public static void main(String[] args)
    {
        Tic_Tac_Toe obj=new Tic_Tac_Toe();
        obj.play();
    }
}