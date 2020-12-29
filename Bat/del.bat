@echo off

::set /p path=please enter the folder of file that you want to delete:

::md "%path%"

echo file deleting . . .

path=D:\BaiduNetdiskDownload\pipi奶御坂打包27套

for /r "%path%" %%a in (*)do del "%%a"

echo delete end!

pause 