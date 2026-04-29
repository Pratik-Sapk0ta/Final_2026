import java.util.ArrayList;

public class TemperatureCalculator {
    private int [] temp = new int[30];
    private int dayIndex = 0;

    //testing
    public void setTemperatures(int[]){

        if (dayIndex >= 30){
            throw new IllegalArgumentException("All 30 days are already filled.");
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

        validate()

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
    public int findLowest(int[] temps){

        validate()

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

    //Calculate average
    public double calculateAverage(int[] temps){

        validate();

        int sum = 0;

        for (int i = 0; i < temp.length; i ++) {
            sum +=temps[i];
        }

        return sum;
    }

    public ArrayList<Integer> findDaysAboveAverage(int[] temps) {

        validate()

        ArrayList<Integer> daysAboveAverage = new ArrayList<>();
        double avg = calculateAverage();

        for (int i = 0; i < temp.length; i++){
            if (temp[i] > avg) {
                daysAboveAverage.add(i + 1);
            }
        }

        return  daysAboveAverage;
    }

    private void validate(){
        if (dayIndex < 30){
            throw new IllegalArgumentException("Please enter all 30 tempertures first.");
        }
    }
}