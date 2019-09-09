public class PrintArraysValue
{
    public static void main(String[] args) {
        int[][]no = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //declaration, instantiation and initialization

        for (int i = 0; i < no.length; i++)
        {
            for (int j = 0; j < no.length; j++)
            {
                System.out.print(no[i][j]);
            }
                System.out.println();
        }
    }
}