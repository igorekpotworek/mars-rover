package igorekpotworek.model

import spock.lang.Specification

class CoordinatesTest extends Specification {

    def "should move by a vector"(Coordinates coordinates, Vector vector, Coordinates expected) {
        when:
        def result = coordinates.move(vector)

        then:
        result == expected

        where:
        coordinates                   | vector                | expected
        Coordinates.coordinates(4, 6) | Vector.vector(5, 6)   | Coordinates.coordinates(9, 12)
        Coordinates.coordinates(3, 1) | Vector.vector(-1, -4) | Coordinates.coordinates(2, -3)
        Coordinates.coordinates(3, 1) | Vector.vector(0, 0)   | Coordinates.coordinates(3, 1)

    }
}
