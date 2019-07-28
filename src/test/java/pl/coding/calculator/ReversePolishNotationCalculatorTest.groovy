package pl.coding.calculator

import spock.lang.Specification

class ReversePolishNotationCalculatorTest extends Specification {

    def 'some inputs some outputs'() {
        given:
        def calculator = new ReversePolishNotationCalculator()

        expect:
        calculator.calculateValue(someString) == result

        where:
        someString  | result
        '2 3 +'     | 5
        '-2 -3 *'   | 6
        '3 4 5 * -' | -17
    }

}
