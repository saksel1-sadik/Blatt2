package h3;

public class H3_main {
	
	public static void main(String[] args) {
		int i=140, j=150, k=-10;
		
		/*
		 	i > j   (Ausdruck 1)
			i > 200 (Ausdruck 2)
			j > 100 (Ausdruck 3)
		 */

		
		//Ist Ausdruck 1 wahr und Ausdruck 2 und Ausdruck 3 sind nicht wahr, dann wird k auf 1 gesetzt.
		
		if (i > j) {
			if (i <= 200) {
				if (j <= 100) {
					k=1;
				}
			}
		}
		
		//Sind Ausdruck 1 und Ausdruck 2 wahr und ist Ausdruck 3 nicht wahr, dann wird k auf 2 gesetzt.
		
		if (i > j) {
			if (i > 200) {
				if (j <= 100) {
					k=2;
				}
			}
		}
		
		//Sind Ausdruck 1 und Ausdruck 2 und Ausdruck 3 wahr, dann wird k auf 3 gesetzt.

		if (i > j) {
			if (i > 200) {
				if (j > 100) {
					k=3;
				}
			}
		}
		
		//Sind alle drei Ausdrücke nicht wahr, dann hat k den Wert 4 nach Abschluss des	Programms.
		if (i <= j) {
			if (i <= 200) {
				if (j <= 100) {
					k=4;
				}
			}
		}
		
		
		System.out.println(k);
	}

}
