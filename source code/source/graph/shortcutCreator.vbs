Set Shell = CreateObject("WScript.Shell")
DesktopPath = Shell.SpecialFolders("Desktop")
Set link = Shell.CreateShortcut(DesktopPath & "\EasyMath.lnk")
link.Arguments = "1 2 3"
link.Description = "EasyMath"
link.HotKey = "CTRL+ALT+SHIFT+X"
link.IconLocation = "%SystemRoot%\System32\SHELL32.dll,012"
link.TargetPath = "D:\bobi\abbverationfolder1\EasyMath\dist\EasyMath.jar"
link.WindowStyle = 3
link.WorkingDirectory = "D:\bobi\abbverationfolder1\EasyMath\dist\EasyMath.jar"
link.Save
WScript.Echo( Shell.CurrentDirectory )