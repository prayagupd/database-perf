name := "database-entertainment"

version := "1.0"

scalaVersion := "2.12.8"

scalacOptions ++= Seq(
  "-Ypartial-unification",
  "-feature",
//  "-Xfatal-warnings"
)

val LogbackVersion = "1.2.3"

val DoobieVersion = "0.7.0"

libraryDependencies ++= Seq(

  "org.tpolecat" %% "doobie-core" % DoobieVersion,

  "ch.qos.logback" % "logback-classic" % LogbackVersion % "runtime",
  "ch.qos.logback" % "logback-core" % LogbackVersion,
  "net.logstash.logback" % "logstash-logback-encoder" % "5.2",
  "org.tpolecat" %% "doobie-h2" % DoobieVersion, // H2 driver 1.4.197 + type mappings.
  "org.tpolecat" %% "doobie-hikari" % DoobieVersion, // HikariCP transactor.
  "org.tpolecat" %% "doobie-postgres" % DoobieVersion, // Postgres driver 42.2.5 + type mappings.

  "com.h2database" % "h2" % "1.4.197",
  "org.tpolecat" %% "doobie-specs2" % DoobieVersion % "test", // Specs2 support for typechecking statements.
  "org.tpolecat" %% "doobie-scalatest" % DoobieVersion % "test", // ScalaTest support for typechecking statements.

  "dev.zio" %% "zio" % "1.0.0-RC8-6",

  "com.zaxxer" % "HikariCP" % "3.3.1",
  "org.postgresql" % "postgresql" % "42.2.6",
  "com.amazon.redshift" % "redshift-jdbc42" % "1.2.10.1009",
  "mysql" % "mysql-connector-java" % "8.0.11",

  "org.scalatest" %% "scalatest" % "3.0.4",
)

resolvers ++= Seq(
  "maven2" at "http://central.maven.org/maven2",
  "redshift" at "http://redshift-maven-repository.s3-website-us-east-1.amazonaws.com/release"
)

enablePlugins(DockerComposePlugin)
