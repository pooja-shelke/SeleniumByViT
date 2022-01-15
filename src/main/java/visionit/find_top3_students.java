package visionit;

public class find_top3_students {
	
	public static void main(String[] args) {
		
		
		Object student[][] = new Object[10][2];
		
		student[0][0]= "Asha";
		student[1][0]= "Ashish";
		student[2][0]= "Rashi";
		student[3][0]= "Pooja";
		student[4][0]= "Pratibha";
		student[5][0]= "Aakash";
		student[6][0]= "Ritu";
		student[7][0]= "Rajiv";
		student[8][0]= "Ridhi";
		student[9][0]= "Shashi";
		
		student[0][1]= 100;
		student[1][1]= 78;
		student[2][1]= 89;
		student[3][1]= 45;
		student[4][1]= 66;
		student[5][1]= 55;
		student[6][1]= 78;
		student[7][1]= 34;
		student[8][1]= 23;
		student[9][1]= 98;
	
//		
//		for(int i=0; i<10; i++)
//		{
//               
//				System.out.println("Name of student is: " +student[i][0]);
//				System.out.println("Marks of student is: "+student[i][1]);
//				
//			
//		}
		
		
		for(int j=0; j<10; j++)
			
		{   Object marks = student[j][1];
			Object first= student[0][1];
			Object second= 0, third = 0;
		
//		if(marks> first)
//			{ 
//	            third = second;
//	            second = first;
//				first = student[j][1]; 
//			}
		 System.out.println("First highest marks is :" +first);
	}
		
	}
	
}

