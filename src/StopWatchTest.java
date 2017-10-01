import static org.junit.Assert.*;

/**
 * Create by hieuduong on 9/30/17
 */
public class StopWatchTest {
    @org.junit.Test
    public void getElapsedTime()  {


        StopWatch watch1 = new StopWatch();
        int row = 100000;
        int[] array = new int[row];
        for(int i=0; i<row; i++){
            array[i] = watch1.RandomNumber(1,1000);
            //System.out.println(array[i]);
        }

        array = watch1.SortArray(array);

        double time1 = watch1.getElapsedTime();
        System.out.printf("%.2f seconds\n",time1);

    }

}