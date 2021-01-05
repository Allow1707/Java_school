public class main {
    public static void main(String[] arg){
        int[] a = {1, 2, 6, 9, 10, 11, 22, 23, 34, 56, 66};
        System.out.println(binarySearch(a, 9, 0, a.length - 1));
        Square b = new Square(3);
        System.out.println(b.square());
    }

    static int binarySearch(int[] arr, int el, int first, int last) {
        int mid = (last - first + 1) / 2;
        if (mid == 0) {
            return first;
        }
        int res;
        if (arr[mid] == el) {
            res = mid;
        } else if (arr[mid] > el) {
            res = binarySearch(arr, el, first, last - (mid - 1));
        } else {
            res = binarySearch(arr, el,first + mid, last);
        }

        return res;
    }
}
