const {By, Builder,Key, until} = require('selenium-webdriver');
const assert = require('assert');

const config = require("../config/config").get(process.env.NODE_ENV);




async function getTitle() {
    let browser = await new Builder().forBrowser('chrome').build();
    try {
        await browser.get(config.base_uri);
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
