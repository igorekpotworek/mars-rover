package igorekpotworek.model

import spock.lang.Specification
import spock.lang.Unroll

import static igorekpotworek.model.Heading.*

class HeadingSpec extends Specification {

    @Unroll
    def "should rotate right #heading"(Heading heading, Heading expected) {
        expect:
        heading.rotateRight() == expected

        where:
        heading | expected
        NORTH | EAST
        EAST  | SOUTH
        SOUTH | WEST
        WEST  | NORTH
    }

    @Unroll
    def "should rotate left from the #heading"(Heading heading, Heading expected) {
        expect:
        heading.rotateLeft() == expected

        where:
        heading | expected
        NORTH | WEST
        WEST  | SOUTH
        SOUTH | EAST
        EAST  | NORTH
    }
}
