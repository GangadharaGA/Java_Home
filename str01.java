public class str01{

    public static void main(String[] args) {
        
        String[] st = {"reflower","flow","flight"};
        int min=st[0].length();
        
        int n=st.length;
        String minstr=st[0];
        
        for(int i=1 ; i < n ; i++)
        {
            if(st[i].length()<min)
            {
                min=st[i].length();
                minstr=st[i];
            }
        }
        
        System.out.println(min+" "+minstr);
        String ans=" ";
        boolean flag=false;
        for(int i=0;i<min;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(minstr.charAt(i)==st[j].charAt(i))
                {
                    flag=true;

                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                ans+=minstr.charAt(i);
            }
            else
            {
                break;
            }
        }

        System.out.println("Answer is: "+ans);

    }
}