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
}
