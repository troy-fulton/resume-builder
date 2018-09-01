// For generation of the tex file (my resume)

var myFile = new File("mytex.tex");
var myMessage = "\\documentclass{article}";

myFile.open("w");
myFile.writeln(myMessage);
myFile.close();
