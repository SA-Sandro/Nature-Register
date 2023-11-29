; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{C7322024-2AEC-4E79-8EDF-9C6D88DB7AF7}
AppName=Nature Register
AppVersion=1.0
;AppVerName=Nature Register 1.0
AppPublisher=Nature Programmers
DefaultDirName={pf}\Nature Register
DisableProgramGroupPage=yes
OutputDir=E:\Importante\DesarrolloSoftware\Proyecto_ObservacionesDB\Nature Register\Nature Register\Ejecutable
OutputBaseFilename=setup
SetupIconFile=E:\Importante\DesarrolloSoftware\Proyecto_ObservacionesDB\Nature Register\Nature Register\src\Images\nature register1.ico
Compression=lzma
SolidCompression=yes

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "E:\Importante\DesarrolloSoftware\Proyecto_ObservacionesDB\Nature Register\Nature Register\Ejecutable\Nature Register.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\Importante\DesarrolloSoftware\Proyecto_ObservacionesDB\Nature Register\Nature Register\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{commonprograms}\Nature Register"; Filename: "{app}\Nature Register.exe"
Name: "{commondesktop}\Nature Register"; Filename: "{app}\Nature Register.exe"; Tasks: desktopicon

[Run]
Filename: "{app}\Nature Register.exe"; Description: "{cm:LaunchProgram,Nature Register}"; Flags: nowait postinstall skipifsilent
