@echo off

path=D:\BaiduNetdiskDownload\pipi奶御坂打包27套

echo start rename files

for /r "%path%" %%a in (NO.*)do ren "%%a" "*.7z"

echo end!

pause 