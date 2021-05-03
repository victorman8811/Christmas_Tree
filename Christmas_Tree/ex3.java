import java.util.Scanner;

class ex3 {
	public static void main (String[] args) {

		Scanner scanner=new Scanner(System.in);
		int layer;
		int side_length;
		int growth;
		int trunk_width;
		int trunk_height;
		while(scanner.hasNext()){

			layer=scanner.nextInt();

			side_length=scanner.nextInt();

			growth=scanner.nextInt();

			trunk_width=scanner.nextInt();

			trunk_height=scanner.nextInt();
			if(check(layer,side_length,growth,trunk_width,trunk_height)==false){
				System.out.println("Invalid input.");
				continue;
			}
			tree(layer,side_length,growth,trunk_width,trunk_height);
				
		}
	}




	public static boolean check (int layer,int side_width,int growth,int trunk_width,int trunk_height) {

		if(layer<2 || layer>5){

			return false;

		}

		if(side_width<3 || side_width>6){

			return false;

		}

		if(growth<1 || growth>5){

			return false;

		}

		if(trunk_width<3 || trunk_width>9 || trunk_width%2==0){

			return false;

		}

		if(trunk_height<4 || trunk_height>10){

			return false;

		}

		return true;

	}


	public static void tree (int layer,int side_length,int growth,int trunk_width,int trunk_height) {

		int test=0;
		int count7=10+growth*(layer-1)+(side_length-1);
		for(int i=0;i<layer;i++){

			if(i==0){

				for(int x=0;x<10+growth*(layer-1)+(side_length-1);x++){
				System.out.print(" ");
				}
				System.out.println("*");
			}

			/*else{

			
				for(int x=0;x<growth*layer-2;x++){
				System.out.print(" ");
				}

			}*/

			int count=0;
			int temp=0;
			int temp1=0;
			
			for(int b=0;b<(side_length-2)+i*growth;b++){

				for(int x=0;x<count7-count-1;x++){
				System.out.print(" ");
				}
				System.out.print('*');
				for(int c=0;c<1+count*2;c++){

					System.out.print('@');

				}
				System.out.println('*');
				if(b==(side_length-2)+i*growth-1){

					temp=count7-count-2;
					temp1=1+count*2+4;

				}
				if(b==(side_length-2)+(layer-1)*growth-1){
					test=temp1;
				}
				count++;
			}

				for(int x=0;x<temp;x++){
				System.out.print(" ");
				}
			for(int y=0;y<temp1;y++){
				System.out.print('*');
		}
			System.out.print('\n');

		}

		
		for(int v=0;v<trunk_height;v++){
		for(int a=0;a<10+test/2-(trunk_width/2);a++){
			System.out.print(" ");
		}
		for(int j=0;j<trunk_width;j++){

			System.out.print('|');
		}
		System.out.print('\n');
		}


		return;
	}

}
