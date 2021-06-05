
public class FirstNonRepeatableCharacterInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,1,2};
        
        for(int i=0; i<a.length;i++) {
            int count = 0;
            for(int j=0; j<a.length;j++) {
                if(a[i]==a[j] && i!=j) {
                    count++;
                    break;
                }
            }
                if(count == 0) {
                    System.out.println(a[i]);
                    break;              //To display first non repeating element
                }
        }

	}}
