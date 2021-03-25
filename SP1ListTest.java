import java.util.Arrays;

public class SP1ListTest {
  public static void main(String[] args) {
     SP1List list1 = new SP1List(10);
     System.out.println("Expect 0: " + list1.size());
     list1.add("a");
     System.out.println("Expect 1: " + list1.size());
     System.out.println("Expect a: " + list1.get(0));
     System.out.println("Expect null: " + list1.get(1));
     System.out.println("Expect null: " + list1.get(-1));
     list1.add("b");
     System.out.println("Expect 2: " + list1.size());
     System.out.println("Expect a: " + list1.get(0));
     System.out.println("Expect b: " + list1.get(1));
     System.out.println("Expect a, b: " + list1);
     list1.set("c", 1);
     System.out.println("Expect 2: " + list1.size());
     System.out.println("Expect a: " + list1.get(0));
     System.out.println("Expect c: " + list1.get(1));
     System.out.println("Expect a, c: " + list1);
     System.out.println("Expect true: " + list1.contains("c"));
     list1.insert("d", 1);
     System.out.println("Expect 3: " + list1.size());
     System.out.println("Expect a, d, c: " + list1);
     String e = (String)list1.remove(0);
     System.out.println("Expect 2: " + list1.size());
     System.out.println("Expect d, c: " + list1);
     System.out.println("Expect a: " + e);
     Object[] a = list1.toArray();
     System.out.println("Expect 2: " + a.length);
     System.out.println("Expect [d, c]: " + Arrays.toString(a));
     a[0] = "e";
     System.out.println("Expect d, c: " + list1);
     SP1List list2 = new SP1List(a);
     System.out.println("Expect 2: " + list2.size());
     System.out.println("Expect e, c: " + list2);
  }
}