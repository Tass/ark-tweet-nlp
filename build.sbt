name := "CMU ARK TweetNLP: Twitter POS tagger"

organization := "edu.cmu.cs"

autoScalaLibrary := false

version := "0.3.2"

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.4",
  "commons-lang" % "commons-lang" % "2.3",
  "org.apache.commons" % "commons-math" % "2.1",
  "com.twitter" % "twitter-text" % "1.6.1",
  "org.apache.lucene" % "lucene-core" % "3.0.3",
  "com.google.guava" % "guava" % "10.0.1",
  "junit" % "junit" % "4.8.2",
  "org.hamcrest" % "hamcrest-all" % "1.1",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.0.0"
)

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomExtra := (
  <url>http://www.ark.cs.cmu.edu/TweetNLP/</url>
  <licenses>
    <license>
      <name>GPLv2</name>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/brendano/ark-tweet-nlp</url>
    <connection>scm:git://github.com/brendano/ark-tweet-nlp.git</connection>
  </scm>)
