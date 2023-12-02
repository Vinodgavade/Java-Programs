

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int numRows =5;
        for (int i = 1; i <= numRows; i++) {

        	for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
	}

}
