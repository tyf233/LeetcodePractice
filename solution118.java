import java.util.ArrayList;
import java.util.List;

public class solution118 
{
    public static List<List<Integer>> generate(int numRows) 
    {   
        
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> e = new ArrayList<Integer>();
        e.add(1);
        List<List<Integer>> d = new ArrayList<List<Integer>>();
        if (numRows == 0) return d;
        d.add(e);
        if (numRows == 1) {return d;}
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(1);
        d.add(x);
        if (numRows == 2) {return d;}

        
        //List<List<Integer>> c = generate(numRows - 1);
        
        // for (int i = 0; i < numRows - 1; i++)
        // {
        //     a.add(generate(numRows - 1).get(i));
        // }
        b.add(1);
        for (int i = 1; i < numRows - 1; i++)
        {
            a = generate(numRows - 1); 
            b.add(a.get(numRows - 2).get(i-1) + a.get(numRows - 2).get(i));
        }
        b.add(1);
        a.add(b);

        return a;
    }

    public static List<List<Integer>> generate2 (int numRows)
    {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // First base case; if user requests zero rows, they get zero rows.
        if (numRows == 0) {
            return triangle;
        }

        // Second base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) 
    {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        List<Integer> b = new ArrayList<Integer>();
        b.add(1);
        a.add(b);
        System.out.println(generate(10));
    }
}
