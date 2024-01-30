public class Rouf02 {
    

    public static void merge(int []arr,int s,int mid,int e) {

        int l1=mid-s+1;
        int l2=mid-e;

        int []a1=new int[l1];
        int []a2=new int[l2];

        int mai=s;

        for (int i = 0; i < l1; ++i)
        {
            a1[i] = arr[mai++];
        }

        
        for(int j=0;j<l2;j++)
        {
            a2[j]=arr[mai++];
        }

        mai=s;
        int i1=0;
        int i2=0;
        while((l1>0) && (l2 > 0))
        {
            if(a1[i1]<a2[i2])
            {
                arr[mai++]=a1[i1++];
            }
            else
            {
                arr[mai++]=a2[i2++];
            }

        }
        while(i1<l1){
            arr[mai++]=a1[i1++];
        }
        while(i2<l2){
            arr[mai++]=a1[i2++];
        }
        


    }

    static void mergesort_01(int []arr,int s, int e)
    {
        if(s>e)
        {
            return;
        }

        int mid=s+(e-s)/2;
        mergesort_01(arr, s, mid);
        mergesort_01(arr, mid+1, e);

        merge(arr,s,mid,e);

    }



    public static void main(String[] args) {
        
        int arr[] ={12, 345, 67890, 23, 34};
        int s=0;
        int e=arr.length;
        mergesort_01(arr,s,e);

        for(int i=0;i<e;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
