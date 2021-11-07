package CauHoiPhongVan.ArrayListJava;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void Hienthi(ArrayList<Cat> catArrayList) {
        for (int i = 0; i < catArrayList.size(); i++) {
            System.out.print(catArrayList.get(i).getName() + " ");
            System.out.print(catArrayList.get(i).getColor() + " ");
            System.out.print(catArrayList.get(i).getAge());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        catArrayList.add(new Cat("A", "red", 1));
        catArrayList.add(new Cat("B", "yellow", 2));
        catArrayList.add(new Cat("C", "black", 3));

        //  Hienthi(catArrayList);

        //  catArrayList.remove(1);
//        catArrayList.remove(catArrayList.get(0));
//        Hienthi(catArrayList);


        // convert ArrayList to Array
        Cat []cat = new Cat[catArrayList.size()];
        cat = catArrayList.toArray(cat);
//
//        for(int i = 0; i < cat.length; i++){
//            System.out.println(Arrays.toString(cat));
//        }

        // convert array to arraylist
        Integer []a =  {1, 3, 4,2, 5, 6, 7};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(a));

        // xáo trộn ArrayList
        List<Integer> solution = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            solution.add(i);
        }
        Collections.shuffle(solution);
        System.out.println(solution);
    }
}
