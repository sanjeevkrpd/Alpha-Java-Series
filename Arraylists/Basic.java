package Arraylists;

import java.util.ArrayList;;

public class Basic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        list.add(0,0);
        System.out.println(list.get(2));

        System.out.println(list.contains(5));
    }

}
