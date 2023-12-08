// digit to words
	static String digitToWord(int dig) {
		String a[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String word = "";
		while (dig != 0) {
			int rem = dig % 10;

			switch (rem) {
			case 0:
				word = word.concat(a[0]);

				break;
			case 1:
				word = word.concat(a[1]);

				break;
			case 2:
				word = word.concat(a[2]);

				break;
			case 3:
				word = word.concat(a[3]);

				break;

			case 4:
				word = word.concat(a[4]);

				break;

			case 5:
				word = word.concat(a[5]);

				break;

			case 6:
				word = word.concat(a[6]);

				break;

			case 7:
				word = word.concat(a[7]);

				break;
			case 8:
				word = word.concat(a[8]);

				break;

			case 9:
				word = word.concat(a[9]);

				break;

			default:
				break;
			}
			dig = dig / 10;
			System.out.println("gui");

		}
		return word;
	}