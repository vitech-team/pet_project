const {By, Builder,Key, until} = require('selenium-webdriver');
const assert = require('assert');

const applicationUrl = "http://localhost:8080";



async function getTitle() {
    let browser = await new Builder().forBrowser('chrome').build();
    try {
        await browser.get(applicationUrl);
        return browser.getTitle();
    }
    finally {
        await browser.quit();
    }
}


describe("get page title", async () => {
    it('should return redirect title', async() => {
        const titleName = await getTitle();
        assert.equal(titleName, "Signin");
    });
});
