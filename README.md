# mars-rover
##Problem Description

You are part of the team that explores Mars by sending remotely controlled vehicles to the surface of
the planet. Write an idiomatic piece of software that translates the commands sent from earth to
actions executed by the rover yielding a final state.


When the rover touches down on Mars, it is initialised with its current coordinates and the direction
it is facing. These could be any coordinates, supplied as arguments _(x, y, direction)_ e.g. _(4,
2, EAST_).

The rover is given a command string which contains multiple commands. This string must then be
broken into each individual command and that command then executed. Implement the following
commands:
```
F -> Move forward on current heading
B -> Move backwards on current heading
L -> Rotate left by 90 degrees
R -> Rotate right by 90 degrees
```
An example command might be _FLFFFRFLB_
Once the full command string has been followed, the rover reports it's current coordinates and
heading in the format _(6, 4) NORTH_

## Build the project
```
gradlew clean build
```

**Version: 1.4, Last updated: 2021-02-02**

