const steps = require("./src/features");

exports.config = {
    output: './report',
    helpers: {
        Puppeteer: {
            windowSize: "1350x970",
            url: "https://www.demoblaze.com",
            waitForAction: 500,
            waitForNavigation: ["domcontentloaded", "networkidle0"],
            show: true
        },

        PuppeteerHelper: {
            require: "./src/helpers/helperPuppeteer.js",
            defaultHost: "https://www.demoblaze.com"

        },
        Mochawesome: {
            uniqueScreenshotNames: true
        }
    },
    include: {},
    mocha: {
        reporterOptions: {
            reportDir: "./report/",
            reportFilename: 'FileReport',
            reportTitle: 'Demoblazer',
            autoOpen: true,
            ts: '',
        }
    },
    bootstrap: null,
    teardown: null,
    hooks: [],
    gherkin: {
        features: './src/features/**/**/*.feature',
        steps: [
            ...steps
        ]
    },
    plugins: {
        allure: {},
        screenshotOnFail: {
            enabled: true
        }
    },
    tests: './tests/*_test.js',
    name: 'DemoBlazer',
    multiple: {
        parallel: {
            chunks: 1
        }
    }


}

//console.log(module.exports.config)