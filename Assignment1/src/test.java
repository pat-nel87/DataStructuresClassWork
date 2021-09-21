public class test {

    public static void main(String[] args) {

        ResizableArrayBag<String> bag1 = new ResizableArrayBag<>();
        ResizableArrayBag<String> bag2 = new ResizableArrayBag<>();

        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");

        //bag2.printContents();

        BagInterface<String> everything = bag1.union(bag2);
      //  System.out.println(everything.contains("b"));

        ResizableArrayBag<String> everything2 = bag1.union(bag2);
      //  System.out.println(everything2.getFrequencyOf("b"));
        everything2.printContents();
    }
}
