@echo off

@REM read args
set dir=%1
set file=%2

@REM check args
if not defined dir (
	echo expected argument 'dir_name'
	exit \b
) 
if not defined file (
	echo expected argument 'file_name'
	exit \b
) 

@REM for java commandLine args
set args0=%3
set args1=%4

@REM to compile code
javac -d ./out ./%dir%/%file%.java

@REM to execute code
java -classpath ./out %file% %args0% %args1%