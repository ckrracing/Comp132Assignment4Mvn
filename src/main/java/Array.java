import java.util.ArrayList;
import java.util.Arrays;

public class Array implements NestedArray {

  private NestedArray[] array;

  public Array(NestedArray[] array) {
    this.array = array;
  }

  public int[] flatten() {

    //holds our flattened array which will be returned
    int[] flattened = {} ;

    //holds the arrays returned from flatten();
    int[] temp;

    //loop through the array calling flatten on each element
    //append the returned int[] to flattened
    for(NestedArray el : array) {

      temp = el.flatten();

      flattened = append(temp,flattened);

    }

    return flattened;
  }


  private int[] append(int[] src , int[] target) {


    int size = src.length + target.length;
    int lastIdx = target.length;

    //resize the array to
    target = resize(target, size);

    int idx = 0;

    do {
        target[lastIdx] = src[idx];
        lastIdx++;
    } while (++idx < src.length);


    return target;
  }



  private int[] resize(int[] srcArray , int newSize) {


    int[] resized = new int[newSize];

    //if the src array has elements then copy them to the re-sized array

    if(srcArray.length > 0) {
      copy( srcArray , resized );
    }

    return resized;

  }

  private void copy(int[] src , int target[]) {

    int idx = 0;
    int size = src.length;

    do {
      target[idx] = src[idx];
    }
    while (++idx < size);

  }

  public String toString() {

    ArrayList<String> nested = new ArrayList<String>();


    for (NestedArray el : array) {
      nested.add(el.toString());
    }

    String[] na = nested.toArray(new String[0]);
    return Arrays.toString(na);
  }
}
