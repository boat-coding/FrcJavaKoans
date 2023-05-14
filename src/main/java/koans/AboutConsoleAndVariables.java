package koans;

import static engine.Helpers.readLine;

public class AboutConsoleAndVariables {
    /**
     * Display 'Hello!' in the console.
     * 
     * ---------   TIPS --------------
     * 
     * All lines of code in Java must end with the ';' character. Ex:
     * 
     * System.out.println("Apple");
     * 
     * You can use the method System.out.println([some value]) to write something in the console.
     * 
     * You can tell Java that some value is text by enclosing it between double quotes. Ex:
     * 
     * "This is text"
     * 
     * -------------------------------
     * 
     * Expected result in the console:
     * 
     * Hello!
     */
    public static void sayHelloInConsole() {

    }

    /**
     * Make java compute 2 + 2 for you, and display the result in the console.
     * 
     * ---------   TIPS --------------
     * 
     * In Java, you can compute arithmetic expressions in Java. For example:
     * 
     * 3 + 4
     * 3 * 4
     * 3 / 4
     * 3 - 4
     * 
     * You can use the method System.out.println([some arithmetic expression]) to do so.
     * 
     * -------------------------------
     * 
     * Expected result in the console:
     * 
     * 4
     */
    public static void computeTwoAndTwo() {

    }

    /**
     * Compute 2 + 2 and store the value in a variable. Display the value of the variable.
     * 
     * ---------   TIPS --------------
     * 
     * A variable is a piece of information which can be referred to by a name.
     * So, to declare a variable, you need to give it a name and a value.
     * But in Java, you also need to give the kind of information (its type).
     * For example, when the information is an integer number, the type is called 'int'.
     * Putting everything together, if we want to create a variable for the number of legs of a pig:
     * 
     * int pigNbOfLegs = 4;
     *  ^       ^       ^
     * type   name    value
     * 
     * The value can be an arithmetic expression. For example:
     * 
     * int pigNbOfLegs = 1 + 1 + 1 + 1;
     * 
     * Whenever you use the name of the variable, Java will replace it with its value when running.
     * For example, if you want to display the number of legs of a pig variable in the console:
     * 
     * System.out.println(pigNbOfLegs);
     *                         ^
     *     'pigNbOfLegs' will be replaced by its value.
     * 
     * This is equivalent to:
     * 
     * System.out.println(4);
     * 
     * -------------------------------
     * 
     * Expected result in the console:
     * 
     * 4
     */
    public static void createAndDisplayAVariable() {

    }

    /**
     * Create a text variable called 'greeting' with the value 'Hello!' and display it in the console.
     * 
     * ---------   TIPS --------------
     * 
     * The java type for a piece of text is called 'String'.
     * 
     * -------------------------------
     * 
     * Expected result in the console:
     * 
     * Hello!
     */
    public static void createAndDisplayAStringVariable() {

    }


    /**
     * Display a ask for a name in the console. Let the user answer. Store the answer in a String variable. Display 'Your name is:' and then the answer.
     * 
     * ---------   TIPS --------------
     * 
     * You can read a text from the console with readLine(). This method is _returning_ the value typed in the console by the user.
     * 'Returning a result' means Java will replace the call to the method by its returned result in the code.
     * 
     * Let's say that when asked, the user will type 'Hello' then the [ENTER] key in the console. Then:
     * 
     * String someText = readLine();
     * 
     * Will become the equivalent to:
     * 
     * String someText = "Hello";
     * 
     * -------------------------------
     * 
     * Expected result in the console:
     * 
     * What is your name?
     * [Enter some name]
     * Your name is:
     * [The name entered above]
     */
    public static void askAndDisplayNameInConsole() {

    }

    /**
     * Same thing as before, but display the name on a single line.
     * 
     * ---------   TIPS --------------
     * 
     * You will need to create a text out of 2 text values. Glueing multiple text values together is called "concatenating".
     * In Java, you can do that with the '+' operator:
     * 
     * String glued = "abc" + "def";
     *          ^
     *  glued's value is "abcdef"
     * 
     * Warning! Don't confuse the String concatenation operator with the number's 'addition' operator. This won't work:
     * 
     * 4 + "abc"
     *   ^
     * Error: because the left of the operator is a number, '+' is the 'addition' operator for numbers, not the text's 'concatenate' one.
     * As a result, Java expects an other number to the right of the '+', but "abc" is not a number.
     * 
     * Note: however, this will work:
     * 
     * String glued = "abc" + 4;
     *          ^
     *  glued's value is "abc4"
     * 
     * This is because Java can convert anything, including numbers, to text automatically. So in this case, it is equivalent to:
     * 
     * String glued = "abc" + "4";
     *                         ^
     *            Automatically converted to text
     * You can read a text from the console with readLine(). This method is _returning_ the value typed in the console by the user.
     * 
     * -------------------------------
     * 
     * Expected result in the console:
     * 
     * What is your name?
     * [Enter some name]
     * Your name is: [The name entered above]
     */
    public static void askAndDisplayNameOnASingleLineInConsole() {

    }

    /**
     * Ask for a name, then for an age. Display both on the same line.
     * 
     * ---------   TIPS --------------
     * 
     * You can concatenate more than 2 texts together. For example:
     * 
     * String glued = "abc" + "def" + "ghi";
     *          ^
     *  glued's value is "abcdefghi"
     * 
     * -------------------------------
     * 
     * Expected result in the console:
     * 
     * What is your name?
     * [Enter some name]
     * What is your age?
     * [Enter some age]
     * Your name is [The name entered above] and your age is [The age entered above].
     */
    public static void askNameAndAgeInConsole() {

    }

    
    /**
     * Ask for an age. Display the age in 5 years.
     * 
     * ---------   TIPS --------------
     * 
     * The trick is, the value returned from the console is always text.
     * But, in order to compute the 5-years-from-now value, you will need to convert the text to an integer number first.
     * You can convert some text to an integer like so:
     * 
     * String nbOfOrangesAsText = "3";
     * int nbOfOrangesAsNumber = Integer.parseInt(nbOfOrangesAsText);
     *              ^
     *    value is 3, as a number
     * 
     * For the computation, you can either create a new variable you can display later:
     * 
     * int nbOfOragesAfterIAteOne = nbOfOrangesAsNumber - 1;
     * 
     * Or compute it directly where you need it, by using parentheses:
     * 
     * System.out.println("Oranges left: " + (nbOfOrangesAsNumber - 1));
     * 
     * -------------------------------
     * 
     * Expected result in the console:
     * 
     * What is your age?
     * [Enter some age]
     * In 5 years from now, you will be [The age entered above + 5 years].
     */
    public static void computeAgeIn5YearsConsole() {

    }
}
