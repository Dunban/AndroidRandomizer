package doubled.greenrivertech.net.androidrandomizer;

import java.util.Random;

/**
 * Created by sevenson2 on 4/12/2016.
 */
public class RandomModal
{
    private int leftarrow;
    private int rightarrow;
    public static final int countdown = 5;

    public RandomModal()
    {
        generate();
    }

    public void generate()
    {
        Random rand = new Random();
        leftarrow = rand.nextInt(50) + 1;
        rightarrow = rand.nextInt(50) + 1;
    }

    public int getLeftarrow()
    {
        return leftarrow;
    }

    public int getRightarrow()
    {
        return rightarrow;
    }
}
