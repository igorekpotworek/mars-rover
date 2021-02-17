package igorekpotworek.model

import spock.lang.Specification
import spock.lang.Unroll

import static igorekpotworek.model.Heading.*
import static igorekpotworek.model.Rover.rover

class RoverSpec extends Specification {

    @Unroll
    def "should move rover forward in the #heading"(Heading heading, Rover expected) {
        given:
        def marsRover = rover(0, 0, heading)

        when:
        def result = marsRover.moveForward()

        then:
        result == expected

        where:
        heading | expected
        NORTH   | rover(0, 1, NORTH)
        EAST    | rover(1, 0, EAST)
        SOUTH   | rover(0, -1, SOUTH)
        WEST    | rover(-1, 0, WEST)
    }

    @Unroll
    def "should move rover backwards in the #heading"(Heading heading, Rover expected) {
        given:
        def marsRover = rover(0, 0, heading)

        when:
        def result = marsRover.moveBackwards()

        then:
        result == expected

        where:
        heading | expected
        NORTH   | rover(0, -1, NORTH)
        EAST    | rover(-1, 0, EAST)
        SOUTH   | rover(0, 1, SOUTH)
        WEST    | rover(1, 0, WEST)
    }

    def "should rotate rover right"() {
        given:
        def marsRover = rover(0, 0, NORTH)

        when:
        def result = marsRover.rotateRight()

        then:
        result == rover(0, 0, EAST)
    }

    def "should rotate rover left"() {
        given:
        def marsRover = rover(0, 0, NORTH)

        when:
        def result = marsRover.rotateLeft()

        then:
        result == rover(0, 0, WEST)
    }
}
