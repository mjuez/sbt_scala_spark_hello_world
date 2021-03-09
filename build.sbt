name := "spark_hw"
version := "1.0.0"
organization := "ubu.admirable"
licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))
scalaVersion := "2.12.10"

// plugin spark packages
sparkVersion := "3.0.1"
sparkComponents += "mllib"
