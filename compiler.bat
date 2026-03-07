@echo off
echo.

javac -d . *.java

if %errorlevel% neq 0 (
    echo.
    echo Compilation FAILED
    pause
    exit /b
)
echo.

java Guessing_Game.Main

pause