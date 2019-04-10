/**
  * Alipay.com Inc.
  * Copyright (c) 2004-2019 All Rights Reserved.
  */
package com.cassiuscai.example.flink.batch

import org.apache.flink.api.scala.ExecutionEnvironment

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
  }

}
