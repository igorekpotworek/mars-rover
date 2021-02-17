package igorekpotworek.model

import spock.lang.Specification

class VectorTest extends Specification {

    def "should multiply vector by a scalar"(int scalar, Vector expected) {
        given:
        def vector = Vector.vector(5, 6)

        when:
        def result = vector * scalar

        then:
        result == expected

        where:
        scalar | expected
        1      | Vector.vector(5, 6)
        2      | Vector.vector(10, 12)
        -1     | Vector.vector(-5, -6)

    }
}
