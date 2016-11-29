package com.htmlman1.eloapi;

public class EloAPI {

  /**
    * Constructor.
    */
  public EloAPI() {}

  /**
    * A quick function to calculate Elo ratings. Follows algorithm found at
    * https://en.wikipedia.org/wiki/Elo_rating_system#Mathematical_details.
    *
    * This version returns a primitive int array with the new ratings, but you
    * can modify it as needed. The important variables to watch out for are "an"
    * and "bn", which hold the new ratings for player A and player B respectively.
    *
    * @param a
    *   The rating for player A.
    * @param b
    *   The rating for player B.
    * @param winner
    *   A string indicating the winner. Can be either "A" or "B", case-insensitive.
    * @param k
    *   The k-factor to use for the calculation. Higher values will make ratings
    *   change more drastically.
    * @return
    *   An int[] primitve array, with the first int being A's new rating, and the
    *   second being B's new ranking.
    */
  public int[] calculateNewRatings(int a, int b, String winner, int k) {
		double ea = 1 / (1 + Math.pow(10, (b - a) / 400));
		double eb = 1 - ea;
		int sa = (winner.equalsIgnoreCase("a")) ? 1 : 0;
		int sb = 1 - sa;
		int an = (int) Math.floor(a + k * (sa - ea));
		int bn = (int) Math.floor(b + k * (sb - eb));
		return new int[]{an, bn};
	}

}
