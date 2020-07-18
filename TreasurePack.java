public class TreasurePack {
    //private static final int[] itemValue = { 60, 50, 20, 15, 10, 25, 5, 100, 200 };
    //private static final int[] itemVolume = { 15, 37, 60, 100, 5, 40, 100, 1, 3 };

    public static void greedy(int backpackVolume) {
        int[] itemValueSorted = { 200, 100, 60, 50, 25, 20, 15, 10, 5 };
        int[] itemVolumeSorted = { 3, 1, 15, 37, 40, 60, 100, 5, 100 };
        int[] result = new int[itemVolumeSorted.length];
        int backPackValue = 0;

        int i = 0;
        while (backpackVolume > 0 && i < itemVolumeSorted.length) {
            while (backpackVolume > 0 && itemVolumeSorted[i] > 0) {
                itemVolumeSorted[i]--;
                backpackVolume--;
                backPackValue = backPackValue + itemValueSorted[i];
                result[i]++;
            }
            i++;         
        }
        System.out.println("");
        System.out.println("Maximum : " + backPackValue);
        System.out.print("with: ");
        
        String out = "";
        int j = 0;
        while (j < result.length && result[j] > 0) {
            out = out + (result[j] + "*" + itemValueSorted[j] + " " + "+" + " ");
            j++;
        }
        System.out.print(out.substring(0, out.length()-2));
        System.out.println("");
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Simulation start...");
        greedy(1);
        greedy(87);
        greedy(1000);
        System.out.println("");
        System.out.println("Simulation end");
    }
}