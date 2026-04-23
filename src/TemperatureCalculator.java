import java.util.ArrayList;

public class TemperatureCalculator {
    private int [] temp = new int[30];
    private int dayIndex = 0;

    //testing
    public void setTemperatures(int temps){

        if (dayIndex >= 30){
            throw new IllegalArgumentException("All 30 days are already filled.")
        }

        temp[dayIndex] = temps;
        dayIndex++;
    }

    // Reset month data
    public void rest(){
        temp = new int[30];
        dayIndex = 0;
    }

    // Find they highest temperature.

    private int findHighest(int[] temps) {
        int max = temps[0];

        for (int i = 0; i < temps.length; i++) {
            int t = temps[i];

            //Compare values 50>40 -> 30>50
            if (t > max) {
                max = t;
            }
        }
        return max;
    }

    //Find the lowest temperature.
    public int finLowest(int[] temps){
        int min = temps[0];

        for (int i = 0; i < temps.length; i++) {
            int t = temps[i];

            //Compare values 50<40 -> 40<50
            if (t < min) {
                min = t;
            }
        }

        return min;
    }

    public double calculateAverage(int[] temps){
        int sum = 0;

        return sum;
    }

    public ArrayList<Integer> findDaysAboveAverage(int[] temps) {
        ArrayList<Integer> daysAboveAverage = new ArrayList<>();

        return  daysAboveAverage;
    }
}