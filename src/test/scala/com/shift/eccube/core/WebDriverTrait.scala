package com.shift.eccube.core

import core.ChromeDriverTest
import org.openqa.selenium.WebDriver
import org.scalatest.BeforeAndAfterEach
import org.scalatest._

/**
  * Created by takehiro.nakamura on 2015/12/19.
  */
trait WebDriverTrait extends BeforeAndAfterEach{ this: Suite =>
  protected var driver:WebDriver = null
  override def afterEach(): Unit = {
    driver.quit()
  }
}
