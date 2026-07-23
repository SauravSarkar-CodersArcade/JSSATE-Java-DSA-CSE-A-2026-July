package greedy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Activity {
    int start, finish;
    public Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}
public class ActivitySelectionProblem {
    static class ActivityComparator implements Comparator<Activity>{
        @Override
        public int compare(Activity a1, Activity a2){
            return a1.finish - a2.finish; // Ascending Order
        }
    }
    public static void findMaxActivities(List<Activity> activities){
        // Step 1: Sort the activities according to finish time
        activities.sort(new ActivityComparator());
        // Step 2: Always select the first activity which finishes earliest
        int lastSelected = 0;
        // (1,4)(5,7)(8,9)
        System.out.print("(" + activities.get(lastSelected).start + "," +
                activities.get(lastSelected).finish + ")");
        for (int i=1; i<activities.size(); i++){
            if(activities.get(i).start >= activities.get(lastSelected).finish){
                System.out.print("(" + activities.get(i).start + "," +
                        activities.get(i).finish + ")");
                lastSelected = i;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Activity> activities = Arrays.
                asList(new Activity(5, 7),
                        new Activity(8, 9),
                        new Activity(1, 4),
                        new Activity(5, 9),
                        new Activity(0, 6),
                        new Activity(3, 5));
        findMaxActivities(activities);
    }
}
