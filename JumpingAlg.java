import java.util.ArrayList;

public class JumpingAlg {

	public static final int NUM_PIECES = 11;

	public static void main(String[] args) {

		ArrayList<String> steps = new ArrayList<>();
		ArrayList<Integer> counts = new ArrayList<>();

		for (int i = 0; i < NUM_PIECES; i++) {
			counts.add(i + 1);

		}
		counts.add(NUM_PIECES);

		for (int i = 0; i < NUM_PIECES; i++) {
			counts.add(NUM_PIECES - i);

		}

		System.out.println(counts);

		boolean left = true;
		for (int i = 0; i < counts.size(); i++) {

			if (i < counts.size() - (NUM_PIECES - 1)) {

				if (left) {
					int mover = NUM_PIECES;

					for (int j = 0; j < counts.get(i); j++) {
						steps.add("L" + mover);
						mover--;

					}

				} else {
					int mover = 1;

					for (int j = 0; j < counts.get(i); j++) {
						steps.add("R" + mover);
						mover++;

					}

				}

			} else if (i != counts.size() - 1) {
				if (left) {
					int mover = counts.get(i);

					for (int j = 0; j < counts.get(i); j++) {
						steps.add("L" + mover);
						mover--;

					}

				} else {
					int mover = NUM_PIECES - counts.get(i) + 1;

					for (int j = 0; j < counts.get(i); j++) {
						steps.add("R" + mover);
						mover++;

					}

				}

			} else {
				steps.add("L1");
			}

			left = !left;
		}

		System.out.println(steps);
		System.out.println(steps.size());

	}

}
