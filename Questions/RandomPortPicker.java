import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomPortPicker {
    private int k;
    private Set<Integer> blacklist;
    private Random random;

    public RandomPortPicker(int k, int[] blacklisted_ports) {
        this.k = k;
        this.blacklist = new HashSet<>();
        for (int port : blacklisted_ports) {
            blacklist.add(port); }
        this.random = new Random();
    }
    public int get() {
        int randomPort = random.nextInt(k - blacklist.size());
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (!blacklist.contains(i)) {
                if (count == randomPort) {return i;}
                count++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] blacklisted_ports = {2, 3, 5};
        RandomPortPicker picker = new RandomPortPicker(7, blacklisted_ports);

        System.out.println(picker.get()); 
        System.out.println(picker.get()); 
        System.out.println(picker.get()); 
        System.out.println(picker.get()); 
        System.out.println(picker.get()); 
    }
}
