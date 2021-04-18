## TeX
Donald Knuth 
*The art of computer pragraming*

Technology TeX

## LaTeX

Leslie Lamport

LaTeX文档结构

- 导言区preamble
    - \documentclass{}
    - \usepackage{}
- 全局设置命令
- comment
  - %

- 正文区
    - \begin{document}
    - \end{document}

## Command

\LaTeX

\command{parameter}[option]

\documentclass[options]{documentclass} 

|:--|:--|
|article||
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


\usepackage[options]{package}

\include{filename}

\includely{filename1, filename2,...}

\begin{environment name}{arguments}
...
\end{environment name}