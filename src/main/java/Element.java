public class Element implements NestedArray {

  private int element;

  public Element(int element) {
    this.element = element;
  }

  public int[] flatten() {
    return new int[]{element};
  }

  int valueOf(){
    return element;
  }


  public String toString() {
    return String.valueOf(element);
  }
}
