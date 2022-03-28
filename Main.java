public class Main {
    public static void main(String[] args) {
        SortedIntegerList l = new SortedIntegerList(false);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(0);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(-5);

        l.add(3);

        l.remove(3);

        SortedIntegerList nl = new SortedIntegerList(l);

        nl.remove(1);

        SortedIntegerList a = new SortedIntegerList(false);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);

        a.add(0);
        a.add(5);
        a.add(5);
        a.add(5);
        a.add(-5);
        a.remove(1);
        a.add(88);
        System.out.println(a);

        System.out.println(a.splitList());
        System.out.println(a);
    }
}

