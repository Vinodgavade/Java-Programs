
public class AddWithoutPlusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        int b = 7;

        int sum = addWithoutPlusOperator(a, b);

        System.out.println("Sum: " + sum);
    }

    public static int addWithoutPlusOperator(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

}
