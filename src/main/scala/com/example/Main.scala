package com.example

import com.twitter.logging.{ConsoleHandler, Level, Logger, LoggerFactory}
import com.twitter.util.{Duration, Time, Timer, TimerTask}
import com.twitter.conversions.time._
import com.twitter.app.App

object Main extends App {
  LoggerFactory(
    node = "",
    level = Some(Level.INFO),
    handlers = ConsoleHandler() :: Nil
  ).apply()

  private val log = Logger.get(getClass)

  log.info("Hello World!")
  log.info("Using logger %s", log)
}
