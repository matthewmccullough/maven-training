* This demo shows an efficient use of the Maven Reactor plugin.
* Reactor homepage: http://maven.apache.org/plugins/maven-reactor-plugin/examples.html
* This was derived from the Maven EAR Archetype.
* The reactor works by spawning a copy of maven
* Objective is to build a subset of the full multiproject suite of poms

Lab Steps:
1) "mvn install" at the top level pom.  Everything succeeds.
2) "mvn reactor:make -"

mvn reactor:resume -Dmake.folders=barBusinessLogic -Dmake.goals=install,-DskipTests