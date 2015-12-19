package com.shift.eccube.core

import org.scalatest._
import util.ChromeDriverUtility

/**
  * Created by takehiro.nakamura on 2015/12/19.
  */
trait ChromeDriverTrait extends WebDriverTrait{ this:Suite =>
  override def beforeEach() {
    driver = ChromeDriverUtility.getChromeDriver()
  }
}
