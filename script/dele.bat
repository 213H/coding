@echo off

::set /p path=please enter the folder of file that you want to delete:

::md "%path%"

echo file deleting . . .

path=D:\BaiduNetdiskDownload\shika

for /r "%path%" %%a in (*.7z)do del "%%a"

echo delete end!

pause 