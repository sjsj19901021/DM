package com.sun.base;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;

/**
 * Created by sun on 2019/10/20.
 **/
public class DMJocSoft implements IdmSoft {

    private String soft = "dm.dmsoft";

    private ActiveXComponent active;


    public DMJocSoft() {
        active = new ActiveXComponent("dm.dmsoft");
    }

    @Override
    public String Ver() {
        return null;
    }

    @Override
    public int SetPath(String path) {
        return 0;
    }

    @Override
    public String Ocr(int x1, int y1, int x2, int y2, String color, double sim) {
        return null;
    }

    @Override
    public int FindStr(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) {
        return 0;
    }

    @Override
    public int GetResultCount(String str) {
        return 0;
    }

    @Override
    public int GetResultPos(String str, int index, Object x, Object y) {
        return 0;
    }

    @Override
    public int StrStr(String s, String str) {
        return 0;
    }

    @Override
    public int SendCommand(String cmd) {
        return 0;
    }

    @Override
    public int UseDict(int index) {
        return 0;
    }

    @Override
    public String GetBasePath() {
        return null;
    }

    @Override
    public int SetDictPwd(String pwd) {
        return 0;
    }

    @Override
    public String OcrInFile(int x1, int y1, int x2, int y2, String pic_name, String color, double sim) {
        return null;
    }

    @Override
    public int Capture(int x1, int y1, int x2, int y2, String file) {
        return 0;
    }

    @Override
    public int KeyPress(int vk) {
        return 0;
    }

    @Override
    public int KeyDown(int vk) {
        return 0;
    }

    @Override
    public int KeyUp(int vk) {
        return 0;
    }

    @Override
    public int LeftClick() {
        return Dispatch.call(active, "LeftClick").getInt();
    }

    @Override
    public int RightClick() {
        return Dispatch.call(active, "RightClick").getInt();
    }

    @Override
    public int MiddleClick() {
        return 0;
    }

    @Override
    public int LeftDoubleClick() {
        return 0;
    }

    @Override
    public int LeftDown() {
        return 0;
    }

    @Override
    public int LeftUp() {
        return 0;
    }

    @Override
    public int RightDown() {
        return 0;
    }

    @Override
    public int RightUp() {
        return 0;
    }

    @Override
    public int MoveTo(int x, int y) {
        return Dispatch.call(active, "MoveTo", x, y).getInt();
    }

    @Override
    public int MoveR(int rx, int ry) {
        return 0;
    }

    @Override
    public String GetColor(int x, int y) {
        return null;
    }

    @Override
    public String GetColorBGR(int x, int y) {
        return null;
    }

    @Override
    public String RGB2BGR(String rgb_color) {
        return null;
    }

    @Override
    public String BGR2RGB(String bgr_color) {
        return null;
    }

    @Override
    public int UnBindWindow() {
        return 0;
    }

    @Override
    public int CmpColor(int x, int y, String color, double sim) {
        return 0;
    }

    @Override
    public int ClientToScreen(int hwnd, Object x, Object y) {
        return 0;
    }

    @Override
    public int ScreenToClient(int hwnd, Object x, Object y) {
        return 0;
    }

    @Override
    public int ShowScrMsg(int x1, int y1, int x2, int y2, String msg, String color) {
        return 0;
    }

    @Override
    public int SetMinRowGap(int row_gap) {
        return 0;
    }

    @Override
    public int SetMinColGap(int col_gap) {
        return 0;
    }

    @Override
    public int FindColor(int x1, int y1, int x2, int y2, String color, double sim, int dir, Object x, Object y) {
        return 0;
    }

    @Override
    public String FindColorEx(int x1, int y1, int x2, int y2, String color, double sim, int dir) {
        return null;
    }

    @Override
    public int SetWordLineHeight(int line_height) {
        return 0;
    }

    @Override
    public int SetWordGap(int word_gap) {
        return 0;
    }

    @Override
    public int SetRowGapNoDict(int row_gap) {
        return 0;
    }

    @Override
    public int SetColGapNoDict(int col_gap) {
        return 0;
    }

    @Override
    public int SetWordLineHeightNoDict(int line_height) {
        return 0;
    }

    @Override
    public int SetWordGapNoDict(int word_gap) {
        return 0;
    }

    @Override
    public int GetWordResultCount(String str) {
        return 0;
    }

    @Override
    public int GetWordResultPos(String str, int index, Object x, Object y) {
        return 0;
    }

    @Override
    public String GetWordResultStr(String str, int index) {
        return null;
    }

    @Override
    public String GetWords(int x1, int y1, int x2, int y2, String color, double sim) {
        return null;
    }

    @Override
    public String GetWordsNoDict(int x1, int y1, int x2, int y2, String color) {
        return null;
    }

    @Override
    public int SetShowErrorMsg(int show) {
        return 0;
    }

    @Override
    public int GetClientSize(int hwnd, Object width, Object height) {
        return Dispatch.call(active, "GetClientSize", hwnd, width, height).getInt();
    }

    @Override
    public int MoveWindow(int hwnd, int x, int y) {
        return 0;
    }

    @Override
    public String GetColorHSV(int x, int y) {
        return null;
    }

    @Override
    public String GetAveRGB(int x1, int y1, int x2, int y2) {
        return null;
    }

    @Override
    public String GetAveHSV(int x1, int y1, int x2, int y2) {
        return null;
    }

    @Override
    public int GetForegroundWindow() {
        return 0;
    }

    @Override
    public int GetForegroundFocus() {
        return 0;
    }

    @Override
    public int GetMousePointWindow() {
        return 0;
    }

    @Override
    public int GetPointWindow(int x, int y) {
        return 0;
    }

    @Override
    public String EnumWindow(int parent, String title, String class_name, int filter) {
        return Dispatch.call(active, "EnumWindow", parent, title, class_name, filter).getString();
    }

    @Override
    public int GetWindowState(int hwnd, int flag) {
        return 0;
    }

    @Override
    public int GetWindow(int hwnd, int flag) {
        return 0;
    }

    @Override
    public int GetSpecialWindow(int flag) {
        return 0;
    }

    @Override
    public int SetWindowText(int hwnd, String text) {
        return Dispatch.call(active, "SetWindowText", hwnd, text).getInt();
    }

    @Override
    public int SetWindowSize(int hwnd, int width, int height) {
        return 0;
    }

    @Override
    public int GetWindowRect(int hwnd, Object x1, Object y1, Object x2, Object y2) {
        return 0;
    }

    @Override
    public String GetWindowTitle(int hwnd) {
        return null;
    }

    @Override
    public String GetWindowClass(int hwnd) {
        return null;
    }

    @Override
    public int SetWindowState(int hwnd, int flag) {
        return 0;
    }

    @Override
    public int CreateFoobarRect(int hwnd, int x, int y, int w, int h) {
        return 0;
    }

    @Override
    public int CreateFoobarRoundRect(int hwnd, int x, int y, int w, int h, int rw, int rh) {
        return 0;
    }

    @Override
    public int CreateFoobarEllipse(int hwnd, int x, int y, int w, int h) {
        return 0;
    }

    @Override
    public int CreateFoobarCustom(int hwnd, int x, int y, String pic, String trans_color, double sim) {
        return 0;
    }

    @Override
    public int FoobarFillRect(int hwnd, int x1, int y1, int x2, int y2, String color) {
        return 0;
    }

    @Override
    public int FoobarDrawText(int hwnd, int x, int y, int w, int h, String text, String color, int align) {
        return 0;
    }

    @Override
    public int FoobarDrawPic(int hwnd, int x, int y, String pic, String trans_color) {
        return 0;
    }

    @Override
    public int FoobarUpdate(int hwnd) {
        return 0;
    }

    @Override
    public int FoobarLock(int hwnd) {
        return 0;
    }

    @Override
    public int FoobarUnlock(int hwnd) {
        return 0;
    }

    @Override
    public int FoobarSetFont(int hwnd, String font_name, int size, int flag) {
        return 0;
    }

    @Override
    public int FoobarTextRect(int hwnd, int x, int y, int w, int h) {
        return 0;
    }

    @Override
    public int FoobarPrintText(int hwnd, String text, String color) {
        return 0;
    }

    @Override
    public int FoobarClearText(int hwnd) {
        return 0;
    }

    @Override
    public int FoobarTextLineGap(int hwnd, int gap) {
        return 0;
    }

    @Override
    public int Play(String file) {
        return 0;
    }

    @Override
    public int FaqCapture(int x1, int y1, int x2, int y2, int quality, int delay, int time) {
        return 0;
    }

    @Override
    public int FaqRelease(int handle) {
        return 0;
    }

    @Override
    public String FaqSend(String server, int handle, int request_type, int time_out) {
        return null;
    }

    @Override
    public int Beep(int fre, int delay) {
        return 0;
    }

    @Override
    public int FoobarClose(int hwnd) {
        return 0;
    }

    @Override
    public int MoveDD(int dx, int dy) {
        return 0;
    }

    @Override
    public int FaqGetSize(int handle) {
        return 0;
    }

    @Override
    public int LoadPic(String pic_name) {
        return 0;
    }

    @Override
    public int FreePic(String pic_name) {
        return 0;
    }

    @Override
    public int GetScreenData(int x1, int y1, int x2, int y2) {
        return 0;
    }

    @Override
    public int FreeScreenData(int handle) {
        return 0;
    }

    @Override
    public int WheelUp() {
        return 0;
    }

    @Override
    public int WheelDown() {
        return 0;
    }

    @Override
    public int SetMouseDelay(String type, int delay) {
        return Dispatch.call(active, "SetMouseDelay", type, delay).getInt();
    }

    @Override
    public int SetKeypadDelay(String type, int delay) {
        return 0;
    }

    @Override
    public String GetEnv(int index, String name) {
        return null;
    }

    @Override
    public int SetEnv(int index, String name, String value) {
        return 0;
    }

    @Override
    public int SendString(int hwnd, String str) {
        return Dispatch.call(active, "SendString", hwnd, str).getInt();
    }

    @Override
    public int DelEnv(int index, String name) {
        return 0;
    }

    @Override
    public String GetPath() {
        return null;
    }

    @Override
    public int SetDict(int index, String dict_name) {
        return 0;
    }

    @Override
    public int FindPic(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir, Object x, Object y) {
        return Dispatch.call(active, "FindPic", x1, y1, x2, y2, pic_name, delta_color, sim, dir, x, y).getInt();
    }

    @Override
    public String FindPicEx(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) {
        return null;
    }

    @Override
    public int SetClientSize(int hwnd, int width, int height) {
        return 0;
    }

    @Override
    public int ReadInt(int hwnd, String addr, int type) {
        return 0;
    }

    @Override
    public float ReadFloat(int hwnd, String addr) {
        return 0;
    }

    @Override
    public double ReadDouble(int hwnd, String addr) {
        return 0;
    }

    @Override
    public String FindInt(int hwnd, String addr_range, int int_value_min, int int_value_max, int type) {
        return null;
    }

    @Override
    public String FindFloat(int hwnd, String addr_range, float float_value_min, float float_value_max) {
        return null;
    }

    @Override
    public String FindDouble(int hwnd, String addr_range, double double_value_min, double double_value_max) {
        return null;
    }

    @Override
    public String FindString(int hwnd, String addr_range, String string_value, int type) {
        return null;
    }

    @Override
    public int GetModuleBaseAddr(int hwnd, String module_name) {
        return 0;
    }

    @Override
    public String MoveToEx(int x, int y, int w, int h) {
        return null;
    }

    @Override
    public String MatchPicName(String pic_name) {
        return null;
    }

    @Override
    public int AddDict(int index, String dict_info) {
        return 0;
    }

    @Override
    public int EnterCri() {
        return 0;
    }

    @Override
    public int LeaveCri() {
        return 0;
    }

    @Override
    public int WriteInt(int hwnd, String addr, int type, int v) {
        return 0;
    }

    @Override
    public int WriteFloat(int hwnd, String addr, float v) {
        return 0;
    }

    @Override
    public int WriteDouble(int hwnd, String addr, double v) {
        return 0;
    }

    @Override
    public int WriteString(int hwnd, String addr, int type, String v) {
        return 0;
    }

    @Override
    public int AsmAdd(String asm_ins) {
        return 0;
    }

    @Override
    public int AsmClear() {
        return 0;
    }

    @Override
    public int AsmCall(int hwnd, int mode) {
        return 0;
    }

    @Override
    public int FindMultiColor(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir, Object x, Object y) {
        return 0;
    }

    @Override
    public String FindMultiColorEx(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir) {
        return null;
    }

    @Override
    public String AsmCode(int base_addr) {
        return null;
    }

    @Override
    public String Assemble(String asm_code, int base_addr, int is_upper) {
        return null;
    }

    @Override
    public int SetWindowTransparent(int hwnd, int v) {
        return 0;
    }

    @Override
    public String ReadData(int hwnd, String addr, int len) {
        return null;
    }

    @Override
    public int WriteData(int hwnd, String addr, String data) {
        return 0;
    }

    @Override
    public String FindData(int hwnd, String addr_range, String data) {
        return null;
    }

    @Override
    public int SetPicPwd(String pwd) {
        return 0;
    }

    @Override
    public int Log(String info) {
        return 0;
    }

    @Override
    public String FindStrE(int x1, int y1, int x2, int y2, String str, String color, double sim) {
        return null;
    }

    @Override
    public String FindColorE(int x1, int y1, int x2, int y2, String color, double sim, int dir) {
        return null;
    }

    @Override
    public String FindPicE(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) {
        return null;
    }

    @Override
    public String FindMultiColorE(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir) {
        return null;
    }

    @Override
    public int SetExactOcr(int exact_ocr) {
        return 0;
    }

    @Override
    public String ReadString(int hwnd, String addr, int type, int len) {
        return null;
    }

    @Override
    public int FoobarTextPrintDir(int hwnd, int dir) {
        return 0;
    }

    @Override
    public String OcrEx(int x1, int y1, int x2, int y2, String color, double sim) {
        return null;
    }

    @Override
    public int SetDisplayInput(String mode) {
        return 0;
    }

    @Override
    public int GetTime() {
        return 0;
    }

    @Override
    public int GetScreenWidth() {
        return 0;
    }

    @Override
    public int GetScreenHeight() {
        return 0;
    }

    @Override
    public int BindWindowEx(int hwnd, String display, String mouse, String keypad, String public_desc, int mode) {
        return 0;
    }

    @Override
    public String GetDiskSerial() {
        return null;
    }

    @Override
    public String Md5(String str) {
        return null;
    }

    @Override
    public String GetMac() {
        return null;
    }

    @Override
    public int ActiveInputMethod(int hwnd, String id) {
        return 0;
    }

    @Override
    public int CheckInputMethod(int hwnd, String id) {
        return 0;
    }

    @Override
    public int FindInputMethod(String id) {
        return 0;
    }

    @Override
    public int GetCursorPos(Object x, Object y) {
        return 0;
    }

    @Override
    public int BindWindow(int hwnd, String display, String mouse, String keypad, int mode) {
        return Dispatch.call(active, "BindWindow", hwnd, display, mouse, keypad, mode).getInt();
    }

    @Override
    public int FindWindow(String class_name, String title_name) {
        return 0;
    }

    @Override
    public int GetScreenDepth() {
        return 0;
    }

    @Override
    public int SetScreen(int width, int height, int depth) {
        return 0;
    }

    @Override
    public int ExitOs(int type) {
        return 0;
    }

    @Override
    public String GetDir(int type) {
        return null;
    }

    @Override
    public int GetOsType() {
        return 0;
    }

    @Override
    public int FindWindowEx(int parent, String class_name, String title_name) {
        return Dispatch.call(active, "FindWindowEx", parent, class_name, title_name).getInt();
    }

    @Override
    public int SetExportDict(int index, String dict_name) {
        return 0;
    }

    @Override
    public String GetCursorShape() {
        return null;
    }

    @Override
    public int DownCpu(int rate) {
        return 0;
    }

    @Override
    public String GetCursorSpot() {
        return null;
    }

    @Override
    public int SendString2(int hwnd, String str) {
        return 0;
    }

    @Override
    public int FaqPost(String server, int handle, int request_type, int time_out) {
        return 0;
    }

    @Override
    public String FaqFetch() {
        return null;
    }

    @Override
    public String FetchWord(int x1, int y1, int x2, int y2, String color, String word) {
        return null;
    }

    @Override
    public int CaptureJpg(int x1, int y1, int x2, int y2, String file, int quality) {
        return 0;
    }

    @Override
    public int FindStrWithFont(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag, Object x, Object y) {
        return 0;
    }

    @Override
    public String FindStrWithFontE(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag) {
        return null;
    }

    @Override
    public String FindStrWithFontEx(int x1, int y1, int x2, int y2, String str, String color, double sim, String font_name, int font_size, int flag) {
        return null;
    }

    @Override
    public String GetDictInfo(String str, String font_name, int font_size, int flag) {
        return null;
    }

    @Override
    public int SaveDict(int index, String file) {
        return 0;
    }

    @Override
    public int GetWindowProcessId(int hwnd) {
        return 0;
    }

    @Override
    public String GetWindowProcessPath(int hwnd) {
        return null;
    }

    @Override
    public int LockInput(int lock) {
        return 0;
    }

    @Override
    public String GetPicSize(String pic_name) {
        return null;
    }

    @Override
    public int GetID() {
        return 0;
    }

    @Override
    public int CapturePng(int x1, int y1, int x2, int y2, String file) {
        return 0;
    }

    @Override
    public int CaptureGif(int x1, int y1, int x2, int y2, String file, int delay, int time) {
        return 0;
    }

    @Override
    public int ImageToBmp(String pic_name, String bmp_name) {
        return 0;
    }

    @Override
    public int FindStrFast(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) {
        return 0;
    }

    @Override
    public String FindStrFastEx(int x1, int y1, int x2, int y2, String str, String color, double sim) {
        return null;
    }

    @Override
    public String FindStrFastE(int x1, int y1, int x2, int y2, String str, String color, double sim) {
        return null;
    }

    @Override
    public int EnableDisplayDebug(int enable_debug) {
        return 0;
    }

    @Override
    public int CapturePre(String file) {
        return 0;
    }

    @Override
    public int RegEx(String code, String Ver, String ip) {
        return 0;
    }

    @Override
    public String GetMachineCode() {
        return null;
    }

    @Override
    public int SetClipboard(String data) {
        return 0;
    }

    @Override
    public String GetClipboard() {
        return null;
    }

    @Override
    public int GetNowDict() {
        return 0;
    }

    @Override
    public int Is64Bit() {
        return 0;
    }

    @Override
    public int GetColorNum(int x1, int y1, int x2, int y2, String color, double sim) {
        return 0;
    }

    @Override
    public String EnumWindowByProcess(String process_name, String title, String class_name, int filter) {
        return null;
    }

    @Override
    public int GetDictCount(int index) {
        return 0;
    }

    @Override
    public int GetLastError() {
        return 0;
    }

    @Override
    public String GetNetTime() {
        return null;
    }

    @Override
    public int EnableGetColorByCapture(int en) {
        return 0;
    }

    @Override
    public int CheckUAC() {
        return 0;
    }

    @Override
    public int SetUAC(int uac) {
        return 0;
    }

    @Override
    public int DisableFontSmooth() {
        return 0;
    }

    @Override
    public int CheckFontSmooth() {
        return 0;
    }

    @Override
    public int SetDisplayAcceler(int level) {
        return 0;
    }

    @Override
    public int FindWindowByProcess(String process_name, String class_name, String title_name) {
        return 0;
    }

    @Override
    public int FindWindowByProcessId(int process_id, String class_name, String title_name) {
        return 0;
    }

    @Override
    public String ReadIni(String section, String key, String file) {
        return null;
    }

    @Override
    public int WriteIni(String section, String key, String v, String file) {
        return 0;
    }

    @Override
    public int RunApp(String path, int mode) {
        return 0;
    }

    @Override
    public int delay(int mis) {
        return Dispatch.call(active, "delay", mis).getInt();
    }

    @Override
    public int FindWindowSuper(String spec1, int flag1, int type1, String spec2, int flag2, int type2) {
        return 0;
    }

    @Override
    public String ExcludePos(String all_pos, int type, int x1, int y1, int x2, int y2) {
        return null;
    }

    @Override
    public String FindNearestPos(String all_pos, int type, int x, int y) {
        return null;
    }

    @Override
    public String SortPosDistance(String all_pos, int type, int x, int y) {
        return null;
    }

    @Override
    public int FindPicMem(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir, Object x, Object y) {
        return 0;
    }

    @Override
    public String FindPicMemEx(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir) {
        return null;
    }

    @Override
    public String FindPicMemE(int x1, int y1, int x2, int y2, String pic_info, String delta_color, double sim, int dir) {
        return null;
    }

    @Override
    public String AppendPicAddr(String pic_info, int addr, int size) {
        return null;
    }

    @Override
    public int WriteFile(String file, String content) {
        return 0;
    }

    @Override
    public int Stop(int id) {
        return 0;
    }

    @Override
    public int SetDictMem(int index, int addr, int size) {
        return 0;
    }

    @Override
    public String GetNetTimeSafe() {
        return null;
    }

    @Override
    public int ForceUnBindWindow(int hwnd) {
        return 0;
    }

    @Override
    public String ReadIniPwd(String section, String key, String file, String pwd) {
        return null;
    }

    @Override
    public int WriteIniPwd(String section, String key, String v, String file, String pwd) {
        return 0;
    }

    @Override
    public int DecodeFile(String file, String pwd) {
        return 0;
    }

    @Override
    public int KeyDownChar(String key_str) {
        return Dispatch.call(active, "KeyDownChar", key_str).getInt();
    }

    @Override
    public int KeyUpChar(String key_str) {
        return Dispatch.call(active, "KeyUpChar", key_str).getInt();
    }

    @Override
    public int KeyPressChar(String key_str) {
        return 0;
    }

    @Override
    public int KeyPressStr(String key_str, int delay) {
        return 0;
    }

    @Override
    public int EnableKeypadPatch(int en) {
        return 0;
    }

    @Override
    public int EnableKeypadSync(int en, int time_out) {
        return 0;
    }

    @Override
    public int EnableMouseSync(int en, int time_out) {
        return 0;
    }

    @Override
    public int DmGuard(int en, String type) {
        return 0;
    }

    @Override
    public int FaqCaptureFromFile(int x1, int y1, int x2, int y2, String file, int quality) {
        return 0;
    }

    @Override
    public String FindIntEx(int hwnd, String addr_range, int int_value_min, int int_value_max, int type, int step, int multi_thread, int mode) {
        return null;
    }

    @Override
    public String FindFloatEx(int hwnd, String addr_range, float float_value_min, float float_value_max, int step, int multi_thread, int mode) {
        return null;
    }

    @Override
    public String FindDoubleEx(int hwnd, String addr_range, double double_value_min, double double_value_max, int step, int multi_thread, int mode) {
        return null;
    }

    @Override
    public String FindStringEx(int hwnd, String addr_range, String string_value, int type, int step, int multi_thread, int mode) {
        return null;
    }

    @Override
    public String FindDataEx(int hwnd, String addr_range, String data, int step, int multi_thread, int mode) {
        return null;
    }

    @Override
    public int EnableRealMouse(int en, int mousedelay, int mousestep) {
        return 0;
    }

    @Override
    public int EnableRealKeypad(int en) {
        return 0;
    }

    @Override
    public int SendStringIme(String str) {
        return 0;
    }

    @Override
    public int FoobarDrawLine(int hwnd, int x1, int y1, int x2, int y2, String color, int style, int width) {
        return 0;
    }

    @Override
    public String FindStrEx(int x1, int y1, int x2, int y2, String str, String color, double sim) {
        return null;
    }

    @Override
    public int IsBind(int hwnd) {
        return 0;
    }

    @Override
    public int SetDisplayDelay(int t) {
        return 0;
    }

    @Override
    public int GetDmCount() {
        return 0;
    }

    @Override
    public int DisableScreenSave() {
        return 0;
    }

    @Override
    public int DisablePowerSave() {
        return 0;
    }

    @Override
    public int SetMemoryHwndAsProcessId(int en) {
        return 0;
    }

    @Override
    public int FindShape(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir, Object x, Object y) {
        return 0;
    }

    @Override
    public String FindShapeE(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir) {
        return null;
    }

    @Override
    public String FindShapeEx(int x1, int y1, int x2, int y2, String offset_color, double sim, int dir) {
        return null;
    }

    @Override
    public String FindStrS(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) {
        return null;
    }

    @Override
    public String FindStrExS(int x1, int y1, int x2, int y2, String str, String color, double sim) {
        return null;
    }

    @Override
    public String FindStrFastS(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) {
        return null;
    }

    @Override
    public String FindStrFastExS(int x1, int y1, int x2, int y2, String str, String color, double sim) {
        return null;
    }

    @Override
    public String FindPicS(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir, Object x, Object y) {
        return null;
    }

    @Override
    public String FindPicExS(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir) {
        return null;
    }

    @Override
    public int ClearDict(int index) {
        return 0;
    }

    @Override
    public String GetMachineCodeNoMac() {
        return null;
    }

    @Override
    public int GetClientRect(int hwnd, Object x1, Object y1, Object x2, Object y2) {
        return 0;
    }

    @Override
    public int EnableFakeActive(int en) {
        return 0;
    }

    @Override
    public int GetScreenDataBmp(int x1, int y1, int x2, int y2, Object data, Object size) {
        return 0;
    }

    @Override
    public int EncodeFile(String file, String pwd) {
        return 0;
    }

    @Override
    public String GetCursorShapeEx(int type) {
        return null;
    }

    @Override
    public int FaqCancel() {
        return 0;
    }

    @Override
    public String IntToData(int int_value, int type) {
        return null;
    }

    @Override
    public String FloatToData(float float_value) {
        return null;
    }

    @Override
    public String DoubleToData(double double_value) {
        return null;
    }

    @Override
    public String StringToData(String string_value, int type) {
        return null;
    }

    @Override
    public int SetMemoryFindResultToFile(String file) {
        return 0;
    }

    @Override
    public int EnableBind(int en) {
        return 0;
    }

    @Override
    public int SetSimMode(int mode) {
        return 0;
    }

    @Override
    public int LockMouseRect(int x1, int y1, int x2, int y2) {
        return 0;
    }

    @Override
    public int SendPaste(int hwnd) {
        return 0;
    }

    @Override
    public int IsDisplayDead(int x1, int y1, int x2, int y2, int t) {
        return 0;
    }

    @Override
    public int GetKeyState(int vk) {
        return 0;
    }

    @Override
    public int CopyFile(String src_file, String dst_file, int over) {
        return 0;
    }

    @Override
    public int IsFileExist(String file) {
        return 0;
    }

    @Override
    public int DeleteFile(String file) {
        return 0;
    }

    @Override
    public int MoveFile(String src_file, String dst_file) {
        return 0;
    }

    @Override
    public int CreateFolder(String folder_name) {
        return 0;
    }

    @Override
    public int DeleteFolder(String folder_name) {
        return 0;
    }

    @Override
    public int GetFileLength(String file) {
        return 0;
    }

    @Override
    public String ReadFile(String file) {
        return null;
    }

    @Override
    public int WaitKey(int key_code, int time_out) {
        return 0;
    }

    @Override
    public int DeleteIni(String section, String key, String file) {
        return 0;
    }

    @Override
    public int DeleteIniPwd(String section, String key, String file, String pwd) {
        return 0;
    }

    @Override
    public int EnableSpeedDx(int en) {
        return 0;
    }

    @Override
    public int EnableIme(int en) {
        return 0;
    }

    @Override
    public int Reg(String code, String Ver) {
        return Dispatch.call(active, "Reg", code, Ver).getInt();
    }

    @Override
    public String SelectFile() {
        return null;
    }

    @Override
    public String SelectDirectory() {
        return null;
    }

    @Override
    public int LockDisplay(int lock) {
        return 0;
    }

    @Override
    public int FoobarSetSave(int hwnd, String file, int en, String header) {
        return 0;
    }

    @Override
    public String EnumWindowSuper(String spec1, int flag1, int type1, String spec2, int flag2, int type2, int sort) {
        return null;
    }

    @Override
    public int DownloadFile(String url, String save_file, int timeout) {
        return 0;
    }

    @Override
    public int EnableKeypadMsg(int en) {
        return 0;
    }

    @Override
    public int EnableMouseMsg(int en) {
        return 0;
    }

    @Override
    public int RegNoMac(String code, String Ver) {
        return 0;
    }

    @Override
    public int RegExNoMac(String code, String Ver, String ip) {
        return 0;
    }

    @Override
    public int SetEnumWindowDelay(int delay) {
        return 0;
    }

    @Override
    public int FindMulColor(int x1, int y1, int x2, int y2, String color, double sim) {
        return 0;
    }

    @Override
    public String GetDict(int index, int font_index) {
        return null;
    }
}
