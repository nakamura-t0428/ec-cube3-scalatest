package com.shift.eccube

import java.util.concurrent.TimeUnit

import com.shift.eccube.core.ChromeDriverTrait
import com.shift.eccube.pages.LoginPage
import org.openqa.selenium.WebDriver
import org.scalatest.{BeforeAndAfterEach, FunSpec}

class LoginTest extends FunSpec with ChromeDriverTrait with BeforeAndAfterEach {
  def login(loginId:String, password:String):LoginPage = {
    val page = new LoginPage(driver)
    page.setLoginId(loginId)
    page.setPassword(password)
    page.submitPage
    page
  }

  override def beforeEach(): Unit ={
    val page = new LoginPage(driver)
    page.getPage
  }

  it("正しいアカウントでログイン後トップページへ遷移すること") {
    login("admin", "password")
    assertResult("http://192.168.99.100/admin/") {
      driver.getCurrentUrl()
    }
  }
}