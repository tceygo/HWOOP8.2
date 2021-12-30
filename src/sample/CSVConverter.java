package sample;

public interface CSVConverter {
	
	public String toCSVString();
	public Student fromCSVString(String csv);

}
