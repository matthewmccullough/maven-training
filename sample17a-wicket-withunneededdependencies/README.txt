This project provides a chance to demonstrate the maven dependency plugin tools:

mvn dependency:tree (reports the dependency managed commons-collections 3.2.1 version overrides transitive 3.2, which is directly requested as 3.1)


mvn dependency:resolve-plugins

[INFO]     Plugin Dependency Resolved: jetty-6.1.15.rc5.jar
[INFO]     Plugin Dependency Resolved: maven-project-2.0.3.jar
[INFO]     Plugin Dependency Resolved: maven-plugin-api-2.0.3.jar
[INFO]     Plugin Dependency Resolved: maven-artifact-2.0.3.jar
[INFO]     Plugin Dependency Resolved: maven-plugin-tools-api-2.0.jar
[INFO]     Plugin Dependency Resolved: jetty-plus-6.1.15.rc5.jar
[INFO]     Plugin Dependency Resolved: jetty-naming-6.1.15.rc5.jar
[INFO]     Plugin Dependency Resolved: jetty-management-6.1.15.rc5.jar
[INFO]     Plugin Dependency Resolved: jsp-2.1-jetty-6.1.15.rc5.jar
[INFO]     Plugin Dependency Resolved: jetty-annotations-6.1.15.rc5.jar
[INFO]     Plugin Dependency Resolved: start-6.1.15.rc5.jar 


mvn dependency:go-offline 

mvn dependency:analyze

[INFO] [dependency:analyze]
[WARNING] Unused declared dependencies found:
[WARNING]    org.slf4j:slf4j-log4j12:jar:1.4.2:compile
[WARNING]    log4j:log4j:jar:1.2.14:compile
[WARNING]    org.mortbay.jetty:jetty-management:jar:6.1.4:provided
[WARNING]    org.apache.wicket:wicket-extensions:jar:1.3.2:compile
[WARNING]    commons-collections:commons-collections:jar:3.1:compile


mvn dependency:analyze-dep-mgt (which reports our override and unused declared dependencies)



And to show the otherwise ignored Direct Overrides (dependencies section) of our Dependency Management declared versions:
mvn dependency:analyze-dep-mgt -Dmdep.analyze.ignore.direct=false


Reference:
http://maven.apache.org/plugins/maven-dependency-plugin/analyze-dep-mgt-mojo.html