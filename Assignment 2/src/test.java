import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        //Declare linked bags
        LinkedBag LinkedBag1 = new LinkedBag();
        LinkedBag LinkedBag2 = new LinkedBag();

        //add nodes to linked bags
        LinkedBag1.add("a");
        LinkedBag1.add("b");
        LinkedBag1.add("c");

        LinkedBag2.add("b");
        LinkedBag2.add("b");
        LinkedBag2.add("d");
        LinkedBag2.add("e");

        //Display the linked bags
        System.out.println("Linked bag1 is " + Arrays.toString(LinkedBag1.toArray()));

        System.out.println("Linked bag2 is " + Arrays.toString(LinkedBag2.toArray()));

        //creating new BagInterface
        BagInterface<String> newBag = LinkedBag1.union(LinkedBag2);

        //display the result after the union call
        System.out.println("The union of the two linked bags is " + Arrays.toString(newBag.toArray()));


    }
}
