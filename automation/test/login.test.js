const {By, Builder,Key, until} = require('selenium-webdriver');
const assert = require('assert');

const applicationUrl = "http://localhost:8080";


async function loginIntoApplication() {
    let browser = await new Builder().forBrowser('chrome').build();
    try {
        await browser.get(applicationUrl);
        await browser.wait(until.elementLocated(By.name('username')));
        await browser.findElement(By.name("username")).sendKeys("vladyslav.raikovskyi");
        await browser.findElement(By.name("password")).sendKeys("banan888XD@");
        await browser.findElement(By.name("signInSubmitButton")).submit();
        let helloWorldText = await browser.findElement(By.tagName("h1")).getText();
        return helloWorldText;
    } finally {
        await browser.quit();
    }
}

describe("login into cognito", async () => {
    it('should login into cognito ', async () => {
        const result =await loginIntoApplication();
        assert.equal(result, "Hello world");

    });
});
