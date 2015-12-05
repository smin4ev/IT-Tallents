import java.util.Scanner;

public class TankWithWater10 {

	public static void main(String[] args) {
		System.out.println("Enter a volum of the tank:");
		Scanner sc = new Scanner(System.in);
		int tankVolume = sc.nextInt();
		while(tankVolume<10 || tankVolume>9999){
			System.out.println("Tank volume must be more than 10l and no more 9999l");
			tankVolume=sc.nextInt();
		}
			int smallBuscetVolume = 2;
			int bigBuscetVolume = 3;
			int sumOfBuscetsVolume = smallBuscetVolume + bigBuscetVolume;
			
			int bothBuscetUse = tankVolume/sumOfBuscetsVolume;
			int restVolume = tankVolume%sumOfBuscetsVolume;
			int useBuscets = sumOfBuscetsVolume*bothBuscetUse;
			if(restVolume<smallBuscetVolume){
				//useBuscets = useBuscets+1;
				System.out.println( bothBuscetUse + "*2 liters," + bothBuscetUse + "*3liters" + 
				" + 1 buscet 2 litres ") ;
			}else 
				if(restVolume>=2 && restVolume<3){
				//useBuscets = useBuscets+1;
				System.out.println( bothBuscetUse + "*2 liters," + bothBuscetUse + "*3liters" + 
						" + 1 buscet 3 litres ") ;	
			}else{
				//useBuscets = useBuscets +2;
				System.out.println( bothBuscetUse + "*2 liters," + bothBuscetUse + "*3liters" + 
						" + 1 more time both buscets ") ;	
			}		
					
	}

}
