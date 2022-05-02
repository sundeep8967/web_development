public class Code
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n =3;//
		int m = 8;//
	
		
		int arr[]={1,2,1}
		
		if(m<n) System.out.println("No");
		
		else{
		    Arrays.sort(arr);
		    //[112]
		    int cnt = n + arr[arr.size()-1];//n+2 = 5
		    
		    int left_chairs = cnt;//5
		    
		    for(int i=1;i<n;i++){
		        if(i <= arr.size()-1)
		          left_chairs = Math.max(arr[i],arr[i-1]);
		         if(left_chairs > m){
		            System.out.println("NO");
		            return;
		         }
		    }
		    
		        System.out.println("Yes");
		}
	}
}
