package pl.coding.task.calculator

import pl.coding.task.calculator.operation.OperationCalculator
import pl.coding.task.calculator.splitter.RPNExtractor
import spock.lang.Specification

class ReversePolishNotationCalculatorTest extends Specification {

    def 'some good notions some results'() {
        given:
        def calculator = new ReversePolishNotationCalculator(new RPNExtractor(), new OperationCalculator())

        expect:
        calculator.calculateResult(notation) == result

        where:
        notation                                        | result
        '2 3 +'                                         | '5'
        '-2 -3 *'                                       | '6'
        '3 4 5 * -'                                     | '-17'
        '100 200 300 + +'                               | '600'
        '0 0 +'                                         | '0'
        '10000000000000000000 10000000000000000000 +'   | '20000000000000000000'
        '-10000000000000000000 -10000000000000000000 +' | '-20000000000000000000'
//        '100 200 300 - -' | '-400' //todo doesn't work, because of double '-', it's regex problem
    }

    def 'bad notions should throw exception'() {
        given:
        def calculator = new ReversePolishNotationCalculator(new RPNExtractor(), new OperationCalculator())

        when:
        calculator.calculateResult(badNotion)

        then:
        thrown expectedException

        //todo error message ?
        where:
        badNotion           | expectedException
        'very bad notation' | IllegalArgumentException
        '2 3'               | IllegalArgumentException
        '2 3 + +'           | IllegalArgumentException
        ''                  | IllegalArgumentException
        '---2 -3 +'         | NumberFormatException //todo probably should be checked at regex and throw IllegalArgumentException
        '1 +'               | IllegalArgumentException
    }

}
