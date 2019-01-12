name := "test2"

version := "0.1"

scalaVersion := "2.12.8"

val macwire = "com.softwaremill.macwire" %% "macros" % "2.3.1" % "provided"
val playJsonDerivedCodecs = "org.julienrf" %% "play-json-derived-codecs" % "4.0.0"

lazy val test2 = (project in file("."))
    .aggregate(
        utils,
        bookWriteStoreApi,
        bookWriteStoreImpl,
        bookReadStoreApi,
        bookReadStoreImpl,
    )

lazy val utils = (project in file("modules/utils"))
    .settings(
        version := "1.0-SHAPSHOT",
        libraryDependencies ++= Seq(
            lagomScaladslApi,
            playJsonDerivedCodecs
        )
    )

lazy val bookReadStoreApi = (project in file("modules/bookreadstore-api"))
    .settings(
        version := "1.0-SNAPSHOT",
        libraryDependencies += lagomScaladslApi,
    )
    .dependsOn(
        utils,
        bookWriteStoreApi
    )

lazy val bookReadStoreImpl = (project in file("modules/bookreadstore-impl"))
    .enablePlugins(LagomScala)
    .settings(
        version := "1.0-SNAPSHOT",
        libraryDependencies ++= Seq(
            lagomScaladslPersistenceCassandra,
            macwire
        )
    )
    .dependsOn(bookReadStoreApi)

lazy val bookWriteStoreApi = (project in file("modules/bookwritestore-api"))
    .settings(
        version := "1.0-SNAPSHOT",
        libraryDependencies += lagomScaladslApi
    )
    .dependsOn(utils)

lazy val bookWriteStoreImpl = (project in file("modules/bookwritestore-impl"))
    .enablePlugins(LagomScala)
    .settings(
        version := "1.0-SNAPSHOT",
        libraryDependencies ++= Seq(
            lagomScaladslPersistenceCassandra,
            macwire
        )
    )
    .dependsOn(bookWriteStoreApi)