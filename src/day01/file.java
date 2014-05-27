package day01;
/**
 * 用于保存每个文件中要记录的数据
 * @author Administrator
 *
 */
public class file {
	public String name;//文件名
	public int num;//记录数字
	public int countChar;//记录字母
	public int countBlank;//记录空格
	public int countRow;//记录行数
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCountChar() {
		return countChar;
	}
	public void setCountChar(int countChar) {
		this.countChar = countChar;
	}
	public int getCountBlank() {
		return countBlank;
	}
	public void setCountBlank(int countBlank) {
		this.countBlank = countBlank;
	}
	public int getCountRow() {
		return countRow;
	}
	public void setCountRow(int countRow) {
		this.countRow = countRow;
	}
	@Override
	public String toString() {
		return "file [name=" + name + ", num=" + num + ", countChar="
				+ countChar + ", countBlank=" + countBlank + ", countRow="
				+ countRow + "]";
	}
	
}
