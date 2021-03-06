# CITE Application

A single-page browser application for exploring citable resources, written in [Scala.js](http://www.scala-js.org/).

## Current version: 1.3.3

See [release notes](releases.md).

## License

[GPL 3.0](https://opensource.org/licenses/gpl-3.0.html)

CITE Application, by default, downloads a sample corpus of texts. Licensing and attribution for those texts is available in the [downloads directory](downloads).

## Using

CITE Application is a single web page you can open in a browser. Precompiled versions are available in the [downloads directory](downloads), and named `cite-VERSION.html`.

## Building, testing

CITE Application is targetted for Scala 2.11.You can use normal `sbt` using normal tasks for [ScalaJS projects](https://www.scala-js.org/doc/project/building.html) such as  `sbt fastOptJS` or `sbt fullOptJS`.

If `sbt fastOptJS` completes successfully, run the app by opening `CITE-App/target/scala-2.11/classes/index-dev.html` in your browser.

If `sbt fullOptJS` completes successfully, run the app by opening `CITE-App/target/scala-2.11/classes/index-opt.html` in your browser.

In addition, the project defines a custom `spa` task that builds a single-page application named `cite-VERSION.html` (where `VERSION` is the current version defined in `build.sbt`), in the `downloads` directory.

If `sbt fastOptJS` completes successfully, run the app by opening `CITE-App/target/scala-2.11/classes/index-dev.html` in your browser.

If `sbt fullOptJS` completes successfully, run the app by opening `CITE-App/target/scala-2.11/classes/index-opt.html` in your browser.

## Python SimpleServer

`python -m SimpleHTTPServer`


## Credits

CITEApplication, © 2017, Neel Smith and Christopher Blackwell. Available for use, modification, and distribution under the terms of the [GPL 3.0](https://opensource.org/licenses/gpl-3.0.html) license. Based on the CITE and CTS protocols, by Neel Smith and Christopher Blackwell.
