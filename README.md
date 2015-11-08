# Gobblin [![Build Status](https://secure.travis-ci.org/linkedin/gobblin.png)](https://travis-ci.org/linkedin/gobblin)

Gobblin 是 Hadoop 通用数据摄取框架，可以从各种数据源中提取，转换和加载海量数据。比如：数据库，rest APIs，filers，等等。Gobblin 处理日常规划任务需要所有数据摄取 ETLs，包括作业/任务规划，任务分配，错误处理，状态管理，数据质量检测，数据发布等等。

Gobblin 通过同样的执行框架从不同数据源摄取数据，在同一个地方管理所有不同数据源的元数据。同时结合了其他特性，比如自动伸缩，容错，数据质量保证，可扩展和处理数据模型改革等等。Gobblin 变得更容易使用，是个高效的数据摄取框架。.

## 文档

从如下链接下载 Gobblin 文档 [https://github.com/linkedin/gobblin/wiki](https://github.com/linkedin/gobblin/wiki).

## Getting Started

### 搭建 Gobblin 环境

Download or clone the Gobblin repository (say, into `/path/to/gobblin`) and run the following command:

	$ cd /path/to/gobblin
	$ ./gradlew clean build

After Gobblin is successfully built, you will find a tarball named `gobblin-dist.tar.gz` under the project root directory. Copy the tarball out to somewhere and untar it, and you should see a directory named `gobblin-dist`, which initially contains three directories: `bin`, `conf`, and `lib`. Once Gobblin starts running, a new subdirectory `logs` will be created to store logs.

### Building against a Specific Hadoop Version

Gobblin uses the Hadoop core libraries to talk to HDFS as well as to run on Hadoop MapReduce. Because the protocols have changed in different versions of Hadoop, you must build Gobblin against the same version that your cluster runs. By default, Gobblin is built against version 1.2.1 of Hadoop 1, and against version 2.3.0 of Hadoop 2, but you can choose to build Gobblin against a different version of Hadoop.

The build command above will build Gobblin against the default version 1.2.1 of Hadoop 1. To build Gobblin against a different version of Hadoop 1, e.g., 1.2.0, run the following command:

	$ ./gradlew clean build -PhadoopVersion=1.2.0

To build Gobblin against the default version (2.3.0) of Hadoop 2, run the following command:

	$ ./gradlew clean build -PuseHadoop2

To build Gobblin against a different version of Hadoop 2, e.g., 2.2.0, run the following command:

	$ ./gradlew clean build -PuseHadoop2 -PhadoopVersion=2.2.0


### Running Gobblin

Out of the box, Gobblin can run either in standalone mode on a single box or on Hadoop MapReduce. Please refer to the page [Gobblin Deployment](https://github.com/linkedin/gobblin/wiki/Gobblin%20Deployment) in the documentation for an overview of the deployment modes and how to run Gobblin in different modes.

### Running the Examples

Please refer to the page [Getting Started](https://github.com/linkedin/gobblin/wiki/Getting%20Started)
in the documentation on how to run the examples.

## Configuration

Please refer to the page [Configuration Glossary](https://github.com/linkedin/gobblin/wiki/Configuration%20Properties%20Glossary)
in the documentation for an overview on the configuration properties of Gobblin.
