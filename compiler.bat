@echo off
echo Compiling...

javac -d . *.java

if %errorlevel% neq 0 (
    echo.
    echo Compilation FAILED
    pause
    exit /b
)

echo.
echo Running program...
echo.

java Guessing_Game.Main

pause