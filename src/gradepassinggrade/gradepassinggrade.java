package gradepassinggrade;

import java.util.Scanner;

public class gradepassinggrade {

	public static void main(String[] args) {
				
		int mat,physic,turkish,chemical,music;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your mathematics note :");
		mat=scanner.nextInt();
		
		System.out.println("enter your physics note :");
		physic = scanner.nextInt();
		
		System.out.println("enter your turkish note :");
		turkish = scanner.nextInt();
		
		System.out.println("enter your chemical note :");
		chemical = scanner.nextInt();
		
		System.out.println("enter your music note :");
		music = scanner.nextInt();
		
		if (mat<0||mat>100) {
			mat=0;	
		}
		if (physic<0||physic>100) {
			physic=0;	
		}
		if (turkish<0||turkish>100) {
			turkish=0;	
		}
		if (chemical<0||chemical>100) {
			chemical=0;	
		}
		if (music<0||music>100) {
			music=0;	
		}
		
		double average = ((mat+physic+turkish+chemical+music)/5); 
		
		System.out.println("your average :"+average);
		

	}

}
