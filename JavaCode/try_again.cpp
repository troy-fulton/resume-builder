
// Trying to write my first LaTeX file by file IO
#include <fstream>
#include <iostream>
#include <string>
using namespace std;

int main() {
  // simply use fstream to write to a tex file to compile online
  ofstream ofs = ofstream("my_file.tex");
  string mys = "\\documentclass{article}\n";
  mys += "\\usepackage[utf8]{inputenc}\n\n";

  mys += "\\title{try_again}\n";
  mys += "\\author{troyfulton }\n";
  mys += "\\date{June 2018}\n\n";

  mys += "\\begin{document}\n\n";

  mys += "\\maketitle\n\n";

  mys += "\\section{Introduction}\n\n";

  mys += "\\end{document}\n";

ofs << mys;
ofs.close();
}
