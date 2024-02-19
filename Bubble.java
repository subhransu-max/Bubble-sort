import java.util.Arrays;
public class Bubble {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
			System.out.println(Arrays.toString(arr)); 
		bubblesort(arr);
	
	}
	
	static void bubblesort(int arr[]){
		
		for(int i = 0;i<arr.length;i++ ){
			boolean a = false;
			for(int j = 1;j< arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					a = true;
	 				}
				}
				
			System.out.println(Arrays.toString(arr));
				if(a == false){
				break;
				}
			}
			
		}
}
