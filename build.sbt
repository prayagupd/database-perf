name := "database-perf"

version := "1.0"

scalaVersion := "2.12.7"

scalacOptions ++= Seq(
  "-Ypartial-unification"
)

libraryDependencies ++= Seq(

  // Start with this one
  "org.tpolecat" %% "doobie-core" % "0.6.0",

  // And add any of these as needed
  "org.tpolecat" %% "doobie-h2" % "0.6.0", // H2 driver 1.4.197 + type mappings.
  "org.tpolecat" %% "doobie-hikari" % "0.6.0", // HikariCP transactor.
  "org.tpolecat" %% "doobie-postgres" % "0.6.0", // Postgres driver 42.2.5 + type mappings.
  "org.tpolecat" %% "doobie-specs2" % "0.6.0" % "test", // Specs2 support for typechecking statements.
  "org.tpolecat" %% "doobie-scalatest" % "0.6.0" % "test", // ScalaTest support for typechecking statements.

  "org.scalaz" %% "scalaz-zio" % "0.3.1",
  "mysql" % "mysql-connector-java" % "8.0.11",
  "org.scalatest" %% "scalatest" % "3.0.4"
)
