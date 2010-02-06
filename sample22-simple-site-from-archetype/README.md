# Maven Site Archetype
Maven site projects produce an HTML report of coders, contributors, code coverage, dependencies and more.

Details about this plugin and its latest released version can be found [on its homepage.](http://maven.apache.org/plugins/maven-archetype-plugin/project-summary.html)

## Goal
Create a Maven site project from scratch, then familiarize yourself with and explore the `/src/site/` directory artifacts.

## Start

### Simple Site
1. From the `start` directory, type `mvn archetype:generate` and choose the **maven-archetype-site-simple**.  This is a very basic site setup.
   1. When prompted, answer with `groupid=com.mycompany`, `artifactid=site-simple`, and accept the default version.
   2. Explore the directory structure.
   3. Type `mvn site` and watch the site files get created in the `target` directory.
   4. With your file explorer, browse into the `target/site` directory and double-click the index.html file
   4. Type `mvn site:run` and watch the site get run in an embedded Jetty container.
   5. Browse to [`http://localhost:8080`](http://localhost:8080) to see the site in your browser.

### Complex Site
1. From the `start` directory, type `mvn archetype:generate` and choose the **maven-archetype-site**.  This is a more fully-fledged site setup.
   1. When prompted, answer with `groupid=com.mycompany`, `artifactid=site-complex`, and accept the default version.
   2. Explore the directory structure.
   3. Type `mvn site` and watch the site files get created in the `target` directory.
   4. With your file explorer, browse into the `target/site` directory and double-click the index.html file
   4. Type `mvn site:run` and watch the site get run in an embedded Jetty container.
   5. Browse to [`http://localhost:8080`](http://localhost:8080) to see the site in your browser.

### Site on a basic app project
1. Open a command prompt at the `start/basic-app` directory.
2. Type `mvn site` and watch the basic site structure get generated.
3. Open the `target/site/index.html` file in your web browser and explore the basic reports.
4. Open the `pom.xml` in your text editor and add the following section right before the closing `</project>` tag.
   <reporting>
     <plugins>
       <plugin>
         <version>2.1</version>
         <artifactId>maven-jxr-plugin</artifactId>
         <configuration>
           <aggregate>true</aggregate>
         </configuration>
       </plugin>
     </plugins>
   </reporting>
5. Regenerate the site via `mvn site` and refresh the `target/site/index.html` file in your web browser.
6. Notice the new reports at the bottom of the tree view on the left. Click and explore.


## Extra Exploration 1
You can invoke a __specific__ version of the archetype plugin by typing `mvn org.apache.maven.plugins:maven-archetype-plugin:2.0-alpha-4:generate`_

## Extra Exploration 2
The solution site archetypes were instantiated in clean directories.  They were not layered onto an existing `packaging=pom` project.  The Maven site archetype is one of the few _layerable_ archetypes in that it can be run on an existing `packaging=pom` project.  Note that in this usage, it does not alter the `pom.xml` file.