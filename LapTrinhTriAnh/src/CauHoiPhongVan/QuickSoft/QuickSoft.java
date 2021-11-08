package CauHoiPhongVan.QuickSoft;

// ý tưởng của thuật toán sắp xếp
//- nếu mảng chỉ có 1 phần tử hoặc rỗng thì coi như mảng đã sắp xếp return;
//- nếu mảng chứa nhiều phần tử thì chọn 1 phần tử làm phần tử trung tâm
//- thực hiện chia array thành 2 phần, bên trái là các phần tử thấp hơn phần tử trung tâm
//bên phải là các phần tử cao hơn phần tử trung tâm
//- thực hiện sắp xếp cả 2 phần riêng biệt bằng cách lặp lại bước 1 và bước 2




public class QuickSoft {
    public static void main(String[] args) {

    }
    public static void quickSoft(int[] arr, int left, int right){
        if(arr == null || arr.length == 0 || left >= right) return;
        // phần tử giữa
        // ví dụ mảng 6 2 3 4 5 9 1
        int middel = left + (right - left)/ 2;
        int pivot = arr[middel];
        int i = left, j = right;

        //
        while (i < j){
            // kiểm tra đến khi nào tất cả các giá trị trong mảng bên trái nhỏ hơn pivot
            while (arr[i] < pivot) i++;
            // kiểm tra đến khi nào tất cả các giá trị trong mảng bên phải lớn hơn pivot
            while (arr[j] > pivot) j--;
            // tiến hành so sánh giá trị từ cả 2 phía xem có cân đổi chỗ hay không
            if(i <= j){
                swap(arr, i, j);
                i++;
                j--;
            }
            if(left < j) quickSoft(arr, left, j);
            if(right > i) quickSoft(arr, i, right);
        }


    }

    private static void swap(int []arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
