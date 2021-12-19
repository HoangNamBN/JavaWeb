package CauHoiPhongVan.ArrayListJava;

import java.util.*;

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

//        ArrayList<Cat> catArrayList = new ArrayList<>();
//
//        catArrayList.add(new Cat("A", "red", 1));
//        catArrayList.add(new Cat("B", "yellow", 2));
//        catArrayList.add(new Cat("C", "black", 3));

        ArrayList<String> integerArrayList = new ArrayList<>();
        integerArrayList.add("1");
        integerArrayList.add("2");
        integerArrayList.add(1, "3");

//        integerArrayList.remove(2);
//        integerArrayList.remove("1");

        for (String a: integerArrayList) {
            System.out.println(a);
        }

        String [] convertArrayList = new String[integerArrayList.size()];
        convertArrayList = integerArrayList.toArray(convertArrayList);

        for(int i = 0; i < convertArrayList.length; i++){
            System.out.println(convertArrayList[i]);
        }

        // convert từ 1 array -> arraylist
        ArrayList<String> mangsaukhiconvert= new ArrayList<>(Arrays.asList(convertArrayList));
        for (String a: mangsaukhiconvert) {
            System.out.println(a);
        }


//        Hienthi(catArrayList);
//
//        catArrayList.remove(1);
//        catArrayList.remove(catArrayList.get(0));
//        Hienthi(catArrayList);
//
//
//        // convert ArrayList to Array
//        Cat[] cat = new Cat[catArrayList.size()];
//        cat = catArrayList.toArray(cat);
//
//        for(int i = 0; i < cat.length; i++){
//            System.out.println(Arrays.toString(cat));
//        }
//
//        // convert array to arraylist
//        Integer[] a = {1, 3, 4, 2, 5, 6, 7};
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(a));
//
//        // xáo trộn ArrayList
        List<Integer> solution = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            solution.add(i);
        }
        System.out.println(solution);


        Collections.shuffle(solution);
        System.out.println(solution);
    }
}
