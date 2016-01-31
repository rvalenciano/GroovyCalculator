/**
 * Created by Randall on 30/01/2016.
 */
class Calculator {

    private int x
    private int y

    Calculator(int x, int y) {
        this.x = x
        this.y = y
    }

    int getX() {
        return x
    }

    void setX(int x) {
        this.x = x
    }

    int getY() {
        return y
    }

    void setY(int y) {
        this.y = y
    }

    def sum() {
      this.x + this.y
    }

    def substract() {
     this.x - this.y
    }

    def multiply() {
      this.x * this.y
    }

    def divide() {
      this.x / this.y
    }

    def power() {
        this.x ** this.y
    }


}
