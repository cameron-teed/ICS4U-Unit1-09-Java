/*
* Generates random numbers and stores them in an
* an array and out puts the marks and the averages
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-03
* Class ClassMarks.
*/

final class ClassMarks {

  private ClassMarks() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

  /**
  * The number of students in the array.
  */
  public static final int STUDENTS = 4;
  /**
  * The number of marks generated.
  */
  public static final int MARKS = 6;
  /**
  * The max parameter for the marks.
  */
  public static final int RANDPARAM = 100;
  /**
  * Receives the marks and finds the average.
  *
  * @param markList
  * @return MarkAvg
  */

  public static int studentAvg(final int[][] markList) {
    // Creates the varaible to add all the marks together
    int addVal = 0;
    // Creates loop for all the dimensions of the array
    for (int counter = 0; counter < markList.length; counter++) {
      // Creates loop for all the elements in the aray
      for (int counterTwo = 0; counterTwo < markList[counter].length;
        counterTwo++) {
        // Adds the marks together
        addVal += (markList[counter][counterTwo]);
      }
    }
    // Creates the total amount of marks
    int divVal = STUDENTS * MARKS;

    // finds average of all numbers in array
    int markAvg = addVal / divVal;
    // Returns the average
    return markAvg;
  }

  /**
   * Creates the array of random numbers and prints them as well as the
   * average.
   *
   * @param args
   */
  public static void main(final String[] args) {

    // defines the array of random numbers
    int[][] markList = new int[STUDENTS][MARKS];

    // Creates loop for all the dimensions of the array
    for (int counter = 0; counter < markList.length; counter++) {
      // Prints out which student it is
      System.out.println();
      System.out.println("student: " + (counter + 1));
      // Creates loop for all the elements inside the array
      for (int counterTwo = 0; counterTwo < markList[counter].length;
        counterTwo++) {
        // Creates random numbers and stores it in the array
        markList[counter][counterTwo] = (int) (Math.random() * RANDPARAM + 1);
        //prints random numbers placed into array
        System.out.println(markList[counter][counterTwo]);
      }
    }
    // Calls the student average function and reveives the average
    int finalMarkAvg = studentAvg(markList);
    // prints average of all marks
    System.out.println();
    System.out.println("mark average: " + (finalMarkAvg) + "%");
    System.out.println();
    System.out.println("Done");
  }
}
