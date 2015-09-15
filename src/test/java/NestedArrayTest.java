import java.util.Arrays;
import static org.junit.Assert.assertTrue;
import org.junit.Test;





public class NestedArrayTest {

  public NestedArray[] buildSimpleArray(int size) {

    if (size <= 0) {
      size = 10; //default is ten elements
    }

    NestedArray[] na = new NestedArray[size];
    int idx = 0;

    do {
      na[idx] = new Element(idx);
    } while (++idx < 10);


    return na;
  }

  @Test public void testSimpleArrayBuilderElementsEqualsCorrectSize() {

    int initialCapacity = 10;

    NestedArray[] simpleArray = buildSimpleArray(initialCapacity);
    int size = simpleArray.length;

    assertTrue(size == initialCapacity);

  }

  @Test public void testElementToString() {
    Element el = new Element(8);
    assertTrue("8".equals(el.toString()));
  }

  @Test public void testArrayToStringSimple() {

    NestedArray nestedArray = new Array(new NestedArray[] {new Element(0),
        new Array(new NestedArray[] {new Element(1), new Element(2)}), new Element(3)});

    String control = "[0, [1, 2], 3]";
    String nestedArrayToString = nestedArray.toString();

    System.out.println(nestedArrayToString);

    assertTrue(control.equals(nestedArrayToString));

  }

  @Test public void testArrayToStringComplex() {

    NestedArray nestedArray = new Array(new NestedArray[] {new Element(0), new Array(
        new NestedArray[] {new Array(new NestedArray[] {new Element(5), new Element(6)}),
            new Element(1), new Element(2)}), new Element(3)});

    System.out.println(nestedArray.toString());
    assertTrue("[0, [[5, 6], 1, 2], 3]".equals(nestedArray.toString()));
  }

  @Test public void testArrayFlattenSimple() {

    int capacity = 10;

    NestedArray[] control = new NestedArray[capacity];

    control[0] = new Element(0);
    control[1] = new Element(1);
    control[2] = new Element(2);
    control[3] = new Element(3);
    control[4] = new Element(4);
    control[5] = new Element(5);
    control[6] = new Element(6);
    control[7] = new Element(7);
    control[8] = new Element(8);
    control[9] = new Element(9);

    Array array = new Array(control);
    assertTrue(Arrays.equals(array.flatten(), new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
  }

  @Test public void testArrayFlattenComplex() {

    NestedArray nestedArray = new Array(new NestedArray[] {new Element(0),
        new Array(new NestedArray[] { new Element(1), new Element(2) } ), new Element(3) } );

    assertTrue(Arrays.equals(nestedArray.flatten(), new int[] {0, 1, 2, 3}));


  }
}
