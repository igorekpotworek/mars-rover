package igorekpotworek.model

import spock.lang.Specification

import static igorekpotworek.model.Vector.vector

class CoordinatesTest extends Specification {

    def "should move by a vector"() {
        given:
        def coordinates = Coordinates.coordinates(4, 6)
        def vector = vector(5, 6)

        when:
        def result = coordinates.move(vector)

        then:
        result == Coordinates.coordinates(9, 12)
    }
}
