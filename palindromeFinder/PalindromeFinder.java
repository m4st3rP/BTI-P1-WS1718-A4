package palindromeFinder;

public class PalindromeFinder {
  String text;

  public PalindromeFinder() {}

  public PalindromeFinder(String givenText) {
    this.text = givenText;
  }

  public String getText() {
    return text;
  }

  public String getLongestPalindrome() {
    char[] textAsArray = this.text.toCharArray();
    String longestPalindrome = "";
    int repetitionCounter = 1;
    int a = 0;
    int b = textAsArray.length - repetitionCounter;;

    if (textAsArray.length > 0) {
      for (int i = 0; i < repetitionCounter; i++) {
        a = 0;
        b = textAsArray.length - repetitionCounter;

        while (b < textAsArray.length) {
          if (isPalindrome(a, b, textAsArray)) {
            for (int j = a; j <= b; j++)
              longestPalindrome += textAsArray[j];
            return longestPalindrome;
          }
          a++;
          b++;
        }
        repetitionCounter++;
      }
    }
    return null;
  }

  public void setText(String givenText) {
    this.text = givenText;
  }

  public boolean isPalindrome(int a, int b, char[] textAsArray) {
    while ((a < b) && (Character.toLowerCase(textAsArray[a]) == Character.toLowerCase(textAsArray[b]))) {
      a++;
      b--;
    }
    return a >= b;
  }
}
