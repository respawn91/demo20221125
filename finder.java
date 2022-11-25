public class Finder {

    public int findMaximumElement(int[] array) {
        
        // Please help!!! 
        // Ready!!!
        // I am big boss here!!!!
        int maxElement = array[0];

      for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }

}
