const {Builder, By, Key, until} = require('selenium-webdriver');
const assert = require('assert');
const config = require("../config/config").get(process.env.NODE_ENV);


async function loginWithFirefox() {
  let driver = await new Builder().forBrowser('firefox').build();
  try {
    await driver.get(config.base_uri);
    await driver.findElement(By.xpath('/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[1]/input')).sendKeys('ui.test.run', Key.RETURN);
    await driver.findElement(By.xpath('/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[2]/input')).sendKeys('Qwerty1@', Key.RETURN);
    await driver.wait(until.elementLocated(By.xpath("/html/body/div/div/header/h1")));
    let helloWorldText = await driver.findElement(By.tagName("h1")).getText();
    return helloWorldText;
  } finally {
    await driver.quit();
  }
}


describe("login into cognito with Firefox", async ()=>{
  it('should login into cognito with Firefox', async () => {
             const result = await loginWithFirefox();
             assert.equal(result, "Hello world");
  });
});
