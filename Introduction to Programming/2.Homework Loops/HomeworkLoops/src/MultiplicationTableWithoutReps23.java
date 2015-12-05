import org.omg.Messaging.SyncScopeHelper;

public class MultiplicationTableWithoutReps23 {

	public static void main(String[] args) {
		int firstMultiplier = 1;
		int secondMultiplier = firstMultiplier;
		while(firstMultiplier<=9){
			while(secondMultiplier<=9){
				if(secondMultiplier>=firstMultiplier){
					System.out.print(firstMultiplier + "*" + secondMultiplier + ";");
					secondMultiplier++;
				}
			}
			firstMultiplier++;
			secondMultiplier = firstMultiplier;
			System.out.println();
		}
		
	}
  
}
