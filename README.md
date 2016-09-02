# Score Follower software
Built by Bairong Han <b.han@se15.qmul.ac.uk>
(This is a highly confidential code with strict copyright.

Regarding to how to use/run the score-follow function is top secret.

Congratulations if you successfully discover the whole thing completely by yourself - if you did so, please contact me immediately.)


## Location
http://github.com/volnanto/scorefollower

## Usage
There are two main parts of the software, a webserver which acts as a websocket interface between the score following application, and the score following application itself.

### webserver

This is a netbeans application (version 8.1 is OK to use), and to run it use:

> ~/netbeans-8.1/bin/netbeans --jdkhome /usr/lib/jvm/java-8-oracle

By default, it uses a Glassfish webserver running on port 8080. To change this, go to the Glassfish control server at http://localhost:4848 and choose:

Configuration -> Server-config -> network listeners, and change http-listener-1 to the correct port.

The application will launch a webpage which can be used to test the scorefollower connection. (If you change the Glassfish port, you will need to change the port in the javascript.js file as well.)

### Score Follower

This is an Eclipse project which compares an audio file (or live input) against a known reference recording whose timings have been marked up by hand. The Main entry point is in match-0.9.4-src/bin/at/ofai/music/match/PerformanceMatcher.java, and the websocket interface code is in match-0.9.4-src/bin/at/ofai/music/match/ScrollingMatrix.java

The project can be converted into an executable Java file by using the File -> Export option in Eclipse, with the PerformanceMatcher profile selected.
To run the exported executable (matcher.jar) in live mode, call:

> java -cp matcher.jar at.ofai.music.match.PerformanceMatcher -v -rl

It is currently configured to output timing information for Elgar's Sospiri, and outputs the name of a preconfigured score image, which needs to be hosted elsewhere if this is being used to drive a VenueExplorer score instance.
