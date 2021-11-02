package T3H.Buoi3;

public class Main {
    public static void main(String[] args) {
      int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 9};
      int a = 15;
      boolean check = false;
      for(int i =0; i < arr.length; i++)
      {
          if(arr[i] == a){
              check = true;
              System.out.println("vị trí của " + a + " trong mảng là: " + i);
              break;
          }
      }
      if(check == false){
          System.out.println(a + " không tồn tại trong mảng");
      }
      for(int i = arr.length -1 ; i >= 0; i--){
          System.out.print(arr[i] + " ");
      }
    }
}
