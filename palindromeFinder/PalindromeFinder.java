package palindromeFinder;

/**
 * A class to create an object that is able to identify the largest palindrome in a string.
 * 
 * @author Philipp Schwarz
 *
 */
public class PalindromeFinder {
  private String text;

  /**
   * A parameterless constructor.
   */
  public PalindromeFinder() {}

  /**
   * A non-paramterless constructor.
   * 
   * @param givenText The String where the longest Palindrome will be searched for.
   */
  public PalindromeFinder(String givenText) {
    this.text = givenText;
  }

  /**
   * @return The current String the object holds.
   */
  public String getText() {
    return text;
  }

  /**
   * The method that finds a longest palindrome in the string, starting by checking if there is one
   * that has the length of the String, then length-1 and so on while going from left to right until
   * it finds on which it will return immediately.
   * 
   * @return The longest palindrome as string.
   */
  public String getLongestPalindrome() {
    // convert String to Char array to make it easier to work with
    char[] textAsArray = this.text.toCharArray();
    String longestPalindrome = "";
    int firstPosition = 0;
    int lastPosition = textAsArray.length - 1;

    // check if the string has atleast one character
    if (textAsArray.length > 0) {
      // repeat at most the length of the String times
      for (int i = 1; i <= textAsArray.length; i++) {
        firstPosition = 0;
        // decrease length of area we search a palindrome for by one each step
        lastPosition = textAsArray.length - i;

        // only repeat until lastPosition reaches end of string
        while (lastPosition < textAsArray.length) {
          // if a Palindrome is found write it into a string that will be returned
          if (isPalindrome(firstPosition, lastPosition, textAsArray)) {
            for (int j = firstPosition; j <= lastPosition; j++)
              longestPalindrome += textAsArray[j];
            return longestPalindrome;
          }
          // move area that we check for a palindrome one character to the right
          firstPosition++;
          lastPosition++;
        }
      }
    }
    // we only get here if String had less than one character
    return null;
  }

  /**
   * A setter that will set the text of the object.
   * 
   * @param givenText The text that will be set.
   */
  public void setText(String givenText) {
    this.text = givenText;
  }

  /**
   * Method to check if a certain part of the text is a palindrome.
   * 
   * @param a Start position in the string where we currently check for a palindrome.
   * @param b End position in the string where we currently check for a palindrome.
   * @param textAsArray The string that we search a palindrome for.
   * @return Boolean if currently checked part is a palindrome or not.
   */
  public boolean isPalindrome(int a, int b, char[] textAsArray) {
    // check if first and last character of checked part are the same, if they are proceed with second
    // and penultimate and so on
    while ((a < b) && (Character.toLowerCase(textAsArray[a]) == Character.toLowerCase(textAsArray[b]))) {
      a++;
      b--;
    }
    // If a becomes equal or larger than b we have found a palindrome.
    return a >= b;
  }
}

