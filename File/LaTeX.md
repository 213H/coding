## TeX
Donald Knuth 
The art of computer pragraming

Technology TeX
teTeX Unix/Linux
MiKTeX fpTeX Windows

DVI Device Independent

## LaTeX
Leslie Lamport

LaTeX文档结构

~~导言区preamble~~
\documentclass{}
\usepackage{}
~~全局设置命令~~
%comment

~~正文区~~
\begin{document}
\end{document}

## Command

terminal
texdoc pkg-name ~~seek-help~~
\LaTeX

\documentclass[options]{documentclass} ~~book, article,report,//标准文档类 {ctexart, ctexbook, ctexrep}, moderncv, beamer ~~
|:--|:--|
|article|文章:科技论文，报告，说明文档|
|report||
|book||
|proc||
|alidea||
|minimal||
\documentclass[11pt, twoside, a4paper]{article}

|options|note|
|:--|:--|
|10pt||
|a4paper, letterpaper||
|fleqn||
|leqno||
|titlepage||
|notitlepage||
|onecolumn, twocolumn||
|twoside, oneside||
|landscape||
|openright, openany||


\usepackage[options]{package-name}

\include{filename} ~~default .tex~~

\includely{filename1, filename2,...}

\usepackage{syntonly}
\syntonly ~~no DVI PDF~~

\TeX\ user ~~insert space~~

\command{parameter}[option]

\begin{environment name}{arguments}
...
\end{environment name}