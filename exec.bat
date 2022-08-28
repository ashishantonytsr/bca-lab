@echo off

@REM command line arguments
set dir=%1
set args0=%2
set args1=%3

@REM if no args
if not defined dir (
	echo ---
	echo please provide folder name
	echo ---
	exit \b
)

@REM fetching java file path from given directory
for %%f in (.\%dir%\*java) do set file_path=%%f

@REM extracting file name without extension
for %%i in ("%file_path%") do set file_name=%%~ni

echo %file_name%
echo ---

@REM to compile code
javac -d ./out %file_path%

@REM to execute code
java -classpath ./out %file_name% %args0% %args1%

@REM to delete byte code after execution
del .\out\%file_name%.class
set "file_path="
set "file_name="