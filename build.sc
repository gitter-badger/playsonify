import mill._
import mill.scalalib._
import mill.scalalib.publish._

object playsonify extends PublishModule {
  def scalaVersion = "2.12.2"
  def publishVersion = "1.0.0"

  def ivyDeps = Agg(
    ivy"com.typesafe.play::play:2.6.11",
    ivy"org.scalactic::scalactic:3.0.4"
  )

  object test extends Tests{
    def ivyDeps = Agg(
      ivy"org.scalatestplus.play::scalatestplus-play:3.1.0"
    )

    def testFramework = "org.scalatest.tools.Framework"
  }

  def pomSettings = PomSettings(
    description = "An opinionated library to help you build JSON APIs in a practical way using Play Framework ",
    organization = "com.alexitc",
    url = "https://github.com/AlexITC/playsonify",
    licenses = Seq(
      License("MIT license", "https://github.com/AlexITC/playsonify/blob/master/LICENSE")
    ),
    scm = SCM(
      "git://github.com/AlexITC/playsonify.git",
      "scm:git://github.com/AlexITC/playsonify.git"
    ),
    developers = Seq(
      Developer("AlexITC", "Alexis Hernandez","https://github.com/AlexITC")
    )
  )
}
