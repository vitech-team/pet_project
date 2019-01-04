const {By, Builder,Key, until} = require('selenium-webdriver');
const assert = require('assert');
const config = require("../config/config").get(process.env.NODE_ENV);


async function loginIntoApplication() {
    let browser = await new Builder().forBrowser('chrome').build();
    try {
        await browser.get(config.base_uri);
        await browser.wait(until.elementLocated(By.name('username')));
        await browser.findElement(By.name("username")).sendKeys("ui.test.run");
        await browser.findElement(By.name("password")).sendKeys("Qwerty1@");
        await browser.findElement(By.name("signInSubmitButton")).submit();
        let helloWorldText = await browser.findElement(By.tagName("h1")).getText();
        return helloWorldText;
    } finally {
        await browser.quit();
    }
}

describe("login into cognito with Chrome", async () => {
    it('should login into cognito with Chrome', async () => {
        const result =await loginIntoApplication();
        assert.equal(result, "Hello world");

    });
});
