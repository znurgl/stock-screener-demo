import org.apache.spark.SparkContext

object App {
  def main(args: Array[String]) {
    val logFile = "build.sbt"
    val sc = new SparkContext("local", "Data Processor")
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(_.contains("a")).count()
    val numBs = logData.filter(_.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }
}
