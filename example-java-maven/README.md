This example demonstrates how to analyze a simple Java Maven project.

Prerequisites
=============
* [SonarQube](https://docs.sonarqube.org/latest/) 8.4+
* Maven 3.x or higher

Usage
=====
* Build the project:

        mvn clean install

* Analyze it with SonarQube using Maven:

        mvn sonar:sonar
