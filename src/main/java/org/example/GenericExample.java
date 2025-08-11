package org.example;

class Box<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }

}
public class GenericExample {
  public static void main (String[] args) {
      Box<String> stringBox=new Box<>();
      stringBox.setValue("Brooo");
      System.out.println(stringBox.getValue());

      Box<Integer> intBox=new Box<>();
      intBox.setValue(1234567890);
      System.out.println(intBox.getValue());
  }
}
