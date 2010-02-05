# Maven Site Archetype
Maven site projects produce an HTML report of coders, contributors, code coverage, dependencies and more.

Details about this plugin and its latest released version can be found [on its homepage.](http://maven.apache.org/plugins/maven-archetype-plugin/project-summary.html)

## Goal
Create a Maven site project from scratch, then familiarize yourself with and explore the `/src/site/` directory artifacts.

## Start
1. From the start directory, type `mvn archetype:generate` and choose the **maven-archetype-site-simple**.  This is a very basic site setup.
   1. When prompted, answer with `groupid=com.mycompany`, `artifactid=site-simple`, and accept the default version.
2. From the start directory, type `mvn archetype:generate` and choose the **maven-archetype-site**.  This is a more fully-fledged site setup.
   1. When prompted, answer with `groupid=com.mycompany`, `artifactid=site-complex`, and accept the default version.

_Extra exploration: You can invoke a specific version of the archetype plugin by typing `mvn org.apache.maven.plugins:maven-archetype-plugin:2.0-alpha-4:generate`_


## Solution
There are two is sample site archetype was instantiated in a clean directory.  It was not layered onto an existing packaging=pom project, though this is possible as a stretch goal for this lab.