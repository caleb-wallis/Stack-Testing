
/**
 * Made by Caleb Wallis 
 * https://github.com/caleb-wallis
 */


/**
 * Console commands to compile and run the tests
 * 
 * javac -cp "junit-platform-console-standalone-1.8.2.jar" *.java
 * java -jar junit-platform-console-standalone-1.8.2.jar -cp .\ -c StackTest
 */


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * J-Unit 5 Testing for Stack.java
 */
public class StackTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    //private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    //private final PrintStream originalErr = System.err;   

    private Stack stack;

    /**
     * Set up the output stream to read the console output
     */
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        //System.setErr(new PrintStream(errContent));
    }

    /**
     * Reset the output stream to original state
     */
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        //System.setErr(originalErr);
    }

    /**
     * Reset the stack before every test to keep the original state of the stack the same between them
     */
    @BeforeEach
    public void resetStack(){
        stack = new Stack();
    }


    /**
     * Push Method Test.
     * Single item in the stack.
     * Asserting with value returned by the length method. (Expecting 1).
     */
    @Test
    @DisplayName("Test push(), single item stack, dependent on length()")
    public void singleItemPushTest1() {
        // Arrange
        stack.push("Item 1");
        // Act
        int actual = stack.length();
        // Assert
        Assertions.assertEquals(1, actual);
    }

    /**
     * Push Method Test.
     * Single item in the stack.
     * Asserting with value returned by the peek method. (Expecting "Item 1").
     */
    @Test
    @DisplayName("Test push(), single item stack, dependent on peek()")
    public void singleItemPushTest2() {
        // Arrange
        stack.push("Item 1");
        // Act
        String actual = stack.peek();
        // Assert
        Assertions.assertEquals("Item 1", actual);
    }

    /**
     * Push Method Test.
     * Multiple items in the stack.
     * Asserting with value returned by the length method. (Expecting 2).
     */
    @Test
    @DisplayName("Test push(), multiple item stack, dependent on length()")
    public void multipleItemPushTest1() {
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        int actual = stack.length();
        // Assert
        Assertions.assertEquals(2, actual);
    }

    /**
     * Push Method Test.
     * Multiple items in the stack.
     * Asserting with value returned by the peek method. (Expecting "Item 2").
     */
    @Test
    @DisplayName("Test push(), multiple item stack, dependent on peek()")
    public void multipleItemPushTest2() {
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        String actual = stack.peek();
        // Assert
        Assertions.assertEquals("Item 2", actual);
    }

    /**
     * Pop Method Test.
     * Empty stack.
     * Asserting with value returned by the pop method. (Expecting null).
     */
    @Test
    @DisplayName("Test pop(), empty stack")
    public void nullPopTest() {
        // Act
        String actual = stack.pop();
        // Assert
        Assertions.assertEquals(null, actual);
    }

    /**
     * Pop Method Test.
     * Single item in the stack.
     * Asserting with value returned by the pop method. (Expecting "Item 1").
     */
    @Test
    @DisplayName("Test pop(), single item stack, dependent on push()")
    public void singleItemPopTest1() {
        // Arrange
        stack.push("Item 1");
        // Act
        String actual = stack.pop();
        // Assert
        Assertions.assertEquals("Item 1", actual);
    }

      /**
     * Pop Method Test.
     * Single item in the stack.
     * Asserting with value returned by the length method. (Expecting 0).
     */
    @Test
    @DisplayName("Test pop(), single item stack, dependent on push() and length()")
    public void singleItemPopTest2() {
        // Arrange
        stack.push("Item 1");
        // Act
        stack.pop();
        int actual = stack.length();
        // Assert
        Assertions.assertEquals(0, actual);
    }

    /**
     * Pop Method Test.
     * Single item in the stack.
     * Asserting with value returned by the peek method. (Expecting null).
     */
    @Test
    @DisplayName("Test pop(), single item stack, dependent on push() and peek()")
    public void singleItemPopTest3() {
        // Arrange
        stack.push("Item 1");
        // Act
        stack.pop();
        String actual = stack.peek();
        // Assert
        Assertions.assertEquals(null, actual);
    }

    /**
     * Pop Method Test.
     * Multiple items in the stack stack.
     * Asserting with value returned by the pop method. (Expecting "Item 2").
     */
    @Test
    @DisplayName("Test pop(), multiple item stack, dependent on push()")
    public void multipleItemPopTest1() {
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        String actual = stack.pop();
        // Assert
        Assertions.assertEquals("Item 2", actual);
    }


     /**
     * Pop Method Test.
     * Multiple items in the stack stack.
     * Asserting with value returned by the length method. (Expecting 1).
     */
    @Test
    @DisplayName("Test pop(), multiple item stack, dependent on push() and length()")
    public void multipleItemPopTest2() {
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        stack.pop();
        int actual = stack.length();
        // Assert
        Assertions.assertEquals(1, actual);
    }


    /**
     * Pop Method Test.
     * Multiple items in the stack stack.
     * Asserting with value returned by the peek method. (Expecting "Item 2").
     */
    @Test
    @DisplayName("Test pop(), multiple item stack, dependent on push() and peek()")
    public void multipleItemPopTest3() {
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        stack.pop();
        String actual = stack.peek();
        // Assert
        Assertions.assertEquals("Item 1", actual);
    }


    /**
     * Peek Method Test.
     * Empty stack.
     * Asserting with value returned by the peek method. (Expecting null).
     */
    @Test
    @DisplayName("Test peek(), empty stack")
    public void nullPeekTest() {
        // Act
        String actual = stack.peek();
        // Assert
        Assertions.assertEquals(null, actual);
    }

    /**
     * Peek Method Test.
     * Single item in the stack.
     * Asserting with value returned by the peek method. (Expecting "Item 1").
     */
    @Test
    @DisplayName("Test peek(), single item stack, dependent on push()")
    public void singleItemPeekTest() {
        // Arrange
        stack.push("Item 1");
        // Act
        String actual = stack.peek();
        // Assert
        Assertions.assertEquals("Item 1", actual);
    }

    /**
     * Peek Method Test.
     * Multiple items in the stack.
     * Asserting with value returned by the peek method. (Expecting "Item 2").
     */
    @Test
    @DisplayName("Test peek(), multiple item stack, dependent on push()")
    public void multipleItemPeekTest() {
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        String actual = stack.peek();
        // Assert
        Assertions.assertEquals("Item 2", actual);
    }


    /**
     * IsEmpty Method Test.
     * Empty stack.
     * Asserting with value returned by the isEmpty method. (Expecting true).
     */
    @Test
    @DisplayName("Test isEmpty(), empty stack")
    public void nullIsEmptyTest() {
        // Act
        Boolean actual = stack.isEmpty();
        // Assert
        Assertions.assertTrue(actual);
    }

    /**
     * IsEmpty Method Test.
     * Single item in the stack.
     * Asserting with value returned by the isEmpty method. (Expecting false).
     */
    @Test
    @DisplayName("Test isEmpty(), single item stack, dependent on push()")
    public void singleItemIsEmptyTest() {
        // Arrange
        stack.push("Item 1");
        // Act
        Boolean actual = stack.isEmpty();
        // Assert
        Assertions.assertFalse(actual);
    }

    /**
     * IsEmpty Method Test.
     * Multiple items in the stack.
     * Asserting with value returned by the isEmpty method. (Expecting false).
     */
    @Test
    @DisplayName("Test isEmpty(), multiple item stack, dependent on push()")
    public void multipleItemIsEmptyTest() {
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        Boolean actual = stack.isEmpty();
        // Assert
        Assertions.assertFalse(actual);
    }

    /**
     * Length Method Test.
     * Empty stack.
     * Asserting with value returned by the length method. (Expecting 0).
     */
    @Test
    @DisplayName("Test length(), empty stack")
    public void nullLengthTest() {
        // Act
        int actual = stack.length();
        // Assert
        Assertions.assertEquals(0, actual);
    }

    /**
     * Length Method Test.
     * Single item in the stack.
     * Asserting with value returned by the length method. (Expecting 1).
     */
    @Test
    @DisplayName("Test length(), single item stack, dependent on push()")
    public void singleItemLengthTest() {
        // Arrange
        stack.push("Item 1");
        // Act
        int actual = stack.length();
        // Assert
        Assertions.assertEquals(1, actual);
    }

    /**
     * Length Method Test.
     * Multiple items in the stack.
     * Asserting with value returned by the length method. (Expecting 2).
     */
    @Test
    @DisplayName("Test length(), multiple item stack, dependent on push()")
    public void multipleItemLengthTest() {
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        int actual = stack.length();
        // Assert
        Assertions.assertEquals(2, actual);
    }

    /**
     * Dump Method Test.
     * Empty stack.
     * Asserting with value outputted to console by the dump method. (Expecting "").
     */
    @Test
    @DisplayName("Test dump(), empty stack")
    public void emptyDumpTest(){
        // Act
        stack.dump();
        String actual = outContent.toString().trim();
        // Assert
        Assertions.assertEquals("", actual);
    }

    /**
     * Dump Method Test.
     * Single item in the stack.
     * Asserting with value outputted to console by the dump method. (Expecting "Item 1->").
     */
    @Test
    @DisplayName("Test dump(), single item stack, dependent on push()")
    public void singleItemDumpTest(){
        // Arrange
        stack.push("Item 1");
        // Act
        stack.dump();
        String actual = outContent.toString().trim();
        // Assert
        Assertions.assertEquals("Item 1->", actual);
    }

    /**
     * Dump Method Test.
     * Multiple items in the stack.
     * Asserting with value outputted to console by the dump method. (Expecting "Item 2->Item 1->").
     */
    @Test
    @DisplayName("Test dump(), multiple item stack, dependent on push()")
    public void multipleItemDumpTest(){
        // Arrange
        stack.push("Item 1");
        stack.push("Item 2");
        // Act
        stack.dump();
        String actual = outContent.toString().trim();
        // Assert
        Assertions.assertEquals("Item 2->Item 1->", actual);
    }
}
