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

#### Vim command

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
```
kali-win-kex
传统模式：Linux命令kex或kex –win，具有全屏和窗口模式。

停止使用Linux命令kex –stop或kex –win –stop，退出子系统图形化界面。

全屏或窗口模式切换中【F8】是唯一的子系统功能键，可退出全屏模式。

进入超级用户模式的Linux命令为sudo kex或sudo kex –win


融合模式：运行Linux命令kex –sl、停止Linux命令kex –sl –stop
进入超级用户模式的Linux命令sudo kex –sl

传统模式中全屏状态带来不弱于物理系统的感受，但是由于环境限制，运行资源效率稍弱。
融合模式中Linux和Windows程序对话框窗口遵守常规的层位关系，不存在双系统之间应用置顶现象。

kex -s
kex --sound
```

sudo apt update && sudo apt upgrade