package com.cassiuscai.example.flink.batch

import java.util

import org.apache.flink.api.scala.ExecutionEnvironment
import org.apache.spark.sql.DataFrame

import scala.collection.JavaConverters._

/**
  * FlinkBatchExample
  *
  * @author Cassius Cai
  * @version Id: FlinkBatchExample 2019-04-10 v0.1 Exp $
  */
object FlinkBatchExample {

  def main(args: Array[String]): Unit = {
    val env = ExecutionEnvironment.createLocalEnvironment(10)
    val data = env.readTextFile("pom.xml")
    val lines = data.collect().map(it => 1).sum
    print(s"lines:$lines")

    val a = new util.ArrayList[String]().asScala: _*

    val b = new util.HashSet[String]().asScala
    val df:DataFrame = null;
    val javaSet = new util.HashSet[String]()
    val javaList = new util.ArrayList[String]()
    val scalaSet = Set("1","2")
    val scalaList = List("1","2")

    df.describe(javaSet.asScala.toSeq: _*)
    df.describe(javaList.asScala: _*)
    df.describe(scalaSet.toSeq: _*)
    df.describe(scalaList: _*)
  }
}
