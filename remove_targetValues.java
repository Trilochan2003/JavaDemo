package Assgnments;

public class remove_targetValues {
	public static int helper(String[]arr,String target) {
		int n = arr.length;
		int count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i]!=target) {
				arr[count++] = arr[i];
			}
		else {
			arr[i] = "_";
			}
		}
		for(var i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args) {
		String[] arr = {"3","2","2","3"};
		System.out.println(helper(arr,"3"));
	}

}
