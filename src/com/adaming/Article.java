package com.adaming;

public class Article {
   long id;
   String designation;
   double prixHt;
   int qte;

   void afficherDetails() {
	   System.out.println(designation+"  "+prixHt);
                          }
   double calculTtc() {
	   double prixTtc=prixHt*1.2;
	   return prixTtc;
   					  }
   
}
