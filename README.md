# fhir-xml-emf

![Java CI with Maven](https://github.com/dwagelaar/fhir-xml-emf/actions/workflows/maven.yml/badge.svg)

FHIR-XML implementation for EMF.

## Installation

For Maven projects, add the following to your POM:

```
<repositories>
	<repository>
		<id>fhir-xml-emf</id>
		<name>fhir-xml-emf GitHub Packages</name>
		<url>https://raw.github.com/dwagelaar/fhir-xml-emf/repository/</url>
	</repository>
</repositories>

<dependencies>
	<dependency>
		<groupId>org.hl7.emf.fhir</groupId>
		<artifactId>org.hl7.emf.fhir</artifactId>
		<version>5.0.0</version>
	</dependency>
</dependencies>
```

For use with the Eclipse IDE:
  * Download the zipped update site file from the [latest release](https://github.com/dwagelaar/fhir-xml-emf/releases/latest).
  * In Eclipse, select Help -> Install New Software...
  * In the Install dialog, click Add... to open the Add Repository dialog.
  * In the Add Repository dialog, click Archive..., select the downloaded zip file, then click Add.
  * Back in the Install dialog, select "FHIR-XML implementation for EMF", and go through the wizard.


