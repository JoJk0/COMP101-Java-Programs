// GIANT USERNAME CLASS
// This program displays giant letters made by characters of each letter.
// Made by Jakub Janisz (u5jj1)

public class GiantU5jj1{
	
	// Main method
	
	public static void main(String[] args){

		// Enter your username chars:
        
        char input1 = 'u';
        char input2 = '5';
        char input3 = 'j';
        char input4 = 'j';
        char input5 = '1';

		
		// Call instances of method
		
		giantLetter(input1);
		giantLetter(input2);
		giantLetter(input3);
		giantLetter(input4);
		giantLetter(input5);
		
	};
	
	// Giant letters method
	
	public static void giantLetter(char letter){
		
		// Cases for each letter / digit
		
		if(letter == '0'){
			
			System.out.println("  000  ");
			System.out.println(" 0   0 ");
			System.out.println("0   0 0");
			System.out.println("0  0  0");
			System.out.println("0 0   0");
			System.out.println(" 0   0 ");
			System.out.println("  000  \n\n");
			
		} else if(letter == '1'){
			
			System.out.println("   1");
			System.out.println("  11");
			System.out.println(" 1 1");
			System.out.println("   1");
			System.out.println("   1");
			System.out.println("   1");
			System.out.println(" 11111\n\n");
			
		} else if(letter == '2'){
			
			System.out.println(" 22222");
			System.out.println("2     2");
			System.out.println("      2");
			System.out.println(" 22222");
			System.out.println("2");
			System.out.println("2");
			System.out.println("2222222\n\n");
			
		} else if(letter == '3'){
			
			System.out.println(" 33333");
			System.out.println("3     3");
			System.out.println("      3");
			System.out.println(" 33333");
			System.out.println("      3");
			System.out.println("*     3");
			System.out.println(" 33333\n\n");
			
		} else if(letter == '4'){
			
			System.out.println("4");
			System.out.println("4    4");
			System.out.println("4    4");
			System.out.println("4    4");
			System.out.println("4444444");
			System.out.println("     4");
			System.out.println("     4\n\n");
			
		} else if(letter == '5'){
			
			System.out.println("5555555");
			System.out.println("5      ");
			System.out.println("5      ");
			System.out.println("555555 ");
			System.out.println("      5");
			System.out.println("5     5");
			System.out.println(" 55555 \n\n");
			
		} else if(letter == '6'){
			
			System.out.println(" 66666");
			System.out.println("6     *");
			System.out.println("6");
			System.out.println("666666");
			System.out.println("6     6");
			System.out.println("6     6");
			System.out.println(" 66666\n\n");
			
		} else if(letter == '7'){
			
			System.out.println("7777777");
			System.out.println("7    7");
			System.out.println("    7");
			System.out.println("   7");
			System.out.println("  7");
			System.out.println("  7");
			System.out.println("  7\n\n");
			
		} else if(letter == '8'){
			
			System.out.println(" 88888");
			System.out.println("8     8");
			System.out.println("8     8");
			System.out.println(" 88888");
			System.out.println("8     8");
			System.out.println("8     8");
			System.out.println(" 88888\n\n");
			
		} else if(letter == '9'){
			
			System.out.println(" 99999");
			System.out.println("9     9");
			System.out.println("9     9");
			System.out.println(" 999999");
			System.out.println("      9");
			System.out.println("9     9");
			System.out.println(" 99999\n\n");
			
		} else if(letter == 'A' || letter == 'a'){
			
			System.out.println("   A");
			System.out.println("  A A");
			System.out.println(" A   A");
			System.out.println("A     A");
			System.out.println("AAAAAAA");
			System.out.println("A     A");
			System.out.println("A     A\n\n");
			
		} else if(letter == 'B' || letter == 'b'){
			
			System.out.println("BBBBBB");
			System.out.println("B     B");
			System.out.println("B     B");
			System.out.println("BBBBBB");
			System.out.println("B     B");
			System.out.println("B     B");
			System.out.println("BBBBBB\n\n");
			
		} else if(letter == 'C' || letter == 'c'){
			
			System.out.println(" CCCCC");
			System.out.println("C     C");
			System.out.println("C");
			System.out.println("C");
			System.out.println("C");
			System.out.println("C     C");
			System.out.println(" CCCCC\n\n");
			
		} else if(letter == 'D' || letter == 'd'){
			
			System.out.println("DDDDDD");
			System.out.println("D     D");
			System.out.println("D     D");
			System.out.println("D     D");
			System.out.println("D     D");
			System.out.println("D     D");
			System.out.println("DDDDDD\n\n");
			
		} else if(letter == 'E' || letter == 'e'){
			
			System.out.println("EEEEEEE");
			System.out.println("E");
			System.out.println("E");
			System.out.println("EEEEE");
			System.out.println("E");
			System.out.println("E");
			System.out.println("EEEEEEE\n\n");
			
		} else if(letter == 'F' || letter == 'f'){
			
			System.out.println("FFFFFFF");
			System.out.println("F");
			System.out.println("F");
			System.out.println("FFFFF");
			System.out.println("F");
			System.out.println("F");
			System.out.println("F\n\n");
			
		} else if(letter == 'G' || letter == 'g'){
			
			System.out.println(" GGGGG");
			System.out.println("G     G");
			System.out.println("G");
			System.out.println("G  GGGG");
			System.out.println("G     G");
			System.out.println("G     G");
			System.out.println(" GGGGG\n\n");
			
		} else if(letter == 'H' || letter == 'h'){
			
			System.out.println("H     H");
			System.out.println("H     H");
			System.out.println("H     H");
			System.out.println("HHHHHHH");
			System.out.println("H     H");
			System.out.println("H     H");
			System.out.println("H     H\n\n");
			
		} else if(letter == 'I' || letter == 'i'){
			
			System.out.println("  III");
			System.out.println("   I");
			System.out.println("   I");
			System.out.println("   I");
			System.out.println("   I");
			System.out.println("   I");
			System.out.println("  III\n\n");
			
		} else if(letter == 'J' || letter == 'j'){
			
			System.out.println("      J");
			System.out.println("      J");
			System.out.println("      J");
			System.out.println("      J");
			System.out.println("J     J");
			System.out.println("J     J");
			System.out.println(" JJJJJ\n\n");
			
		} else if(letter == 'K' || letter == 'k'){
			
			System.out.println("K    K");
			System.out.println("K   K");
			System.out.println("K  K");
			System.out.println("KKK");
			System.out.println("K  K");
			System.out.println("K   K");
			System.out.println("K    K\n\n");
			
		} else if(letter == 'L' || letter == 'l'){
			
			System.out.println("L");
			System.out.println("L");
			System.out.println("L");
			System.out.println("L");
			System.out.println("L");
			System.out.println("L");
			System.out.println("LLLLLLL\n\n");
			
		} else if(letter == 'M' || letter == 'm'){
			
			System.out.println("M     M");
			System.out.println("MM   MM");
			System.out.println("M M M M");
			System.out.println("M  M  M");
			System.out.println("M     M");
			System.out.println("M     M");
			System.out.println("M     M\n\n");
			
		} else if(letter == 'N' || letter == 'n'){
			
			System.out.println("N     N");
			System.out.println("NN    N");
			System.out.println("N N   N");
			System.out.println("N  N  N");
			System.out.println("N   N N");
			System.out.println("N    NN");
			System.out.println("N     N\n\n");
			
		} else if(letter == 'O' || letter == 'o'){
			
			System.out.println("OOOOOOO");
			System.out.println("O     O");
			System.out.println("O     O");
			System.out.println("O     O");
			System.out.println("O     O");
			System.out.println("O     O");
			System.out.println("OOOOOOO\n\n");
			
		} else if(letter == 'P' || letter == 'p'){
			
			System.out.println("PPPPPP");
			System.out.println("P     P");
			System.out.println("P     P");
			System.out.println("PPPPPP");
			System.out.println("P");
			System.out.println("P");
			System.out.println("P\n\n");
			
		} else if(letter == 'Q' || letter == 'q'){
			
			System.out.println(" QQQQQ");
			System.out.println("Q     Q");
			System.out.println("Q     Q");
			System.out.println("Q     Q");
			System.out.println("Q   Q Q");
			System.out.println("Q    Q");
			System.out.println(" QQQQ Q\n\n");
			
		} else if(letter == 'R' || letter == 'r'){
			
			System.out.println("RRRRRR");
			System.out.println("R     R");
			System.out.println("R     R");
			System.out.println("RRRRRR");
			System.out.println("R   R");
			System.out.println("R    R");
			System.out.println("R     R\n\n");
			
		} else if(letter == 'S' || letter == 's'){
			
			System.out.println(" SSSSS");
			System.out.println("S     S");
			System.out.println("S");
			System.out.println(" SSSSS");
			System.out.println("      S");
			System.out.println("S     S");
			System.out.println(" SSSSS\n\n");
			
		} else if(letter == 'T' || letter == 't'){
			
			System.out.println("TTTTTTT");
			System.out.println("   T");
			System.out.println("   T");
			System.out.println("   T");
			System.out.println("   T");
			System.out.println("   T");
			System.out.println("   T\n\n");
			
		} else if(letter == 'U' || letter == 'u'){
			
			System.out.println("U     U");
			System.out.println("U     U");
			System.out.println("U     U");
			System.out.println("U     U");
			System.out.println("U     U");
			System.out.println("U     U");
			System.out.println(" UUUUU\n\n");
			
		} else if(letter == 'V' || letter == 'v'){
			
			System.out.println("V     V");
			System.out.println("V     V");
			System.out.println("V     V");
			System.out.println("V     V");
			System.out.println(" V   V");
			System.out.println("  V V");
			System.out.println("   V\n\n");
			
		} else if(letter == 'W' || letter == 'w'){
			
			System.out.println("W     W");
			System.out.println("W  W  W");
			System.out.println("W  W  W");
			System.out.println("W  W  W");
			System.out.println("W  W  W");
			System.out.println("W  W  W");
			System.out.println(" WW WW\n\n");
			
		} else if(letter == 'X' || letter == 'x'){
			
			System.out.println("X     X");
			System.out.println(" X   X");
			System.out.println("  X X");
			System.out.println("   X");
			System.out.println("  X X");
			System.out.println(" X   X");
			System.out.println("X     X\n\n");
			
		} else if(letter == 'Y' || letter == 'y'){
			
			System.out.println("Y     Y");
			System.out.println(" Y   Y");
			System.out.println("  Y Y");
			System.out.println("   Y");
			System.out.println("   Y");
			System.out.println("   Y");
			System.out.println("   Y\n\n");
			
		} else if(letter == 'Z' || letter == 'z'){
			
			System.out.println("ZZZZZZZ");
			System.out.println("     Z");
			System.out.println("    Z");
			System.out.println("   Z");
			System.out.println("  Z");
			System.out.println(" Z");
			System.out.println("ZZZZZZZ\n\n");
			
		} else if(letter == '\u0000'){
			
			System.out.println();
			
		} else{
			
			// Display error if entered incorrct character
			
			System.out.println("ERROR: Letter not found.\n");
			
		}
		
	}
	
}