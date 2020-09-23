import java.util.ArrayList;
import java.util.List;

public class solution119 
{
    public static List<Integer> getRow(int rowIndex)
    {
        return getRow1(rowIndex + 1);
    }

    public static List<Integer> getRow1(int rowIndex) 
    {
        List<Integer> triangle = new ArrayList<Integer>();

        // First base case; if user requests zero rows, they get zero rows.
        if (rowIndex == 0) 
        {
            return triangle;
        }

        if (rowIndex == 1)
        {
            triangle.add(1);
            return triangle;
        }
        // Second base case; first row is always [1].
        List<Integer> row = new ArrayList<>(); 

        List<Integer> prevRow = getRow1(rowIndex - 1);

            // The first row element is always 1.
        row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
        for (int j = 1; j < rowIndex - 1; j++) 
        {
            row.add(prevRow.get(j-1) + prevRow.get(j));
        }

            // The last row element is always 1.
        row.add(1);
        

        return row;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(getRow(5));
    }
}
