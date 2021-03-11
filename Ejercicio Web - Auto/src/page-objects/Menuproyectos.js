//let In = require('../../src/steps_file.js')();
const I = actor();
let retry = { retries: 3, minTimeout: 9000 };

module.exports = {
    // insert your locators 
    fields: {
        ChanceLapt : { xpath: '//*[@class="list-group"]//a[3]' },
        AddLaptop : { xpath: '//*[contains(text(),"Sony vaio i5")]' },        
        AddtoCart : { xpath: '//*[@id="tbodyid"]/div[2]/div/a' } ,
        SeeCart: { xpath: '//*[@id="cartur"]' },
    },

    async AddCart() {
        I.retry(retry).click(this.fields.ChanceLapt);
        I.wait(3);
        I.retry(retry).click(this.fields.AddLaptop);    
        I.wait(4);
        //await I.retry(wait).seeElement(this.fields.LblG)
        I.retry(retry).click(this.fields.AddtoCart);
        I.wait(4);
        I.retry(retry).click(this.fields.SeeCart);       
        I.wait(5);
    
    },


}