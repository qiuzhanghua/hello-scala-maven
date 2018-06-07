package com.github.qiuzhanghua

object Hello {
  def main(args: Array[String]): Unit = {
    val bean = new HelloBean("Message")
    println(bean)
  }
}

// mvn scala:run -DmainClass=com.github.qiuzhanghua.Hello
