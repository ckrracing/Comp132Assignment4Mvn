/**
 * Created by netadmin on 6/09/2015.
 */
public class Heap {

  private int[] array ;
  private int ptrToTail = 0;

  public void insert() {

    heapify();
  }

  private void heapify() {

  }

  private void heapify( int[] paramArray ) {

    this.array = paramArray;
    heapify();

  }

  public int remove() {

    heapify();
    return 0;
  }

  private void swap(int idx1 , int idx2) {
    int t = idx1;
    array[idx1] = array[idx2];
    array[idx2] = array[t];
  }

  public int[] sort() {

    int[] sorted = new int[array.length];
    return sorted;

  }

  private void resize() {

  }

  private void copy() {

  }
}
