public class Utama {

  /*Output :
    Buah anggur adalah milik pak bejo
    Buah durian adalah milik pak lurah
    Buah melon adalah milik pak sedeng
    Buah danas adalah milik pak bahenol
   */



	public static void main(String[] args) {
		String [][] pemilikBuah  = new String [][] {
			{"anggur", "durian", "melon", "danas"},
			{"pak bejo", "pak lurah", "pak sedeng", "pak bahenol"}
		};
		for (int i=0; i<4; i++) {
			int x = 0;
			if (i==0) {
				System.out.println("Buah " + pemilikBuah[x][i] + " adalah milik " + pemilikBuah[x+1][i]);
			}else if (i==1) {
				System.out.println("Buah " + pemilikBuah[x][i] + " adalah milik " + pemilikBuah[x+1][i]);
			}else if (i==2) {
				System.out.println("Buah " + pemilikBuah[x][i] + " adalah milik " + pemilikBuah[x+1][i]);
			}else {
				System.out.println("Buah " + pemilikBuah[x][i] + " adalah milik " + pemilikBuah[x+1][i]);
			}
		}
	/*00 10 
	  01 11
	  02 12
	  03 13*/
	}
}
