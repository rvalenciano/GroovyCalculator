/**
 * Created by Randall on 30/01/2016.
 */
class CalculatorTest extends GroovyTestCase {

    private int x
    private int y
    private Calculator c

    void setUp() {
        super.setUp()
        this.x = 5
        this.y = 3
        this.c = new Calculator(x, y)

    }

    void tearDown() {
        this.c = null
    }

    void testGetX() {
        assert this.x == this.c.getX()
    }

    void testSetX() {
        this.c.setX(x)
        assert this.x == this.c.getX()
    }

    void testGetY() {
      assert this.y == this.c.getY()
    }

    void testSetY() {
      this.c.setY(y)
      assert this.y == this.c.getY()
    }

    void testSum() { assert this.x + this.y == this.c.sum() }

    void testSubstract() { assert this.x - this.y == this.c.substract() }

    void testMultiply() { assert this.x * this.y == this.c.multiply() }

    void testDivide() { assert this.x / this.y == this.c.divide() }

    void testPower() { assert this.x ** this.y == this.c.power()}
}
