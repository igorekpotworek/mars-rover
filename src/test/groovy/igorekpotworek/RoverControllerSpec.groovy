package igorekpotworek

import spock.lang.Specification

import static igorekpotworek.model.Heading.EAST

class RoverControllerSpec extends Specification {

    def "should move rover"() {
        given:
        def marsRover = new RoverController(4, 2, EAST)

        when:
        def roverAfterFirstMove = marsRover.move("FLFFFRFLB")

        then:
        roverAfterFirstMove == "(6, 4) NORTH"

        when:
        def roverAfterSecondMove = marsRover.move("RRFFLBRB")

        then:
        roverAfterSecondMove == "(5, 3) SOUTH"
    }


    def "should throw if wrong command"() {
        given:
        def marsRover = new RoverController(4, 2, EAST)

        when:
        marsRover.move("FLFFFRAFLB")

        then:
        thrown(IllegalArgumentException)
    }
}
