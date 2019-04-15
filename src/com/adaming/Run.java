package com.adaming;

public class Run {

	public static void main(String[] args) {
		Article a1=new Article();
		a1.id=1;
		a1.designation="art1";
		a1.prixHt=12.05;
		a1.qte=15;
		Article a2=new Article();
		a2.id=2;
		a2.designation="art2";
		a2.prixHt=22.22;
		a2.qte=8;
		Article a3=new Article();
		a3.id=3;
		a3.designation="art3";
		a3.prixHt=42.10;
		a3.qte=26;
		Article a4=new Article();
		a4.id=4;
		a4.designation="art4";
		a4.prixHt=6.66;
		a4.qte=14;

		a1.afficherDetails();
		a2.afficherDetails();
		a3.afficherDetails();
		a4.afficherDetails();
		
		double pa1=a1.calculTtc();
		System.out.println(pa1);
		
	}

}
