import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Project1 
{
    public static void main(String[] args) throws IOException
    {
        openFile();
    }
    public static void openFile() throws FileNotFoundException
    {
        int numCases;
        int cancelClass = 0;
        File file = new File ("input.txt");
        Scanner inputFile = new Scanner(file);
        numCases = inputFile.nextInt();
        for(int i = 0; i < numCases; i++)
        {
            int N = inputFile.nextInt();
            int K = inputFile.nextInt();
            for(int j = 0; j < N; j++)
            {
                int y = inputFile.nextInt();
                if( y <= 0)
                {
                    cancelClass++;
                }
                else
                {   
                }
            }
            int classCancel = (K - cancelClass);
            if (classCancel > 0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
