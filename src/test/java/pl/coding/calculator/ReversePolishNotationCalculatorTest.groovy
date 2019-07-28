package pl.coding.calculator


import pl.coding.calculator.splitter.RPNSplitter
import spock.lang.Specification

class ReversePolishNotationCalculatorTest extends Specification {

    def 'some good notions some results'() {
        given:
        def calculator = new ReversePolishNotationCalculator(new RPNSplitter())

        expect:
        calculator.calculateValue(notation) == result

        where:
        notation    | result
        '2 3 +'     | 5
        '-2 -3 *'   | 6
        '3 4 5 * -' | -17
    }

    def 'bad notions should throw exception'() {
        given:
        def calculator = new ReversePolishNotationCalculator(new RPNSplitter())

        when:
        calculator.calculateValue(badNotion)

        then:
        thrown expectedException

        where:
        badNotion           | expectedException
        'very bad notation' | IllegalArgumentException
        '2 3'               | IllegalArgumentException
        '2 3 + +'           | IllegalArgumentException
    }

}
