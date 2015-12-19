package com.shift.eccube.pages

import org.openqa.selenium.{WebElement, WebDriver, By}

/**
  * Created by takehiro.nakamura on 2015/12/19.
  */
class LoginPage(val driver:WebDriver) {
  val url = "http://192.168.99.100/admin/"
  val txtLoginId = By.id("login_id")
  val txtPassword = By.id("password")

  def setElementString(by:By)(txt:String) = {
    val elem = driver.findElement(by)
    elem.clear
    elem.sendKeys(txt)
  }

  def getPage = driver.get("http://192.168.99.100/admin/")
  def setLoginId(loginId:String) = setElementString(txtLoginId)(loginId)
  def setPassword(password:String) = setElementString(txtPassword)(password)
  def submitPage = {
    val elem = driver.findElement(txtPassword)
    elem.submit()
  }
}
