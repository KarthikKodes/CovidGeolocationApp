/*
    Javascript for map page 
*/
function toggleMenu() {
    document.getElementById('sidebar').classList.toggle('activate');
}
// Import the library
var Excel = require('exceljs');
var moment = require('moment');
// Define Excel filename
var ExcelFile = 'so.xlsx';

// Read from the file
var workbook = new Excel.Workbook();
workbook.xlsx.readFile(ExcelFile)
    .then(function() {
        // Use workbook
        var dataSheet = workbook.getWorksheet('Sheet 1');
        var masterSheet = workbook.getWorksheet('Sheet 2');

        dataSheet.eachRow({ includeEmpty: false }, function(row, rowNumber) {

            var dataSheetCell1 = row.getCell('A').value;
            var dataSheetCell2 = row.getCell('B').value;
            var dataSheetCell3 = row.getCell('C').value;

            masterSheet.eachRow({ includeEmpty: false }, function(row, rowNumber) {

                var masterSheetCell1 = row.getCell('A').value;
                var masterSheetCell2 = row.getCell('B').value;
                var masterSheetCell3 = row.getCell('C').value;

                // Iterate over all cells in a row (including empty cells)
                row.eachCell({ includeEmpty: false }, function(cell, colNumber) {
                    if(dataSheetCell1 == masterSheetCell1) {
                        console.log(true)
                    } else {
                        // Stop all further checks for this sheet(n) row and move onto next row
                        // Mark this failed cell as color red
                    }
                });
            });
        });

        return workbook.xlsx.writeFile('new.xlsx');
    });

