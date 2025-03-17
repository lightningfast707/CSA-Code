package CSA.UnitSix;
import java.util.Arrays;

public class LVader {
    private int [] stops;

    public LVader(int f)
    {
        stops = new int[f];
    }
    public boolean incNumStops(int p)
    {
        if (inRange(p))
        {
            stops[p]++;
            return true;
        }
        return false;

    }
    public boolean inRange(int q)
    {
        if (q < stops.length)
        {
            return true;
        }
        return false;
    }
    public int numStops(int r)
    {   if (r > stops.length)
        {
            return -1;
        }
        return stops[r];
    }
    public int floorWithMostStops()
    {
        int max = stops[0];
        for (int i = 1; i < stops.length; i++)
        {
            if (stops[i] > max)
            {
                max = i;
            }
        }
        return max;
    }
    public String toString()
    {
        return Arrays.toString(stops);
    }

}
