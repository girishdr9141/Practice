//All elements repeated twice only one unique element

public class Arr {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 2, 4, 1};
        int res = 0;
        for (int i = 0; i < arr.length; i++)
            res = res ^ arr[i];
        System.out.println("The unique element is" + res);
    }
}