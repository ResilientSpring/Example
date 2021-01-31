
public class LocalClassDemo {

	public static void main(String[] args) {

		// An inner class version of ShowBits
		class ShowBits4 { // A local class nested within a method.

			int numbits;

			public ShowBits4(int n) {
				// TODO Auto-generated constructor stub

				numbits = n;
			}

			void show(long val) {
				long mask = 1;

				// left-shift a 1 into the proper position
				mask <<= numbits - 1; // mask = mask << numbits-1;

				int spacer = 0;

				for (; mask != 0; mask >>>= 1) { // mask = mask >>> 1;

					if ((val & mask) != 0)
						System.out.print("1");
					else
						System.out.print("0");
					spacer++;
					if ((spacer & 8) == 0) {
						System.out.print(" ");
						spacer = 0;
					}
				}
				System.out.println();
			}
		}

		for (byte b = 0; b < 10; b++) {

			ShowBits4 byteval = new ShowBits4(8);
			System.out.print(b + " in binary: ");
			byteval.show(b);
		}

	}

}
