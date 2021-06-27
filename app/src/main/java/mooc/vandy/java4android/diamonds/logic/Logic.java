package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;


public class Logic
       implements LogicInterface {

    public static final String TAG = Logic.class.getName();

    private OutputInterface mOut;

    public Logic(OutputInterface out){
        mOut = out;
    }

    public void process(int size) {

        mOut.print("+");
        for(int i=0;i<2*size;i++){
            mOut.print("-");
        }
        mOut.println("+");
        for(int i=1;i<size;i++){
            mOut.print("|");
            for(int j=0;j<size-i;j++){
                mOut.print(" ");
            }
            mOut.print("/");
            for (int j=0;j<2*i-2;j++){
                if(i%2==0){
                    mOut.print("-");
                }
                else{
                    mOut.print("=");
                }
            }
            mOut.print("\\");
            for(int j=0;j<size-i;j++){
                mOut.print(" ");
            }
            mOut.println("|");
        }
        mOut.print("|<");
        for(int i=0;i<2*size-2;i++){
            if(size%2==0){
                mOut.print("-");
            }
            else{
                mOut.print("=");
            }
        }
        mOut.print(">|\n");

        for(int i=size-1;i>0;i--){
            mOut.print("|");
            for(int j=0;j<size-i;j++){
                mOut.print(" ");
            }
            mOut.print("\\");
            for (int j=0;j<2*i-2;j++){
                if(i%2==0){
                    mOut.print("-");
                }
                else{
                    mOut.print("=");
                }
            }
            mOut.print("/");
            for(int j=0;j<size-i;j++){
                mOut.print(" ");
            }
            mOut.println("|");
        }
        mOut.print("+");
        for(int i=0;i<2*size;i++){
            mOut.print("-");
        }
        mOut.print("+");
    }
}

/*
-+--------+-
|    /\    |
|   /--\   |
|  /====\  |
| /======\ |
|<========>|
| \------/ |
|  \----/  |
|   \==/   |
|    \/    |
-+--------+-
SIZE:  5

-+----------+-
|     /\     |
|    /==\    |
|   /====\   |
|  /------\  |
| /--------\ |
|<---------->|
| \========/ |
|  \======/  |
|   \----/   |
|    \--/    |
|     \/     |
-+----------+-
SIZE:  6

*/