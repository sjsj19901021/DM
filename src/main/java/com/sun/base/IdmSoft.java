package com.sun.base;


/**
 * Created by sun on 2019/10/20.
 **/
public interface IdmSoft {
    String Ver();

    int SetPath(String path);

    String Ocr(int x1, int y1, int x2, int y2, String color, double sim);

    int FindStr(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y);

    int GetResultCount(String str);

    int GetResultPos(String str, int index, Object x, Object y);

    int StrStr(String s, String str);

    int SendCommand(String cmd);

    int UseDict(int index);

    String GetBasePath();

    int SetDictPwd(String pwd);

    String OcrInFile(int x1, int y1, int x2, int y2, String pic_name, String color, double sim);

    int Capture(int x1, int y1, int x2, int y2, String file);

    int KeyPress(int vk);

    int KeyDown(int vk);

    int KeyUp(int vk);

    int LeftClick();

    int RightClick();

    int MiddleClick();

    int LeftDoubleClick();

    int LeftDown();

    int LeftUp();

    int RightDown();

    int RightUp();

    int MoveTo(int x, int y);

    int MoveR(int rx, int ry);

    String GetColor(int x, int y);

    String GetColorBGR(int x, int y);

    String RGB2BGR(String rgb_color);

    String BGR2RGB(String bgr_color);

    int UnBindWindow();

    int CmpColor(int x, int y, String color, double sim);

    int ClientToScreen(int hwnd, Object x, Object y);

    int ScreenToClient(int hwnd, Object x, Object y);

    int ShowScrMsg(int x1, int y1, int x2, int y2, String msg, String color);

    int SetMinRowGap(int row_gap);

    int SetMinColGap(int col_gap);

    int FindColor(int x1, int y1, int x2, int y2, String color, double sim, int dir, Object x, Object y);

    String FindColorEx(int x1, int y1, int x2, int y2, String color, double sim, int dir);

    int SetWordLineHeight(int line_height);

    int SetWordGap(int word_gap);

    int SetRowGapNoDict(int row_gap);

    int SetColGapNoDict(int col_gap);

    int SetWordLineHeightNoDict(int line_height);

    int SetWordGapNoDict(int word_gap);

    int GetWordResultCount(String str);

    int GetWordResultPos(String str, int index, Object x, Object y);

    String GetWordResultStr(String str, int index);

    String GetWords(int x1, int y1, int x2, int y2, String color, double sim);

    String GetWordsNoDict(int x1, int y1, int x2, int y2, String color);

    int SetShowErrorMsg(int show);

    int GetClientSize(int hwnd, Object width, Object height);

    int MoveWindow(int hwnd, int x, int y);

    String GetColorHSV(int x, int y);

    String GetAveRGB(int x1, int y1, int x2, int y2);

    String GetAveHSV(int x1, int y1, int x2, int y2);

    int GetForegroundWindow();

    int GetForegroundFocus();

    int GetMousePointWindow();

    int GetPointWindow(int x, int y);

    String EnumWindow(int parent, String title, String class_name, int filter);

    int GetWindowState(int hwnd, int flag);

    int GetWindow(int hwnd, int flag);

    int GetSpecialWindow(int flag);

    int SetWindowText(int hwnd, String text);

    int SetWindowSize(int hwnd, int width, int height);

    int GetWindowRect(int hwnd, Object x1, Object y1, Object x2, Object y2);

    String GetWindowTitle(int hwnd);

    String GetWindowClass(int hwnd);

    int SetWindowState(int hwnd, int flag);

    int CreateFoobarRect(int hwnd, int x, int y, int w, int h);

    int CreateFoobarRoundRect(int hwnd, int x, int y, int w, int h, int rw, int rh);

    int CreateFoobarEllipse(int hwnd, int x, int y, int w, int h);

    int CreateFoobarCustom(int hwnd, int x, int y, String pic, String trans_color, double sim);

    int FoobarFillRect(int hwnd, int x1, int y1, int x2, int y2, String color);

    int FoobarDrawText(int hwnd, int x, int y, int w, int h, String text, String color, int align);

    int FoobarDrawPic(int hwnd, int x, int y, String pic, String trans_color);

    int FoobarUpdate(int hwnd);

    int FoobarLock(int hwnd);

    int FoobarUnlock(int hwnd);

    int FoobarSetFont(int hwnd, String font_name, int size, int flag);

    int FoobarTextRect(int hwnd, int x, int y, int w, int h);

    int FoobarPrintText(int hwnd, String text, String color);

    int FoobarClearText(int hwnd);

    int FoobarTextLineGap(int hwnd, int gap);

    int Play(String file);

    int FaqCapture(int x1, int y1, int x2, int y2, int quality, int delay, int time);

    int FaqRelease(int handle);

    String FaqSend(String server, int handle, int request_type, int time_out);

    int Beep(int fre, int delay);

    int FoobarClose(int hwnd);

    int MoveDD(int dx, int dy);

    int FaqGetSize(int handle);

    int LoadPic(String pic_name);

    int FreePic(String pic_name);

    int GetScreenData(int x1, int y1, int x2, int y2);

    int FreeScreenData(int handle);

    int WheelUp();

    int WheelDown();

    int SetMouseDelay(String type, int delay);

    int SetKeypadDelay(String type, int delay);

    String GetEnv(int index, String name);

    int SetEnv(int index, String name, String value);

    int SendString(int hwnd, String str);

    int DelEnv(int index, String name);

    String GetPath();

    int SetDict(int index, String dict_name);

    int FindPic(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir, Object x, Object y);

    String FindPicEx(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir);

    int SetClientSize(int hwnd, int width, int height);

    int ReadInt(int hwnd, String addr, int type);

    float ReadFloat(int hwnd, String addr);

    double ReadDouble(int hwnd, String addr);

    String FindInt(int hwnd, String addr_range, int int_value_min, int int_value_max, int type);

    String FindFloat(int hwnd, String addr_range, float float_value_min, float float_value_max);

    String FindDouble(int hwnd, String addr_range, double double_value_min, double double_value_max);

    String FindString(int hwnd, String addr_range, String string_value, int type);

    int GetModuleBaseAddr(int hwnd, String module_name);

    String MoveToEx(int x, int y, int w, int h);

    String MatchPicName(String pic_name);

    int AddDict(int index, String dict_info);

    int EnterCri();

    int LeaveCri();

    int WriteInt(int hwnd, String addr, int type, int v);

    int WriteFloat(int hwnd, String addr, float v);

    int WriteDouble(int hwnd, String addr, double v);

    int WriteString(int hwnd, String addr, int type, String v);

    int AsmAdd(String asm_ins);

    int AsmClear();

    int AsmCall(int hwnd, int mode);

    int FindMultiColor(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir, Object x, Object y);

    String FindMultiColorEx(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir);

    String AsmCode(int base_addr);

    String Assemble(String asm_code, int base_addr, int is_upper);

    int SetWindowTransparent(int hwnd, int v);

    String ReadData(int hwnd, String addr, int len);

    int WriteData(int hwnd, String addr, String data);

    String FindData(int hwnd, String addr_range, String data);

    int SetPicPwd(String pwd);

    int Log(String info);

    String FindStrE(int x1, int y1, int x2, int y2, String str, String color, double sim);

    String FindColorE(int x1, int y1, int x2, int y2, String color, double sim, int dir);

    String FindPicE(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir);

    String FindMultiColorE(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir);

    int SetExactOcr(int exact_ocr);

    String ReadString(int hwnd, String addr, int type, int len);

    int FoobarTextPrintDir(int hwnd, int dir);

    String OcrEx(int x1, int y1, int x2, int y2, String color, double sim);

    int SetDisplayInput(String mode);

    int GetTime();

    int GetScreenWidth();

    int GetScreenHeight();

    int BindWindowEx(int hwnd, String display, String mouse, String keypad, String public_desc, int mode);

    String GetDiskSerial();

    String Md5(String str);

    String GetMac();

    int ActiveInputMethod(int hwnd, String id);

    int CheckInputMethod(int hwnd, String id);

    int FindInputMethod(String id);

    int GetCursorPos(Object x, Object y);

    int BindWindow(int hwnd, String display, String mouse, String keypad, int mode);

    int FindWindow(String class_name, String title_name);

    int GetScreenDepth();

    int SetScreen(int width, int height, int depth);

    int ExitOs(int type);

    String GetDir(int type);

    int GetOsType();

    int FindWindowEx(int parent, String class_name, String title_name);

    int SetExportDict(int index, String dict_name);

    String GetCursorShape();

    int DownCpu(int rate);

    String GetCursorSpot();

    int SendString2(int hwnd, String str);

    int FaqPost(String server, int handle, int request_type, int time_out);

    String FaqFetch();

    String FetchWord(int x1, int y1, int x2, int y2, String color, String word);

    int CaptureJpg(int x1, int y1, int x2, int y2, String file, int quality);

    int FindStrWithFont(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag, Object x, Object y);

    String FindStrWithFontE(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag);

    String FindStrWithFontEx(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag);

    String GetDictInfo(String str, String font_name, int font_size, int flag);

    int SaveDict(int index, String file);

    int GetWindowProcessId(int hwnd);

    String GetWindowProcessPath(int hwnd);

    int LockInput(int lock);

    String GetPicSize(String pic_name);

    int GetID();

    int CapturePng(int x1, int y1, int x2, int y2, String file);

    int CaptureGif(int x1, int y1, int x2, int y2, String file, int delay, int time);

    int ImageToBmp(String pic_name, String bmp_name);

    int FindStrFast(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y);

    String FindStrFastEx(int x1, int y1, int x2, int y2, String str, String color, double sim);

    String FindStrFastE(int x1, int y1, int x2, int y2, String str, String color, double sim);

    int EnableDisplayDebug(int enable_debug);

    int CapturePre(String file);

    int RegEx(String code, String Ver, String ip);

    String GetMachineCode();

    int SetClipboard(String data);

    String GetClipboard();

    int GetNowDict();

    int Is64Bit();

    int GetColorNum(int x1, int y1, int x2, int y2, String color, double sim);

    String EnumWindowByProcess(String process_name, String title, String class_name, int filter);

    int GetDictCount(int index);

    int GetLastError();

    String GetNetTime();

    int EnableGetColorByCapture(int en);

    int CheckUAC();

    int SetUAC(int uac);

    int DisableFontSmooth();

    int CheckFontSmooth();

    int SetDisplayAcceler(int level);

    int FindWindowByProcess(String process_name, String class_name, String title_name);

    int FindWindowByProcessId(int process_id, String class_name, String title_name);

    String ReadIni(String section, String key, String file);

    int WriteIni(String section, String key, String v, String file);

    int RunApp(String path, int mode);

    int delay(int mis);

    int FindWindowSuper(String spec1, int flag1, int type1, String spec2, int flag2, int type2);

    String ExcludePos(String all_pos, int type, int x1, int y1, int x2, int y2);

    String FindNearestPos(String all_pos, int type, int x, int y);

    String SortPosDistance(String all_pos, int type, int x, int y);

    int FindPicMem(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir, Object x, Object y);

    String FindPicMemEx(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir);

    String FindPicMemE(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir);

    String AppendPicAddr(String pic_info, int addr, int size);

    int WriteFile(String file, String content);

    int Stop(int id);

    int SetDictMem(int index, int addr, int size);

    String GetNetTimeSafe();

    int ForceUnBindWindow(int hwnd);

    String ReadIniPwd(String section, String key, String file, String pwd);

    int WriteIniPwd(String section, String key, String v, String file, String pwd);

    int DecodeFile(String file, String pwd);

    int KeyDownChar(String key_str);

    int KeyUpChar(String key_str);

    int KeyPressChar(String key_str);

    int KeyPressStr(String key_str, int delay);

    int EnableKeypadPatch(int en);

    int EnableKeypadSync(int en, int time_out);

    int EnableMouseSync(int en, int time_out);

    int DmGuard(int en, String type);

    int FaqCaptureFromFile(int x1, int y1, int x2, int y2, String file, int quality);

    String FindIntEx(int hwnd, String addr_range, int int_value_min, int int_value_max, int type, int step, int multi_thread, int mode);

    String FindFloatEx(int hwnd, String addr_range, float float_value_min, float float_value_max, int step, int multi_thread, int mode);

    String FindDoubleEx(int hwnd, String addr_range, double double_value_min, double double_value_max, int step, int multi_thread, int mode);

    String FindStringEx(int hwnd, String addr_range, String string_value, int type, int step, int multi_thread, int mode);

    String FindDataEx(int hwnd, String addr_range, String data, int step, int multi_thread, int mode);

    int EnableRealMouse(int en, int mousedelay, int mousestep);

    int EnableRealKeypad(int en);

    int SendStringIme(String str);

    int FoobarDrawLine(int hwnd, int x1, int y1, int x2, int y2, String color, int style, int width);

    String FindStrEx(int x1, int y1, int x2, int y2, String str, String color, double sim);

    int IsBind(int hwnd);

    int SetDisplayDelay(int t);

    int GetDmCount();

    int DisableScreenSave();

    int DisablePowerSave();

    int SetMemoryHwndAsProcessId(int en);

    int FindShape(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir, Object x, Object y);

    String FindShapeE(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir);

    String FindShapeEx(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir);

    String FindStrS(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y);

    String FindStrExS(int x1, int y1, int x2, int y2, String str, String color, double sim);

    String FindStrFastS(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y);

    String FindStrFastExS(int x1, int y1, int x2, int y2, String str, String color, double sim);

    String FindPicS(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir, Object x, Object y);

    String FindPicExS(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir);

    int ClearDict(int index);

    String GetMachineCodeNoMac();

    int GetClientRect(int hwnd, Object x1, Object y1, Object x2, Object y2);

    int EnableFakeActive(int en);

    int GetScreenDataBmp(int x1, int y1, int x2, int y2, Object data, Object size);

    int EncodeFile(String file, String pwd);

    String GetCursorShapeEx(int type);

    int FaqCancel();

    String IntToData(int int_value, int type);

    String FloatToData(float float_value);

    String DoubleToData(double double_value);

    String StringToData(String string_value, int type);

    int SetMemoryFindResultToFile(String file);

    int EnableBind(int en);

    int SetSimMode(int mode);

    int LockMouseRect(int x1, int y1, int x2, int y2);

    int SendPaste(int hwnd);

    int IsDisplayDead(int x1, int y1, int x2, int y2, int t);

    int GetKeyState(int vk);

    int CopyFile(String src_file, String dst_file, int over);

    int IsFileExist(String file);

    int DeleteFile(String file);

    int MoveFile(String src_file, String dst_file);

    int CreateFolder(String folder_name);

    int DeleteFolder(String folder_name);

    int GetFileLength(String file);

    String ReadFile(String file);

    int WaitKey(int key_code, int time_out);

    int DeleteIni(String section, String key, String file);

    int DeleteIniPwd(String section, String key, String file, String pwd);

    int EnableSpeedDx(int en);

    int EnableIme(int en);

    int Reg(String code, String Ver);

    String SelectFile();

    String SelectDirectory();

    int LockDisplay(int lock);

    int FoobarSetSave(int hwnd, String file, int en, String header);

    String EnumWindowSuper(String spec1, int flag1, int type1, String spec2, int flag2, int type2, int sort);

    int DownloadFile(String url, String save_file, int timeout);

    int EnableKeypadMsg(int en);

    int EnableMouseMsg(int en);

    int RegNoMac(String code, String Ver);

    int RegExNoMac(String code, String Ver, String ip);

    int SetEnumWindowDelay(int delay);

    int FindMulColor(int x1, int y1, int x2, int y2, String color, double sim);

    String GetDict(int index, int font_index);
}
