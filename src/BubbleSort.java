public class BubbleSort
{
    public static int[] bubbleSort(int[] arr)
    {
        for (int i = arr.length; i > 0; i -= 1)
        {
            for (int j = 0; j < i - 1; j += 1)
            {
                if (arr[j] > arr[j+1])
                {
                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {123, -45, 6, 34, 1, 67, 45, 34, 88, 0, -32};
        bubbleSort(arr);

        for(int x : arr)
        {
            System.out.println(x);
        }
    }
}
