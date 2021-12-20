public class Insertion {
    public static void main(String[] args) {
        String[] arr = {1,23,-1,0,9,8};

        int temp;

        for(int i=1;i<arr.length;i++)
        {
            temp = arr[i];
            int j = i-1;

            while(j>=0&&arr[j]>temp)
            {
               
                
                    arr[j+1]=arr[j];
                    --j;
               
            }
            arr[j+1]=temp;
        }

        for(int k:arr)
        {
            System.out.println(k);
        }
    }
    
}
