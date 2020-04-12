

## Requirements

* Download and build to local maven repo master branch of https://github.com/dmatej/arquillian-junit5-extension (clone and run `mvn install`)
* Clone Batch TCK from https://ondromih@github.com/OndroMih/batch-tck.git to parent directory and switch to the branch poc-junit5

## How it works

1. uses usual Arquillian dependencies as for JUnit4, except the JUnit4 runner
2. uses an experimental Arquillian JUnit5 extension built in local maven repo
3. uses an Arquillian extension specific for Batch TCK to create a deployment for each test
3. enables the Arquillian extension by setting `junit.jupiter.extensions.autodetection.enabled` sys prop to true in pom.xml and by creating a service file for the extension class because it doesn't exist in the extention artifact

# How to run the TCK

* start Payara Server at localhost before running the tests
* run the test suite with

```
mvn clean verify
```