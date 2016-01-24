package Notepad;

public interface INotepad {
	void addText(int pageIndex, String textForAdding);
	void reWriteText(int pageIndex, String textForReWtiting);
	void deleteText(int pageIndex);
	void reviewOfPages();
	boolean searchWord(int pageIndex, String word);
	void printAllPagesWithDigits();
}
