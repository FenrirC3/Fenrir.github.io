function init() {
  Tabletop.init( {
    key: 'https://docs.google.com/spreadsheets/d/1r1wkiPF5SF1_0x1sIcC9OXfomNEylT8a2U0RYkedHLU/pubhtml',
    simpleSheet: true }
  ).then(function(data, tabletop) { 
    console.log(data)
  })
}
window.addEventListener('DOMContentLoaded', init)
