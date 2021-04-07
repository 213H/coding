## vim

### Mode

- Normal 
- Command-line  <kbd>:</kbd>   
- Insert        <kbd>i</kbd>    <kbd>esc</kbd>
- Replace       <kbd>R</kbd>
- Select        
  - Visual      <kbd>V</kbd>
  - block       <kbd>Shift + V</kbd>
  - line        <kbd>Ctrl + V</kbd>
- Ex            <kbd>ex</kbd>

### Vim command

< operation> < motion>

:split :vsplit  q->quit

:w

:q

- i present char
- I present line
- a present end
- A line end
- o present void line
- O end void line
- s del char
- S del line

d
- 0 line pre
- ^ line pre
- $ line end
- b word pre
- e word end
- w next word pre
- gg doc pre
- G doc end
2d del No.2 line
d3->  del 3 char right
dd    present line
4dd   ->4
1 , 10 de
1 , 10 m 12   paster

p     paster

y     copy
yy    present line
4yy   ->4
1, 10 co 12

find
/string up to down
?string down to up
/st...g
/st*g
<kbd>Shift</kbd>* string <- n -> N

## Linux Command

|command|parameter|note|
|:--|:--:|--:|
|mkdir||make directory|
|cd||change directory|
||..|upper directory|
||/|slash root|
||\|back slash root|
||~|home|
||.|present|
||-|last|
|ls||list|
|dir||directory|
|cp||copy|
|mv||move|
|rm||remove|
||-r|recurive|
||-f|force|
|rmdir|remove [ empty] directory||
||-p|recurive|
|gcc|||
||-g||
||-c||
||-o||
|vi|||
|cat||concatenate|
|pwd||print working directory|
|touch||touch time/ new file|
|sudo||superuserdo|
|which||path of software|
|clear||clear screen|
|ps||process|
|find|||
|cmp||compare|
|locate|||
|wc||word count|
|man||manual|
|grep||string match|
|telnet|||
|ifconfig|net config||

tips: ls --help


## Shell

chmod +x file 执行权限

#!/usr/bin/bash

cat /etc/shells

echo $SHELL

chsh -s /bin/zsh

### Variable

variable var="value" #without whitespace
${var}
${#var} count chars

### I/O redirect

echo hello > hello.txt

cat < hello.txt

cat < hello.txt > hello2.txt

cat < hello.txt >> hello2.txt *append txt*

### pipe command

ls -al /etc | less
ls | sort
output -> input

curl --head --slient baidu.com | grep -i content-length

## WSL

Windows Subsystem Linux
```
kali-win-kex

kex

kex stop

F8  Full Screen

sudo kex

kex -sl

kex -s
kex --sound

```

