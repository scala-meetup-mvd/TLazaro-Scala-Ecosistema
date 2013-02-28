
resolvers += "cloudbees snapshots" at "https://repository-belfry.forge.cloudbees.com/snapshot"

addSbtPlugin("xsbt-plugin-deployer" % "xsbt-plugin-deployer" % "0.1-SNAPSHOT" changing())

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.6")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.1")
