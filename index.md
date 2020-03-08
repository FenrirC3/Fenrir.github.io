<html>
<head>
<meta charset="UTF-8">
<title>Untitled Document</title>
</head>

<body>
<script src='https://cdnjs.cloudflare.com/ajax/libs/tabletop.js/1.5.1/tabletop.min.js'></script>
<script type='text/javascript'>    
  var publicSpreadsheetUrl = 'https://docs.google.com/spreadsheets/d/1r1wkiPF5SF1_0x1sIcC9OXfomNEylT8a2U0RYkedHLU/edit#gid=1632900943';

  function init() {
    Tabletop.init( { key: publicSpreadsheetUrl,
                     callback: showInfo,
                     simpleSheet: true } )
  }

  function showInfo(data, tabletop) {
    alert('Successfully processed!')
    console.log(data);
  }

  window.addEventListener('DOMContentLoaded', init)
</script>
</body>
</html>
