 const Tabletop = require('tabletop');

 var publicSpreadsheetUrl = 'https://docs.google.com/spreadsheets/d/1r1wkiPF5SF1_0x1sIcC9OXfomNEylT8a2U0RYkedHLU/edit#gid=1632900943';

function init() {
    Tabletop.init( { key: publicSpreadsheetUrl,
                     callback: showInfo,
                     simpleSheet: false } )
  }

 function showInfo(data, tabletop) {
  // do something with the data
  console.log(JSON.stringify(data, null, 2));
}

//initialise and kickstart the whole thing.
init()
