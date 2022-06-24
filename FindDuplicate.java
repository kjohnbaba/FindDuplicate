
/*************************************************************************
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
	int[] a = new int[args.length];
		for (int i=0; i<args.length; i++) {
			a[i]=Integer.parseInt(args[i]);				
		}
		
		boolean flag = false;
		for (int j=0; j<args.length-1;j++){
			for (int i=j+1; i<args.length; i++) {
			if(a[i]==a[j]){
				flag = true;
				break;
				}			
			}
		}
		System.out.println(flag);

	}
}
