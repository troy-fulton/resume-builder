// Source Code for the Resume Builder
// Property of Troy Fulton
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;

class ResumeBuilder {
  public static void generateResume() {
    File f = new File("myFile.tex");
    try {
      String myString = "\\documentclass{article}\n\\usepackage[utf8]"+
              "{inputenc}\n\n\\title{try_again}\n\\author{troyfulton }\n"+
              "\\date{June 2018}\n\n\\begin{document}\n\n"+
              "\\maketitle\n\n\\section{Introduction}\n\n"+
              "\\end{document}\n";
      PrintWriter pWriter = new PrintWriter (f);
      pWriter.printf(myString);
      pWriter.close();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
