@ECHO OFF

if not "%JAVA_HOME%" == "" goto CONT1
echo ERROR: You must set the JAVA_HOME environment variable to a valid JDK/JRE directory (e.g., C:\java\j2sdk1.4.2_01) before running this script.
pause
goto END
:CONT1

if exist "%JAVA_HOME%\bin\java.exe" goto CONT2
echo ERROR: You must set the JAVA_HOME environment variable to a valid JDK/JRE directory (e.g., C:\java\j2sdk1.4.2_01) before running this script.
pause
goto END
:CONT2

set CONSOLE_HOME=..

set CONSOLE_LIB=%CONSOLE_HOME%\com.jamesholmes.console.struts\lib

set CONSOLE_CLASSPATH=%JAVA_HOME%\jre\lib\rt.jar;%CONSOLE_LIB%\struts-console.jar;%CONSOLE_LIB%\xerces.jar

if not "%OS%" == "Windows_NT" goto NOTITLE
start "Struts Console" "%JAVA_HOME%\bin\javaw" -classpath "%CONSOLE_CLASSPATH%" com.jamesholmes.console.struts.StrutsConsole %1
goto END
:NOTITLE
start "%JAVA_HOME%\bin\javaw" -classpath "%CONSOLE_CLASSPATH%" com.jamesholmes.console.struts.StrutsConsole %1

:END