package io.sdkman.changelogs

import com.github.mongobee.changeset.{ChangeLog, ChangeSet}
import com.mongodb.client.MongoDatabase

@ChangeLog(order = "027")
class MuleFlowDiagramsMigrations {

  @ChangeSet(
    order = "001",
    id = "001_add_muleflowdiagrams_candidate",
    author = "manikmagar"
  )
  def migration001(implicit db: MongoDatabase): Candidate = {
    Candidate(
      candidate = "muleflowdiagrams",
      name = "Mule Flow Diagrams",
      description =
        "Mule application is a collection of multiple flows and sub-flows, spread across multiple configuration files. This Mule Flow Diagrams application lets you generate flow dependency graph and diagrams for your mule applications.",
      websiteUrl = "https://github.com/manikmagar/mule-flow-diagrams/",
      distribution = "UNIVERSAL"
    ).insert()
  }
}
