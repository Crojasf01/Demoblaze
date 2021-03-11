const I = actor();
let retry = { retries: 3, minTimeout: 9000 };

module.exports = {
    // insert your locators
    fields: {
        //SigUP
        SigUp : { xpath: '//*[@id="signin2"]' },
        Username : { xpath: '//*[@id="sign-username"]' },
        Password : { xpath: '//*[@id="sign-password"]' },
        BtnSignUp : { xpath: '//*[@id="signInModal"]//div[3]//button[2]' },

        //LogIN  
        LogIN : { xpath: '//*[@id="login2"]' }, 
        Userp : { xpath: '//*[@id="loginusername"]' },
        Passp : { xpath: '//*[@id="loginpassword"]' },
        BtnLoginIN : { xpath: '//*[@onclick="logIn()"]' },

        //LogOUT
        LogOUT : { xpath: '//*[@id="logout2"]' },        
    },


    //methods here
    async SigUP(username, password) 
    {
        console.log('Deseo abrir la siguiente pagina : ');
        I.retry(retry).amOnPage('https://www.demoblaze.com');
        I.wait(1);
        I.retry(retry).click(this.fields.SigUp);
        I.wait(1);
        I.retry(retry).appendField(this.fields.Username,username);
        I.wait(1);
        I.retry(retry).appendField(this.fields.Password,password);
        I.wait(1);
        I.retry(retry).click(this.fields.BtnSignUp);
        I.wait(2);
      
    },

    async LogIN(User, Passw) 
    {   
        await console.log('Deseo abrir la siguiente pagina : ');
        I.retry(retry).amOnPage('https://www.demoblaze.com');
        I.retry(retry).click(this.fields.LogIN);
        I.wait(1);
        I.retry(retry).appendField(this.fields.Userp,User);
        I.wait(1);
        I.retry(retry).appendField(this.fields.Passp,Passw);
        I.wait(1);
        I.retry(retry).click(this.fields.BtnLoginIN);
        I.wait(2);      
    },

    async LogOUT() 
    {
        await I.retry(retry).click(this.fields.LogOUT);
        I.wait(3);
        

      
    },

}


