public class ArrayDeclare {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int[] array = new int[4];
        array[0] = 36;
        array[1] = 34;
        array[2] = 345;
        array[3] = 3456;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        int[] arr = {23,34,54,1232,546,123,12};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        int index = 0;
        while (index < 7) {
            System.out.println(arr[index]);
            index++;
        }
    }
}