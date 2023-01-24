@Test
public void testAdd() {
        int actualResult = calc.myMethodAdd(10, 5);
        int expectedResult = 15;
        assertEquals("10 + 5 must be 15", 15, actualResult);
        }

// TODO (*)
//add tests for new methods (multiply, division, subtraction, square root, x^2)
@Test
public void methodForSubtraction() {
        int actualResult = calc.myMethodSubtraction(10, 5);
        int expectedResult = 5;
        assertEquals("10 - 5 must be 5", 5, actualResult);
        }

@Test
public void methodForMultiplication() {
        int actualResult = calc.myMethodMultiplication(10, 5);
        int expectedResult = 50;
        assertEquals("10 * 5 must be 50", 50, actualResult);

        
