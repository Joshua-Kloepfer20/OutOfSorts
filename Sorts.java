public class Sorts {
  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length - 1; j++) {
        if (data[j] > data[j + 1]) {
          int x = data[j+1];
          data[j+1] = data[j];
          data[j] = x;
        }
      }
    }
  }
  public static void insertionSort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      int current = data[i];
      int j;
      for (j = i - 1; j >= 0 && data[j] > current; j--) {
        data[j+1] = data[j];
      }
      data[j + 1] = current;
    }
  }
  
}
