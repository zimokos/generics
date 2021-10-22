package ua.dp.zymokos.heorhii;

public class Generics {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.printMyList();
        System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.printMyList();
        System.out.println(list.size());

        list.set(3, "--");
        list.printMyList();
        System.out.println(list.size());

        list.remove(0);
        list.printMyList();
        System.out.println(list.size());
        list.remove(2);
        list.printMyList();
        System.out.println(list.size());
        list.remove(4);
        list.printMyList();
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        MyDictionary<String, String> strings = new MyDictionary<>();
        strings.insert("стол", "table");
        System.out.println(strings.get("стол"));
        strings.insert("стол", "new table");
        System.out.println(strings.get("стол"));
        strings.insert("стул", "chair");
        System.out.println(strings.get("стул"));
        System.out.println(strings.size());
        strings.delete("стол");
        System.out.println(strings.get("стол"));

        strings.insert("#1", "table1");
        strings.insert("#2", "table2");
        strings.insert("#3", "table3");
        strings.insert("#4", "table4");
        strings.insert("#5", "table5");
        strings.insert("#6", "table6");
        strings.insert("#7", "table7");
        strings.insert("#8", "table8");
        strings.insert("#9", "table9");
        strings.insert("#10", "table10");
        strings.insert("#11", "table11");
        strings.insert("#12", "table12");
        strings.insert("#13", "table13");
        strings.insert("#14", "table14");
        strings.insert("#15", "table15");
        strings.insert("#16", "table16");
        strings.insert("#17", "table17");
        strings.insert("#18", "table18");
        System.out.println(strings.size());
    }
}
