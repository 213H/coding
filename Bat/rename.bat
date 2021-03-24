@echo off

path=D:\BaiduNetdiskDownload

echo start rename files

for /r "%path%" %%a in (NO.*)do ren "%%a" "*.7z"

echo end!

pause 