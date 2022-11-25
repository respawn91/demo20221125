public class Finder {

    public int findMaximumElement(int[] input) {
        
        // Please help!!! 
        int maxElement = ??;

      for (int i = 0; i < input.length; i++) {
            if (maxElement < input[i]) {
                maxElement = input[i];
            }
        }

        return maxElement;
    }

}
